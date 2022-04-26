package com.example.services;

import com.example.dao.EmployeeRepository;
import com.example.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.validation.Valid;
import java.util.List;

@Slf4j
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Long addEmployeeToDatabase(@Valid Employee employee) {
       var result= employeeRepository.save(employee);
        log.info("Added person:" + employee);
        return result.getId();
    }
   

    public Employee getById(Long id) {
        var item = employeeRepository.findById(id);
        if (item.isPresent()) {
            return item.get();
        }
        throw new IllegalArgumentException("User id mismatch");
    }


    public List<Employee> findAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }
    public void updEmployee(@Valid Employee employee) {
        employeeRepository.save(employee);
    }

    public void delEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
