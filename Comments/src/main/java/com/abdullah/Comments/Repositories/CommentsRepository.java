package com.abdullah.Comments.Repositories;

import com.abdullah.Comments.Entities.Comments;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CommentsRepository extends MongoRepository<Comments, Integer> {

    public Optional<Comments> findById(Integer id);
    public List<Comments> findByDoctorId(Integer doctorId);

}
