package com.j4loxa.j4edu.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private List<Employee> employees;

    public Organization() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double getNetSalaries() {
        return employees.stream().mapToDouble(e -> e.getSalary()).sum();
    }
}
