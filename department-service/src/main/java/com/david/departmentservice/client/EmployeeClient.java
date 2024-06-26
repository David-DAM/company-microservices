package com.david.departmentservice.client;

import com.david.departmentservice.model.Department;
import com.david.departmentservice.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/api/v1/employee/department/{id}")
    public List<Employee> findById(@PathVariable Long id);

}
