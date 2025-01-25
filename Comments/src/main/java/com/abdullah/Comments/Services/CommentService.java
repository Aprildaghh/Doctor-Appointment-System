package com.abdullah.Comments.Services;

import com.abdullah.Comments.Entities.Comments;
import com.abdullah.Comments.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {


    @Autowired
    private CommentsRepository commentsRepository;

    public List<Comments> findByDoctorId(Integer doctorId) {
        return commentsRepository.findByDoctorId(doctorId);
    }

    public void addComment(Comments comments)
    {
        commentsRepository.save(comments);

    }

}
