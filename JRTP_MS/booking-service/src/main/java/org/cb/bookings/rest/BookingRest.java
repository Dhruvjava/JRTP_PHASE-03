package org.cb.bookings.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.cb.bookings.rq.BookingRq;
import org.cb.bookings.service.IBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
@RequiredArgsConstructor
@Tag(name = "BOOKINGS-REST", description = "This is booking module functionality")
public class BookingRest {

    private final IBookingService service;

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody @Valid BookingRq rq){

        return ResponseEntity.ok(null);
    }

}
