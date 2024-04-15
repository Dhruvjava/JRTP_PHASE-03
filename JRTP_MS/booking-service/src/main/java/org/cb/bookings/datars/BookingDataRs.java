package org.cb.bookings.datars;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.cb.base.datars.BaseDataRs;
import org.cb.bookings.rs.BookingRs;

@Setter
@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BookingDataRs extends BaseDataRs {

    private BookingRs booking;

    public BookingDataRs(String message, BookingRs booking) {
        super(message);
        this.booking = booking;
    }

    public BookingDataRs(String message) {
        super(message);
    }

}
