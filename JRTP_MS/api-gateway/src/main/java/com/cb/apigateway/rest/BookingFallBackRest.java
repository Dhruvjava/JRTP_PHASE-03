package com.cb.apigateway.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BookingFallBackRest {

    @GetMapping("/booking-fallback")
    public Mono<String> bookingFallback() {
        return Mono.just(
                        "Booking Service is not working(maintanance). Please try after some time.");
    }

}
