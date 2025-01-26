package com.abdullah.Notification.Listener;

import com.abdullah.Notification.EmailManager.EmailSender;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import static java.lang.Thread.sleep;

@Component
public class NotificationListener {


    @Autowired
    private EmailSender emailSender;


    @RabbitListener(queues = "4458Queue")
    public void receive(String message) throws InterruptedException {

        boolean isRateEmail = message.charAt(0) == 'R';
        message = message.substring(1);
        int doctorId = Integer.parseInt(message.split("\r\n")[0]);
        String email = message.split("\r\n")[1];
        System.out.println(doctorId);
        System.out.println(email);
        if (isRateEmail) emailSender.sendRateEmail(doctorId, email);
        else emailSender.sendUnfinishedAppointmentEmail(doctorId, email);

        sleep(1000);    // sleep for 1 second
    }

}
