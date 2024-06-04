package org.cb.bookings.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.cb.Messages;
import org.cb.base.datars.BaseDataRs;
import org.cb.bookings.constants.MessageCodes;
import org.cb.bookings.datars.BookingDataRs;
import org.cb.bookings.entity.BookingBO;
import org.cb.bookings.enums.BookingStatus;
import org.cb.bookings.mapper.BookingMapper;
import org.cb.bookings.repo.IBookingRepo;
import org.cb.bookings.rq.BookingRq;
import org.cb.bookings.rs.BookingRs;
import org.cb.bookings.service.IBookingService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookingServiceImpl implements IBookingService {

    private final IBookingRepo repo;

    private final Messages messages;

    @Override
    public BaseDataRs createBooking(BookingRq rq) {
        Optional.of(log.isDebugEnabled())
                        .ifPresent(l -> log.debug("Executing createBooking(BookingRq) -> "));
        try {
            BookingBO booking = BookingBO.builder().bookingAmount(rq.getAmount())
                            .seatsSelected(rq.getSeatsBooked()).bookingStatus(BookingStatus.PENDING)
                            .movieId(rq.getMovieId()).userId(rq.getUserId())
                            .showDate(rq.getShowDate()).showTime(rq.getShowTime()).build();
            repo.save(booking);
            String message = messages.getMessageProperties(MessageCodes.MC_CREATED_SUCCESSFULL);
            BookingRs rs = BookingMapper.mapToBookingRs(booking);
            return new BookingDataRs(message, rs);
        } catch (Exception e) {
            log.error("Exception in createBooking(BookingRq) -> ", e);
            throw e;
        }
    }
}
