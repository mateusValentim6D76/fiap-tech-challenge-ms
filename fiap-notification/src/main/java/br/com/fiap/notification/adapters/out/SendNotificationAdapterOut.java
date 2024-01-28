package br.com.fiap.notification.adapters.out;

import br.com.fiap.notification.adapters.out.repository.ISendNotificationRepository;
import br.com.fiap.notification.application.domain.model.Notification;
import br.com.fiap.notification.application.ports.out.ISendNotificationOutputPort;
import br.com.fiap.notification.application.service.SendNotificationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SendNotificationAdapterOut implements ISendNotificationOutputPort {

    private final SendNotificationService sendNotificationService;
    private final ISendNotificationRepository iSendNotificationRepository;

    @Override
    public Notification send(Notification notification) {
        return iSendNotificationRepository.save(notification);
    }
}
