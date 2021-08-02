package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

//    public Employee() {
//    }
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void raiseSalary(double increase) {
        salary += increase;
    }

    public void printEmployee() {
        System.out.println("Employee id: " + getEmpId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee Soc Sec #: " + getSsn());
        System.out.println("Employee salary: " + getSalary());
    }

}
