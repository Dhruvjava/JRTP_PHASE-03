package org.cb.payment.entity;

import jakarta.persistence.*;
import lombok.*;
import org.cb.payment.enums.PaymentStatus;

import java.time.LocalDateTime;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private UUID bookingId;

    private PaymentStatus paymentStatus;

    private Double amount;

    private LocalDateTime paymentTime;

}
