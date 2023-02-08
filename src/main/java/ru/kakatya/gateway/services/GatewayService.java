package ru.kakatya.gateway.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kakatya.gateway.dtos.FinishRegistrationRequestDto;
import ru.kakatya.gateway.dtos.LoanApplicationRequestDTO;
import ru.kakatya.gateway.dtos.LoanOfferDTO;
import ru.kakatya.gateway.exceptions.PrescoringException;
import ru.kakatya.gateway.exceptions.ScoringException;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GatewayService {
    @Autowired
    private ApplicationServiceFeignClient applicationServiceFeignClient;
    @Autowired
    private DealServiceFeignClient dealServiceFeignClient;

    public List<LoanOfferDTO> createLoanOffers(LoanApplicationRequestDTO loanApplicationRequestDTO) throws PrescoringException {
        return applicationServiceFeignClient.getLoanOffers(loanApplicationRequestDTO).getBody();
    }

    public void choseLoanOffer(LoanOfferDTO loanOfferDTO) {
        applicationServiceFeignClient.offerSelection(loanOfferDTO);
    }

    public void finishRegister(FinishRegistrationRequestDto finishRegistrationRequestDto, Long applicationId) throws ScoringException {
        dealServiceFeignClient.completeRegistration(finishRegistrationRequestDto, applicationId);
    }

    public void requestDocumentCreation(Long applicationId) throws NoSuchElementException {
        dealServiceFeignClient.requestSendingDocuments(applicationId);
    }

    public void requestSignDocument(Long applicationId) throws NoSuchElementException {
        dealServiceFeignClient.requestSigningOfDocuments(applicationId);
    }

    public void signDocument(Long applicationId, String sesCode) {
        dealServiceFeignClient.signDocuments(applicationId, sesCode);
    }
}
