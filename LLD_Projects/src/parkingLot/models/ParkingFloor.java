package parkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private String floorNumber;
    private List<ParkingSlot> parkingSlots;
    private List<Vehicle> allowedVehicles;
    private FloorStatus floorStatus;

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<Vehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<Vehicle> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
