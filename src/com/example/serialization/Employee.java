package com.example.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String Name;
    private int age;

//constructor
    public Employee(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
