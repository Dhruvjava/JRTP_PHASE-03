package org.cb.bookings.service;

import org.cb.base.datars.BaseDataRs;
import org.cb.bookings.rq.BookingRq;

public interface IBookingService {

    public BaseDataRs createBooking(BookingRq rq);

}
