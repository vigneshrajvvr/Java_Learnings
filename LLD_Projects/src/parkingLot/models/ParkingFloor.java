package parkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private String floorNumber;
    private List<ParkingSlot> parkingSlots;
    private List<Vehicle> allowedVehicles;
    private FloorStatus floorStatus;

}
