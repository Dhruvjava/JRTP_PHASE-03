package org.cb.payment.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentRest {

    @GetMapping
    public ResponseEntity<String> doPayment(){
        return ResponseEntity.ok("Payment Successfully Done !!!");
    }

}
