package parkingLot.strategies;

import parkingLot.models.*;
import parkingLot.repositories.ParkingLotRepository;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{
    private ParkingLotRepository parkingLotRepository;

    public RandomSlotAssignmentStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }
    @Override
    public ParkingLot getSlot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.findParkingLotByGate(gate);

        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()) {
                if(parkingSlot.getSupportedVehicleTypes().contains(vehicleType) && parkingSlot.getSlotStatus().equals(SlotStatus.EMPTY)) {
                    return parkingLot;
                }
            }
        }

        return null;
    }
}
