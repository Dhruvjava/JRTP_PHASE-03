package org.cb.bookings.mapper;

import lombok.extern.slf4j.Slf4j;
import org.cb.bookings.entity.BookingBO;
import org.cb.bookings.rs.BookingRs;
import org.cb.utils.LocalDateTimeUtils;
import org.cb.utils.Utils;

import java.util.Optional;

@Slf4j
public class BookingMapper {

    private BookingMapper() {
    }

    public static BookingRs mapToBookingRs(BookingBO booking) {
        Optional.of(log.isDebugEnabled())
                        .ifPresent(l -> log.debug("Executing mapToBookingRs(Booking) -> "));
        try {
            BookingRs rs = new BookingRs();
            if (booking.getId() != null) {
                rs.setId(booking.getId());
            }
            if (Utils.isNotEmpty(booking.getUserId())) {
                rs.setUserId(booking.getUserId());
            }
            if (booking.getMovieId() != null) {
                rs.setMovieId(booking.getMovieId());
            }
            if (Utils.isNotEmpty(booking.getBookingStatus().name())) {
                rs.setStatus(booking.getBookingStatus());
            }
            if (Utils.isNotEmpty(booking.getSeatsSelected())) {
                rs.setSeatsBooked(booking.getSeatsSelected());
            }
            if (booking.getBookingAmount() != null) {
                rs.setAmount(booking.getBookingAmount());
            }
            if (booking.getShowDate() != null) {
                rs.setShowDate(LocalDateTimeUtils.convertLdToDateString(booking.getShowDate(),
                                LocalDateTimeUtils.dd_MMM_yyyy));
            }
            if (booking.getShowTime() != null) {
                rs.setShowTime(LocalDateTimeUtils.convertLtToString(booking.getShowTime(),
                                LocalDateTimeUtils.HH_mm));
            }
            return rs;
        } catch (Exception e) {
            log.error("Exception in mapToBookingRs(Booking) -> ", e);
            throw e;
        }
    }
}
