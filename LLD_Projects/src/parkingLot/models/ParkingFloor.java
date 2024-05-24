package parkingLot.models;

import java.util.List;

public class ParkingFloor {
    private Integer id;
    private Integer floorNubmer;
    private List<ParkingSlot> parkingSlots;
    private List<Vehicle> allowedVehicles;
    private FloorStatus status;

}
