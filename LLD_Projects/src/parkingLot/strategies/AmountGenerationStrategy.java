package parkingLot.strategies;

import parkingLot.models.Token;

import java.util.Date;

public interface AmountGenerationStrategy {
    public int generateAmount(Token token, Date entryTime);
}
