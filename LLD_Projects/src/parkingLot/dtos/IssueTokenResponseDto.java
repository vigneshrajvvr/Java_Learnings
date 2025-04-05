package parkingLot.dtos;

import parkingLot.models.RequestStatus;
import parkingLot.models.Token;

public class IssueTokenResponseDto {
    private Token token;
    private RequestStatus requestStatus;
    private String failureMessage;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
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
