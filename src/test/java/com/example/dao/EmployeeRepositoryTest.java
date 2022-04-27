package com.example.dao;

import com.example.model.Department;
import com.example.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
@Slf4j
@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void updEmployee() {
        var employee = new Employee();
        employee.setId(6L);
        employee.setName("One");
        employee.setLastname("Two");
        employee.setBirthdate(LocalDate.of(1992, 2, 4));
        employee.setDepartment(Department.personal);
        log.info(employee.getName());
        var savedUser = employeeRepository.save(employee);
        employee.setId(6L);
        savedUser.setName("Tobias");
        savedUser.setLastname("Miller");
        savedUser.setBirthdate(LocalDate.of(1996, 12, 1));
        savedUser.setDepartment(Department.entwicklung);
        log.info(savedUser.getName());
        assertNotEquals(employee, savedUser);
    }

}