package org.cb.payment.repo;

import org.cb.payment.entity.PaymentBO;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IPaymentRepo extends CrudRepository<PaymentBO, UUID> {
}
