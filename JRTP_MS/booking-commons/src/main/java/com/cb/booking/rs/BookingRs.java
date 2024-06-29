package com.cb.booking.rs;

import com.cb.booking.enums.BookingStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BookingRs {

    private UUID id;

    private String userId;

    private Integer movieId;

    private List<String> seatsBooked;

    private String showDate;

    private String showTime;

    private BookingStatus status;

    private Double amount;

}
