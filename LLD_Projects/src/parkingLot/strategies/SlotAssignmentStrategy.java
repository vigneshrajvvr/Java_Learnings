package parkingLot.strategies;

import parkingLot.models.Gate;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSlot;
import parkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
