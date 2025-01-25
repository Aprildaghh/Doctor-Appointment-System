package com.abdullah.Appointment.Entities;

import com.abdullah.Appointment.RequestTypes.UserRequest;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.sql.Time;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="fullname")
    private String fullname;

    @Column(name="isdoctor")
    private int isDoctor;

    @Column(name="areaofinterest")
    private String areaofinterest;

    @Column(name="availabledays")
    private int availabledays;

    @Column(name="availablehour")
    private Time availablehour;

    @Column(name="availablehour_end")
    private Time availablehour_end;

    @Column(name="address")
    private String address;

    public User() {
    }

    public User(UserRequest request) {
        this.id = 0;
        this.email = request.getEmail();
        this.fullname = request.getFullname();
        this.isDoctor = request.getIsDoctor();
        this.areaofinterest = request.getAreaofinterest();
        this.availabledays = request.getAvailabledays();
        this.availablehour = request.getAvailablehour();
        this.availablehour_end = request.getAvailablehour_end();
        this.address = request.getAddress();
    }

    public User(int id, String email, String fullname, int isDoctor, String areaofinterest, int availabledays, Time availablehour, Time availablehour_end, String address) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.isDoctor = isDoctor;
        this.areaofinterest = areaofinterest;
        this.availabledays = availabledays;
        this.availablehour = availablehour;
        this.availablehour_end = availablehour_end;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(int isDoctor) {
        this.isDoctor = isDoctor;
    }

    public String getAreaofinterest() {
        return areaofinterest;
    }

    public void setAreaofinterest(String areaofinterest) {
        this.areaofinterest = areaofinterest;
    }

    public int getAvailabledays() {
        return availabledays;
    }

    public void setAvailabledays(int availabledays) {
        this.availabledays = availabledays;
    }

    public Time getAvailablehour() {
        return availablehour;
    }

    public void setAvailablehour(Time availablehour) {
        this.availablehour = availablehour;
    }

    public Time getAvailablehour_end() {
        return availablehour_end;
    }

    public void setAvailablehour_end(Time availablehour_end) {
        this.availablehour_end = availablehour_end;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
