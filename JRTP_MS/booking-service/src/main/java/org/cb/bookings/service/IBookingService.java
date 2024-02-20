package org.cb.bookings.service;

import lombok.extern.slf4j.Slf4j;
import org.cb.base.datars.BaseDataRs;
import org.cb.bookings.rq.BookingRq;
import org.springframework.stereotype.Service;

public interface IBookingService {

    public BaseDataRs createBooking(BookingRq rq);

}
