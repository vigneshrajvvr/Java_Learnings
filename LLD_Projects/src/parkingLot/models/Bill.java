package parkingLot.models;

import java.util.List;

public class Bill {
    private Integer id;
    private String exitTime;
    private Integer amount;
    private Token token;
    private Gate gate;
    private Operator operator;
    private List<Payment> payment;
}
