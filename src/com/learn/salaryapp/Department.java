package com.learn.salaryapp;

/**
 * Created by Vitalik on 10.09.2016.
 */
public class Department implements Cloneable {
    private String nameOfdepartment;

    public Department(String nameOfdepartment) {
        this.nameOfdepartment = nameOfdepartment;
    }

    public String getNameOfdepartment() {
        return nameOfdepartment;
    }

    public void setNameOfdepartment(String nameOfdepartment) {
        this.nameOfdepartment = nameOfdepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameOfdepartment='" + nameOfdepartment + '\'' +
                '}';
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        return (Department) super.clone();
    }
}
