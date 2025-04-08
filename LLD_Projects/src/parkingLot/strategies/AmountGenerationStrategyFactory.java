package parkingLot.strategies;

import parkingLot.models.AmountGenerationType;

public class AmountGenerationStrategyFactory {

    public static AmountGenerationStrategy getAmountGenerationStrategyByType(AmountGenerationType amountGenerationType) {
        if(amountGenerationType.equals(AmountGenerationType.HOURLY)) {
            return new HourlyAmountGenerationStrategy();
        }
        return null;
    }
}
