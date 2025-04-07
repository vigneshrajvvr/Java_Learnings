package parkingLot.services;

import parkingLot.models.*;
import parkingLot.repositories.GateRepository;
import parkingLot.repositories.ParkingLotRepository;
import parkingLot.repositories.TokenRepository;
import parkingLot.repositories.VehicleRepository;
import parkingLot.strategies.SlotAssignmentStrategy;
import parkingLot.strategies.SlotAssignmentStrategyFactory;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TokenRepository tokenRepository;

    public TokenService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TokenRepository tokenRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.tokenRepository = tokenRepository;
    }
    public Token issueToken(Long gateId, VehicleType vehicleType, String vehicleNumber, String ownerName) {
        // Create a token
        Token generatedToken = new Token();
        // Set entry time
        generatedToken.setEntryTime(new Date());
        // Set the gate and operator
        Optional<Gate> generatedAt = gateRepository.findGateById(gateId);
        if(generatedAt.isEmpty()) {
            throw new RuntimeException("Invalid gate is entered");
        }
        generatedToken.setGeneratedAt(generatedAt.get());
        generatedToken.setOperatedBy(generatedAt.get().getOperator());
        // Set vehicle
        Optional<Vehicle> vehicle = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle = null;
        if(vehicle.isEmpty()) {
            Vehicle currentVehicle = new Vehicle();
            currentVehicle.setVehicleNumber(vehicleNumber);
            currentVehicle.setVehicleType(vehicleType);
            savedVehicle = vehicleRepository.save(currentVehicle);
        } else {
            savedVehicle = vehicle.get();
        }
        generatedToken.setVehicle(savedVehicle);
        // Assign a slot
        ParkingLot parkingLot = parkingLotRepository.findParkingLotByGate(generatedAt.get());
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory
                .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                .getSlot(parkingLot, vehicleType);
        generatedToken.setParkingSlot(parkingSlot);
        parkingSlot.setSlotStatus(SlotStatus.FILLED);

        Token savedToken = tokenRepository.save(generatedToken);

        // Return
        return savedToken;
    }
}
