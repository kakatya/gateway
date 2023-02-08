package ru.kakatya.gateway.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.kakatya.gateway.dtos.LoanApplicationRequestDTO;
import ru.kakatya.gateway.dtos.LoanOfferDTO;

import java.util.List;

@FeignClient(name = "${service.application.name}", url = "${service.application.url}")
public interface ApplicationServiceFeignClient {
    @PostMapping
    ResponseEntity<List<LoanOfferDTO>> getLoanOffers(@RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO);

    @PostMapping("/offer")
    ResponseEntity<Void> offerSelection(@RequestBody LoanOfferDTO loanOfferDTO);
}
