package parkingLot.strategies;

import parkingLot.models.Token;

import java.time.Duration;
import java.util.Date;

public class HourlyAmountGenerationStrategy implements AmountGenerationStrategy{
    @Override
    public int generateAmount(Token token, Date exitTime) {
        Date entryTime = token.getEntryTime();
        return (int) Duration.between(entryTime.toInstant(), exitTime.toInstant()).toHours();
    }
}
