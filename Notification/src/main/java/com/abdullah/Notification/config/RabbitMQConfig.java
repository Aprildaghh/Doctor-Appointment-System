package com.abdullah.Notification.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
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

    // Define the exchange
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    // Bind the queue to the exchange with a routing key
    @Bean
    public Binding binding(Queue myQueue, TopicExchange exchange) {
        return BindingBuilder.bind(myQueue).to(exchange).with(ROUTING_KEY);
    }


}
