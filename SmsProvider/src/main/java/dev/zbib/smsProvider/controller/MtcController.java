package dev.zbib.smsProvider.controller;

import dev.zbib.smsProvider.model.request.SmsProviderRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mtc")
public class MtcController {

    @PostMapping()
    public ResponseEntity<String> sendSms(@RequestBody SmsProviderRequest messageReq) {
        System.out.println(messageReq.getPhoneNumber() +
                " says: " + messageReq.getMessage() +
                " talking in: " + messageReq.getLanguage());

        return ResponseEntity.ok("MTC: " + messageReq.getPhoneNumber() + "  " + messageReq.getMessage() + "/ " + messageReq.getLanguage());
    }
}
