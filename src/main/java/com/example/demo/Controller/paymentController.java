package com.example.demo.Controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.paymentService;
import com.example.demo.models.payment;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class paymentController {
    private final paymentService employeeService;

    public paymentController(paymentService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<payment> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public payment createEmployee(@RequestBody payment employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/login")
    public Optional<payment> login(@RequestBody payment employee) {
        return employeeService.getEmployeeByUserName(employee.getUserName());
    }
}
