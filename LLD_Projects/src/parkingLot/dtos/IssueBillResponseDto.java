package parkingLot.dtos;

import parkingLot.models.Bill;
import parkingLot.models.RequestStatus;

public class IssueBillResponseDto {
    private Bill generatedBill;
    private RequestStatus requestStatus;
    private String failureMessage;

    public Bill getGeneratedBill() {
        return generatedBill;
    }

    public void setGeneratedBill(Bill generatedBill) {
        this.generatedBill = generatedBill;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
