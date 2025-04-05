package parkingLot.strategies;

import parkingLot.models.SlotAssignmentStrategyType;
import parkingLot.repositories.ParkingLotRepository;

public class SlotAssignmentStrategyFactory {

    public static SlotAssignmentStrategy getSlotAssignmentStrategyByType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        if(slotAssignmentStrategyType.equals(SlotAssignmentStrategyType.RANDOM)) {
            return new RandomSlotAssignmentStrategy(new ParkingLotRepository());
        }

        return null;
    }
}
