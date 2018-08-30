package com.j4loxa.j4edu.designpatterns.structural.composite;

public class Designer implements Employee {
    private String name;
    private double salary;

    public Designer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Designer";
    }

    @Override
    public String getName() {
        return name;
    }
}
