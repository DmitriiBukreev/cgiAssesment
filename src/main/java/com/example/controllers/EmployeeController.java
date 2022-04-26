package com.example.controllers;

import com.example.model.Employee;
import com.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployeeToDatabase(employee);
    }

    @GetMapping("/all")
    public List<Employee> findLongestEmail() {
        return service.findAllEmployees();
    }

    @GetMapping("/{userId}")
    public Employee getUserById(@PathVariable Long userId) {
        return service.getById(userId);
    }



}
