package org.cb.bookings.enums;

public enum BookingStatus {

    PENDING,     // The initial status when a booking request is submitted

    CANCELLED,   // The booking request has been cancelled, and the reserved seats are released

    CONFIRMED,   // The booking is confirmed after payment, and the tickets are issued

    REFUNDED     // The booking was cancelled and the refund has been processed

}
