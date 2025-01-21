package com.abdullah.Comments.Controllers;

import com.abdullah.Comments.Entities.Comments;
import com.abdullah.Comments.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class MainController {

    @Autowired
    private CommentsRepository commentsRepository;

    @GetMapping("/getAllCommentsForDoctor")
    public List<Comments> getAllCommentsForDoctorId(@RequestParam int doctorId) {
        return commentsRepository.findByDoctorId(doctorId);
    }

    // TODO: ha bunları git request body'den al
    @PostMapping("/commentForDoctor")
    public void addCommentForDoctorId(@RequestParam int doctorId, @RequestParam String comment) {
        // add the comment
    }

    @PostMapping("/rateDoctor")
    public void addRatingForDoctorId(@RequestParam int doctorId, @RequestParam int rating) {
        // add the rating
    }





}
