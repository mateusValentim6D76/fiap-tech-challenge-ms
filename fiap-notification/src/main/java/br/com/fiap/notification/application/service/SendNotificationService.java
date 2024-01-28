package br.com.fiap.notification.application.service;

import br.com.fiap.notification.application.domain.model.Notification;
import br.com.fiap.notification.application.ports.in.ISendNotificationInputPort;
import br.com.fiap.notification.application.ports.out.ISendNotificationOutputPort;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.Serializable;

import static org.apache.kafka.common.requests.FetchMetadata.log;

public class SendNotificationService implements ISendNotificationInputPort {

    private final ISendNotificationOutputPort iSendNotificationOutputPort;
    private final KafkaTemplate<String, Serializable> kafkaTemplate;


    public SendNotificationService(ISendNotificationOutputPort iSendNotificationOutputPort, KafkaTemplate<String, Serializable> kafkaTemplate) {
        this.iSendNotificationOutputPort = iSendNotificationOutputPort;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Notification sendNotification(Notification notification) {
        log.info("::: RECEBI O PEDIDO {}", notification);
        log.info("Enviando pedido ::: ");
        kafkaTemplate.send("notification-topic", notification);
        return iSendNotificationOutputPort.send(notification);
    }
}
