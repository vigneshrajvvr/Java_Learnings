package parkingLot;

import parkingLot.controllers.TokenController;
import parkingLot.dtos.IssueTokenRequestDto;
import parkingLot.dtos.IssueTokenResponseDto;
import parkingLot.models.ParkingLot;
import parkingLot.repositories.GateRepository;
import parkingLot.repositories.ParkingLotRepository;
import parkingLot.repositories.TokenRepository;
import parkingLot.repositories.VehicleRepository;
import parkingLot.services.TokenService;

public class Client {
    public static void main(String args[]) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TokenRepository tokenRepository = new TokenRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TokenService tokenService = new TokenService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                tokenRepository

        );

        TokenController tokenController = new TokenController(tokenService);
    }
}

// Controllers
// Services
// Repositories
