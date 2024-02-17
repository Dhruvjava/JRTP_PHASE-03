package org.cb.booking.rest;

import org.cb.booking.clients.PaymentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class Booking {

    @Autowired
    private PaymentClient client;

    @GetMapping
    public ResponseEntity<String> test(){
        return client.doPayment();
    }

}
