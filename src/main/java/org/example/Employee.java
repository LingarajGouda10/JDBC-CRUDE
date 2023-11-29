package org.example;

public class Employee {
    private int id;
    private String name;
    private double salarry;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, double salarry, int age) {
        this.id = id;
        this.name = name;
        this.salarry = salarry;
        this.age = age;
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

    public double getSalarry() {
        return salarry;
    }

    public void setSalarry(double salarry) {
        this.salarry = salarry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
