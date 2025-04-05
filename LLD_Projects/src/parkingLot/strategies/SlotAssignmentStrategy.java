package parkingLot.strategies;

import parkingLot.models.Gate;
import parkingLot.models.ParkingLot;
import parkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingLot getSlot(Gate gate, VehicleType vehicleType);
}
