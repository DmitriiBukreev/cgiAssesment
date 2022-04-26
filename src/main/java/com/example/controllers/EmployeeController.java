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

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployeeToDatabase(employee);
    }

    @PostMapping("/del")
    public void delEmployee(@RequestBody Employee employee) {
        service.delEmployee(employee);
    }

    @PostMapping("/upd")
    public void updateEmployee(@RequestBody Employee employee) {
        service.updEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> findAll() {
        return service.findAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getUserById(@PathVariable("id") Long id) {
        return service.getById(id);
    }


}
