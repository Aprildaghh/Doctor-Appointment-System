package com.abdullah.Comments.Controllers;

import com.abdullah.Comments.Entities.Comments;
import com.abdullah.Comments.Repositories.CommentsRepository;
import com.abdullah.Comments.RequestTypes.CommentDoctor;
import com.abdullah.Comments.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;
import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class MainController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/getAllCommentsForDoctor/{doctorId}")
    public List<Comments> getAllCommentsForDoctorId(@PathVariable int doctorId) {
        return commentService.findByDoctorId(doctorId);
    }

    @PostMapping("/commentDoctor")
    public void addCommentForDoctorId(@RequestBody CommentDoctor request) {
        Comments comment = new Comments(request.getDoctorId(), request.getUserId(), request.getComment(), request.getRating());
        commentService.addComment(comment);
    }

}
