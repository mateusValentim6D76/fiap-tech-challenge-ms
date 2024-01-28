package br.com.fiap.notification.adapters.in.resource.impl;

import br.com.fiap.notification.adapters.in.resource.INotificationResource;
import br.com.fiap.notification.application.domain.model.Notification;
import br.com.fiap.notification.application.service.SendNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "api/v1/send")
@RequiredArgsConstructor
public class NotificationResourceImpl implements INotificationResource {

    private final SendNotificationService sendNotificationService;
    @Override
    public ResponseEntity<Notification> sendNotification(Notification notification) {
        sendNotificationService.sendNotification(notification);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
