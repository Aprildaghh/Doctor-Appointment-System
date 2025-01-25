package com.abdullah.Appointment.RequestTypes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;

public class UserRequest {

    private String email;
    private String fullname;
    private int isDoctor;
    private String areaofinterest;
    private int availabledays;
    private Time availablehour;
    private Time availablehour_end;
    private String address;

    public UserRequest() {
    }

    public UserRequest(String email, String fullname, int isDoctor, String areaofinterest, int availabledays, Time availablehour, Time availablehour_end, String address) {
        this.email = email;
        this.fullname = fullname;
        this.isDoctor = isDoctor;
        this.areaofinterest = areaofinterest;
        this.availabledays = availabledays;
        this.availablehour = availablehour;
        this.availablehour_end = availablehour_end;
        this.address = address;
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
