package parkingLot.controllers;


import parkingLot.dtos.IssueTokenRequestDto;
import parkingLot.dtos.IssueTokenResponseDto;
import parkingLot.models.RequestStatus;
import parkingLot.models.Token;
import parkingLot.services.TokenService;

import java.util.Date;

public class TokenController {
    private TokenService tokenService;
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    public IssueTokenResponseDto issueToken(IssueTokenRequestDto issueTokenRequestDto) {
        IssueTokenResponseDto issueTokenResponseDto = new IssueTokenResponseDto();
        try {
            Token generatedToken = tokenService.issueToken(issueTokenRequestDto.getGateId(),
                    issueTokenRequestDto.getVehicleType(),
                    issueTokenRequestDto.getVehicleNumber(),
                    issueTokenRequestDto.getOwnerName());
            issueTokenResponseDto.setToken(generatedToken);
            issueTokenResponseDto.setRequestStatus(RequestStatus.SUCCESS);
        } catch (Exception ex) {
            issueTokenResponseDto.setRequestStatus(RequestStatus.FAILURE);
            issueTokenResponseDto.setFailureMessage(ex.getMessage());
        }
        return issueTokenResponseDto;
    }
}
