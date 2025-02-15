package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.payment;

import java.util.Optional;

public interface paymentRepository extends JpaRepository<payment, Long> {
    Optional<payment> findByUserName(String userName);
}
