package org.cb.payment.rest;

import org.cb.payment.rq.PaymentRq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentRest {

    @GetMapping
    public ResponseEntity<String> doPayment(){
        return ResponseEntity.ok("Payment Successfully Done !!!");
    }

    @PostMapping
    public void createPayment(@RequestBody PaymentRq rq){

    }

}
