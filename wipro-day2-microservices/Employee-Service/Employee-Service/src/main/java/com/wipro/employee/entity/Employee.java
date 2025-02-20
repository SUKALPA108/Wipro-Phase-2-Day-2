package com.wipro.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private Long id;
    private String name;
    private String designation;
    private Double salary;
    private int pid;
    private long pcode;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(Long id, String name, String designation, Double salary, int pid, long pcode) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.pid = pid;
        this.pcode = pcode;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public long getPcode() {
        return pcode;
    }

    public void setPcode(long pcode) {
        this.pcode = pcode;
    }

    // toString() method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", pid=" + pid +
                ", pcode=" + pcode +
                '}';
    }
}
