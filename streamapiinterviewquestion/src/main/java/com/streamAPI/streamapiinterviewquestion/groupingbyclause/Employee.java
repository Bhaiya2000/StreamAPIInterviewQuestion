package com.streamAPI.streamapiinterviewquestion.groupingbyclause;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private  int salary1;
    private String department;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, int salary1, String department) {
        this.id = id;
        this.name = name;
        this.salary1 = salary1;
        this.department = department;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalary1() {
        return salary1;
    }

    public void setSalary1(int salary1) {
        this.salary1 = salary1;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
