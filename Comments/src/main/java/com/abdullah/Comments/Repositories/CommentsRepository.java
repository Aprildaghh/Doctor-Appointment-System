package com.abdullah.Comments.Repositories;

import com.abdullah.Comments.Entities.Comments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentsRepository extends MongoRepository<Comments, Integer> {

    public List<Comments> findByDoctorId(int doctorId);
}
