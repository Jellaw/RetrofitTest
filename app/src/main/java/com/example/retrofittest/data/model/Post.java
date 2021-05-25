package com.example.retrofittest.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Post {
    private int id;
    private String name;
    private String dob;
    private int accid;
    private String email;
    private String address;
    private String phone;
    private String position;
    private Double salary;

    public Post(String name, String dob, int accid, String email, String address, String phone, String position, Double salary) {
        this.name = name;
        this.dob = dob;
        this.accid = accid;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
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
}
