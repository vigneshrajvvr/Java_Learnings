package parkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private Integer capacity;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> listOfVehicleTypes;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getListOfVehicleTypes() {
        return listOfVehicleTypes;
    }

    public void setListOfVehicleTypes(List<VehicleType> listOfVehicleTypes) {
        this.listOfVehicleTypes = listOfVehicleTypes;
    }
}
