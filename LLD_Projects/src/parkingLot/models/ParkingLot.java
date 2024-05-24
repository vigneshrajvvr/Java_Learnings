package parkingLot.models;

import java.util.List;

public class ParkingLot {
    private Integer id;
    private Integer capacity;
    private List<ParkingFloor> floors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
}
