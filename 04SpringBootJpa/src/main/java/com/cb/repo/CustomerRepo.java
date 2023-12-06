package com.cb.repo;

import com.cb.entity.CustomerBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerBO, Integer> {
}
