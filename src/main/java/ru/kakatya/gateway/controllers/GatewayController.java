package ru.kakatya.gateway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import ru.kakatya.gateway.dtos.FinishRegistrationRequestDto;
import ru.kakatya.gateway.dtos.LoanApplicationRequestDTO;
import ru.kakatya.gateway.dtos.LoanOfferDTO;
import ru.kakatya.gateway.services.GatewayService;

import java.util.List;
import java.util.Optional;

@RestController
public class GatewayController implements ApplicationApi, DocumentApi {
    @Autowired
    private GatewayService gatewayService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ApplicationApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> finishRegistration(Long applicationId, FinishRegistrationRequestDto finishRegistrationRequestDto) {
        gatewayService.finishRegister(finishRegistrationRequestDto, applicationId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> applyLoanOffer(LoanOfferDTO loanOfferDTO) {
        gatewayService.choseLoanOffer(loanOfferDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<LoanOfferDTO>> createApplication(LoanApplicationRequestDTO loanApplicationRequestDTO) {
        return ResponseEntity.ok().body(gatewayService.createLoanOffers(loanApplicationRequestDTO));
    }


    @Override
    public ResponseEntity<Void> requestDocuments(Long applicationId) {
        gatewayService.requestDocumentCreation(applicationId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> requestSesCode(Long applicationId) {
        gatewayService.requestSignDocument(applicationId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> sendSesCode(Long applicationId, String sesCode) {
        gatewayService.signDocument(applicationId, sesCode);
        return ResponseEntity.ok().build();
    }
}
