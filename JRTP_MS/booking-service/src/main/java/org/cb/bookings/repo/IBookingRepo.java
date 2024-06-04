package org.cb.bookings.repo;

import org.cb.bookings.entity.BookingBO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IBookingRepo extends JpaRepository<BookingBO, UUID> {
}
