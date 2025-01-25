package com.abdullah.Appointment.Repositories;

import com.abdullah.Appointment.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findByFullnameContaining(String containing);
    public List<User> findByAddressContaining(String containing);
    public List<User> findByAreaofinterestContaining(String containing);

}
