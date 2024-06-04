package org.cb.payment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.cb.payment.enums.PaymentStatus;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "payments")
public class PaymentBO {

    @Id
    private String id;

    private UUID bookingId;

    private PaymentStatus paymentStatus;

    private Double amount;

    private LocalDateTime paymentTime;

}
