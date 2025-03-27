package parkingLot.models;

import java.util.Date;

public class Payment extends BaseModel {
    private PaymentMode mode;
    private Double amount;
    private Date paymentDate;
    private PaymentStatus paymentStatus;
    private int refNumber;
}
