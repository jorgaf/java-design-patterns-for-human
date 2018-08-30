package com.j4loxa.j4edu.designpatterns.structural.composite;

public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}
