package org.cb.bookings.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.cb.base.datars.BaseDataRs;
import org.cb.bookings.rq.BookingRq;
import org.cb.bookings.service.IBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/booking")
@RequiredArgsConstructor
@Tag(name = "BOOKINGS-REST", description = "This is booking module functionality")
@Slf4j
public class BookingRest {

    private final IBookingService service;

    @PostMapping
    @Operation(summary = "CREATE-BOOKING", description = "Create Booking")
    public ResponseEntity<BaseDataRs> createBooking(@RequestBody @Valid BookingRq rq) {
        Optional.of(log.isDebugEnabled()).ifPresent(l -> log.debug(
                        "Executing RESTFull Service [POST : /api/v1/booking ] -> "));
        return ResponseEntity.ok(service.createBooking(rq));
    }

}
