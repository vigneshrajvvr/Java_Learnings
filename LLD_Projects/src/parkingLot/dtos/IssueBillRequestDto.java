package parkingLot.dtos;

import parkingLot.models.Gate;
import parkingLot.models.Payment;
import parkingLot.models.Token;

import java.util.List;

public class IssueBillRequestDto {
    private Token token;
    private Gate gate;
    private List<Payment> payments;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
