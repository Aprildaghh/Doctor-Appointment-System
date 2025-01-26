package com.abdullah.Notification.EmailManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    @Autowired
    private JavaMailSender mailSender;

    public void sendRateEmail(int doctorId, String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Doktoru değerlendirmek için bu bağlantıya tıkla:" +
                " localhost:8079/rate/"+doctorId);
        message.setText("body");
        mailSender.send(message);
    }

    public void sendUnfinishedAppointmentEmail(int doctorId, String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("You have 1 unfinished appointment." +
                " localhost:8079/unfinished/"+doctorId);
        message.setText("body");
        mailSender.send(message);
    }
}
