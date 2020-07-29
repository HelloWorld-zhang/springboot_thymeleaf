package com.zhang.entity;

import java.util.Date;

public class Emp {
    private String id;
    private String name;
    private double salary;
    private int age;
    private Date bir;

    @Override
    public String toString() {
        return "Emp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", bir=" + bir +
                '}';
    }
    public Emp() {
        super();
    }

    public Emp(String id, String name, double salary, int age, Date bir) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.bir = bir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
