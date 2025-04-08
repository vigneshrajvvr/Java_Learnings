package parkingLot.services;

import parkingLot.models.*;
import parkingLot.repositories.BillRepository;
import parkingLot.repositories.ParkingLotRepository;
import parkingLot.strategies.AmountGenerationStrategyFactory;

import java.util.Date;
import java.util.List;

public class BillService {
    private ParkingLotRepository parkingLotRepository;

    private BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Bill issueBill(Token token, Gate gate, List<Payment> payments) {
        Bill generatedBill = new Bill();
        generatedBill.setExitTime(new Date());

        ParkingLot parkingLot = parkingLotRepository.findParkingLotByGate(gate);
        int amount = AmountGenerationStrategyFactory.getAmountGenerationStrategyByType(parkingLot.getAmountGenerationType()).generateAmount(token, generatedBill.getExitTime());
        generatedBill.setAmount(amount);

        generatedBill.setToken(token);

        generatedBill.setGate(gate);

        generatedBill.setOperator(gate.getOperator());

        generatedBill.setPayments(payments);

        Bill savedBill = billRepository.save(generatedBill);

        return savedBill;
    }
}
