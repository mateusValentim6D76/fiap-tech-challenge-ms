package br.com.fiap.notification.config;

import br.com.fiap.notification.adapters.out.SendNotificationAdapterOut;
import br.com.fiap.notification.application.service.SendNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.Serializable;

@Configuration
public class NotificationConfig {

    @Bean
    public SendNotificationService insertOrderService(SendNotificationAdapterOut sendNotificationAdapterOut, KafkaTemplate<String, Serializable> kafkaTemplate) {
        return new SendNotificationService(sendNotificationAdapterOut, kafkaTemplate);
    }
}
