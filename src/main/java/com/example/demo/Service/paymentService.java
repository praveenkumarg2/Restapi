package com.example.demo.Service;


import org.springframework.stereotype.Service;

import com.example.demo.Repository.paymentRepository;
import com.example.demo.models.payment;

import java.util.List;
import java.util.Optional;

@Service
public class paymentService {
    private final paymentRepository employeeRepository;

    public paymentService(paymentRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<payment> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public payment saveEmployee(payment employee) {
        return employeeRepository.save(employee);
    }

    public Optional<payment> getEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }
}
