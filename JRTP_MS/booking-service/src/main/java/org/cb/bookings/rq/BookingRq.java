package org.cb.bookings.rq;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cb.bookings.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingRq {

    private UUID id;

    @NotNull(message = "Please Enter User id")
    private String userId;

    @NotNull(message = "Please Enter Movie id")
    private Integer movieId;

    @NotNull(message = "User must have booked at least 1 seat")
    private List<String> seatsBooked;

    @NotNull(message = "Please Enter show date")
    private LocalDate showDate;

    @NotNull(message = "Please Enter show time")
    private LocalTime showTime;

    private BookingStatus status;

    @NotNull(message = "Booking amount is mandatory")
    @Positive(message = "Amount must be greater than zero")
    private Double amount;

}
