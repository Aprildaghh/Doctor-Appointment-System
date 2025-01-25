package com.abdullah.Appointment.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE = "4458Queue";
    public static final String EXCHANGE = "4458Exchange";
    public static final String ROUTING_KEY = "4458RoutingKey";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE);
    }


}
