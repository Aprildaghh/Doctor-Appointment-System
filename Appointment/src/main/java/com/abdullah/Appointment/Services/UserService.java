package com.abdullah.Appointment.Services;

import com.abdullah.Appointment.Entities.User;
import com.abdullah.Appointment.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        userRepository.save(user);
    }

    public List<User> getDoctorsWithWhereClause(String where) {
        List<User> result;
        result = userRepository.findByAddressContaining(where);
        result.addAll(userRepository.findByFullnameContaining(where));
        result.addAll(userRepository.findByAreaofinterestContaining(where));
        return result;
    }

    public Optional<User> getDoctorById(int id) {
        return userRepository.findById(id);
    }

}
