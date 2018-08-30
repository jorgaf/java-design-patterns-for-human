package com.j4loxa.j4edu.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        var developer = new Developer("John", 5000);
        var designer = new Designer("Arya", 5000);

        var organization = new Organization();
        organization.addEmployee(developer);
        organization.addEmployee(designer);

        System.out.printf("Net salary of Employees in Organization is %.2f\n", organization.getNetSalaries());
    }
}
