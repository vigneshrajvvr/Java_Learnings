package parkingLot.controllers;

import parkingLot.dtos.IssueBillRequestDto;
import parkingLot.dtos.IssueBillResponseDto;
import parkingLot.models.Bill;
import parkingLot.models.RequestStatus;
import parkingLot.services.BillService;

public class BillController {

    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public IssueBillResponseDto issueBill(IssueBillRequestDto issueBillRequestDto) {
        IssueBillResponseDto responseDto = new IssueBillResponseDto();
        try {
            Bill generatedBill = billService.issueBill(issueBillRequestDto.getToken(),
                    issueBillRequestDto.getGate(),
                    issueBillRequestDto.getPayments());
            responseDto.setRequestStatus(RequestStatus.SUCCESS);
        } catch (Exception ex) {
            responseDto.setRequestStatus(RequestStatus.FAILURE);
            responseDto.setFailureMessage(ex.getMessage());
        }

        return responseDto;
    }
}
