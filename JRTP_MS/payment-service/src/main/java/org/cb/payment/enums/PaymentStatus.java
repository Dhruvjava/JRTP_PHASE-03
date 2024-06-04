package org.cb.payment.enums;

public enum PaymentStatus {

    PENDING, //The Booking request is pending payment confirmation
    APPROVED, // Payment has been successfully processed and confirmed
    REFUND, // Payment was successfully refunded for a cancelled booking
    FAILED // Payment processing failed, And the user need to retry the payment
}
