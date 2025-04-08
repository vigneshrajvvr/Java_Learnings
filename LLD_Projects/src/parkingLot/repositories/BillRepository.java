package parkingLot.repositories;

import parkingLot.models.Bill;
import parkingLot.models.Token;

import java.util.Map;
import java.util.TreeMap;

public class BillRepository {
    private Map<Long, Bill> bills = new TreeMap<>();

    private Long previousId = 0L;
    public Bill save(Bill bill) {
        previousId += 1;
        bill.setId(previousId);
        bills.put(previousId, bill);
        return bill;
    }
}
