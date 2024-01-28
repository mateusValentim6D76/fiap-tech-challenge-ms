package br.com.fiap.notification.adapters.in.resource;

import br.com.fiap.notification.application.domain.model.Notification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface INotificationResource {

    @PostMapping
    ResponseEntity<Notification> sendNotification(@RequestBody Notification notification);
}
