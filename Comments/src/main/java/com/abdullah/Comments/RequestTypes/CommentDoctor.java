package com.abdullah.Comments.RequestTypes;

import lombok.*;


public class CommentDoctor {

    private Integer doctorId;
    private Integer userId;
    private String comment;
    private Integer rating;

    public CommentDoctor() {
    }

    public CommentDoctor(Integer doctorId, Integer userId, String comment, Integer rating) {
        this.doctorId = doctorId;
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getComment() {
        return comment;
    }

    public Integer getRating() {
        return rating;
    }
}
