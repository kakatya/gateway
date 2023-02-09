package ru.kakatya.gateway.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    private static final Logger LOGGER = LogManager.getLogger(GatewayService.class);
    @Autowired
    private ApplicationServiceFeignClient applicationServiceFeignClient;
    @Autowired
    private DealServiceFeignClient dealServiceFeignClient;

    public List<LoanOfferDTO> createLoanOffers(LoanApplicationRequestDTO loanApplicationRequestDTO) throws PrescoringException {
        LOGGER.info("Create loanOffers");
        return applicationServiceFeignClient.getLoanOffers(loanApplicationRequestDTO).getBody();
    }

    public void choseLoanOffer(LoanOfferDTO loanOfferDTO) {
        LOGGER.info("Apply loanOffers");
        applicationServiceFeignClient.offerSelection(loanOfferDTO);
    }

    public void finishRegister(FinishRegistrationRequestDto finishRegistrationRequestDto, Long applicationId) throws ScoringException, NoSuchElementException {
        LOGGER.info("Finish Registration");
        dealServiceFeignClient.completeRegistration(finishRegistrationRequestDto, applicationId);
    }

    public void requestDocumentCreation(Long applicationId) throws NoSuchElementException {
        LOGGER.info("Request loan Documents");
        dealServiceFeignClient.requestSendingDocuments(applicationId);
    }

    public void requestSignDocument(Long applicationId) throws NoSuchElementException {
        LOGGER.info("Request Ses-code");
        dealServiceFeignClient.requestSigningOfDocuments(applicationId);
    }

    public void signDocument(Long applicationId, String sesCode) throws NoSuchElementException{
        LOGGER.info("Sign loan documents");
        dealServiceFeignClient.signDocuments(applicationId, sesCode);
    }
}
