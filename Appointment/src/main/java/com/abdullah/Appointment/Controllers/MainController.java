package com.abdullah.Appointment.Controllers;

import com.abdullah.Appointment.Entities.User;
import com.abdullah.Appointment.RequestTypes.UserRequest;
import com.abdullah.Appointment.Services.UserService;
import com.abdullah.Appointment.config.RabbitMQConfig;
import jakarta.websocket.server.PathParam;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/appointment")
public class MainController {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody UserRequest request) {
        userService.register(new User(request));
    }

    @GetMapping("/getDoctors")
    public List<User> getDoctors(@PathParam(value="where") String where)
    {
        return userService.getDoctorsWithWhereClause(where);
    }

    @GetMapping("/getDoctor")
    public Optional<User> getDoctor(@PathParam(value="id") int id)
    {
        return userService.getDoctorById(id);
    }

    @PostMapping("/incomplete")
    public void incompleteVisit(@PathParam(value="email") String email, @PathParam(value="id") String id)
    {
        String message = 'I' + id + "\r\n" + email;
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, message);
    }

    @PostMapping("/notification")
    public void notificationRate(@PathParam(value="email") String email, @PathParam(value="id") String id)
    {
        String message = 'R' + id + "\r\n" + email;
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, message);
    }

}
