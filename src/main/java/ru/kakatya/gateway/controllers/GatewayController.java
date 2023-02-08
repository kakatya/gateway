package ru.kakatya.gateway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kakatya.gateway.dtos.FinishRegistrationRequestDto;
import ru.kakatya.gateway.dtos.LoanApplicationRequestDTO;
import ru.kakatya.gateway.dtos.LoanOfferDTO;
import ru.kakatya.gateway.services.GatewayService;

import java.util.List;

@RestController
public class GatewayController {
    @Autowired
    private GatewayService gatewayService;

    @PostMapping("/application")
    public ResponseEntity<List<LoanOfferDTO>> createLoanOffers(@RequestBody LoanApplicationRequestDTO applicationRequestDTO) {
        return ResponseEntity.ok().body(gatewayService.createLoanOffers(applicationRequestDTO));
    }

    @PostMapping("/application/apply")
    public ResponseEntity<Void> applyOffer(@RequestBody LoanOfferDTO loanOfferDTO) {
        gatewayService.choseLoanOffer(loanOfferDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/application/registration/{applicationId}")
    public ResponseEntity<Void> finishRegister(@RequestBody FinishRegistrationRequestDto registrationRequestDto, @PathVariable Long applicationId) {
        gatewayService.finishRegister(registrationRequestDto, applicationId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/document/{applicationId}")
    public ResponseEntity<Void> requestCreationDocuments(@PathVariable Long applicationId) {
        gatewayService.requestDocumentCreation(applicationId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/document/{applicationId}/sign")
    public ResponseEntity<Void> requestSesCode(@PathVariable Long applicationId) {
        gatewayService.requestSignDocument(applicationId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/document/{applicationId}/sign/{sesCode}")
    public ResponseEntity<Void> verifySesCode(@PathVariable Long applicationId, @PathVariable String sesCode) {
        gatewayService.signDocument(applicationId, sesCode);
        return ResponseEntity.ok().build();
    }
}
