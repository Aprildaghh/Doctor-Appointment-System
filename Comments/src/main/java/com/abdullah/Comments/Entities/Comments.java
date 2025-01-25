package com.abdullah.Comments.Entities;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
public class Comments {

    @Id
    private String _id;
    private Integer doctorId;
    private Integer userId;
    private String comment;
    private Integer rating;
    private String _class;

    public Comments(Integer doctorId, Integer userId, String comment, Integer rating) {
        this.doctorId = doctorId;
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
    }

    public Comments() {
    }

    public Comments(String _id, Integer doctorId, Integer userId, String comment, Integer rating, String _class) {
        this._id = _id;
        this.doctorId = doctorId;
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
        this._class = _class;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
}
