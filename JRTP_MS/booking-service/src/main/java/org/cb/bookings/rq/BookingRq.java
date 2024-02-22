package org.cb.bookings.rq;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cb.bookings.constants.ErrorCodes;
import org.cb.bookings.enums.BookingStatus;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class BookingRq {

    private UUID id;

    @NotNull(message = ErrorCodes.EC_REQUIRED_BOOKING_USER_ID)
    private String userId;

    @NotNull(message = ErrorCodes.EC_REQUIRED_BOOKING_MOVIE_ID)
    private Integer movieId;

    @NotNull(message = ErrorCodes.EC_REQUIRED_BOOKING_SEATS)
    private List<String> seatsBooked;

    @NotNull(message = ErrorCodes.EC_REQUIRED_BOOKING_SHOW_DATE)
    private LocalDate showDate;

    @NotNull(message = ErrorCodes.EC_REQUIRED_BOOKING_SHOW_TIME)
    private LocalTime showTime;

    private BookingStatus status;

    @NotNull(message = ErrorCodes.EC_REQUIRED_BOOKING_AMOUNT)
    @Positive(message = ErrorCodes.EC_INVALID_BOOKING_AMOUNT)
    private Double amount;

}
