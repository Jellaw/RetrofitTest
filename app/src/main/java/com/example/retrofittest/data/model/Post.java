package com.example.retrofittest.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Post {
    private int id;
    private String name;
    private Date dob;
    private int age;
    private String email;
    private String address;
    private String phone;
    private String position;
    private Double salary;
    private int accountID;

    public Post(int id, String name, Date dob, int age, String email, String address, String phone, String position, Double salary, int accountID) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.accountID = accountID;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        accountID = accountID;
    }
}
