package parkingLot.models;

import java.util.Date;
import java.util.List;

public class Token extends BaseModel {
    private Integer tokenNumber;
    private Date entryTime;
    private Operator operatedBy;
    private Gate generatedAt;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;

    public Integer getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(Integer tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Operator getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(Operator operatedBy) {
        this.operatedBy = operatedBy;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
