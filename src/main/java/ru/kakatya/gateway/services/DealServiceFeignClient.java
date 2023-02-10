package ru.kakatya.gateway.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.kakatya.gateway.model.FinishRegistrationRequestDto;

@FeignClient(name = "${service.deal.name}", url = "${service.deal.url}")
public interface DealServiceFeignClient {
    @PutMapping("/calculate/{applicationId}")
    ResponseEntity<Void> completeRegistration(@RequestBody FinishRegistrationRequestDto registrationRequestDto, @PathVariable long applicationId);

    @PostMapping("/document/{applicationId}/send")
    ResponseEntity<Void> requestSendingDocuments(@PathVariable Long applicationId);

    @PostMapping("/document/{applicationId}/sign")
    ResponseEntity<Void> requestSigningOfDocuments(@PathVariable Long applicationId);

    @PostMapping("/document/{applicationId}/{code}")
    ResponseEntity<Void> signDocuments(@PathVariable Long applicationId, @PathVariable String code);
}
