package org.cb.bookings.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.cb.base.datars.BaseDataRs;
import org.cb.bookings.rq.BookingRq;
import org.cb.bookings.service.IBookingService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookingServiceImpl implements IBookingService {
    @Override
    public BaseDataRs createBooking(BookingRq rq) {
        return null;
    }
}
