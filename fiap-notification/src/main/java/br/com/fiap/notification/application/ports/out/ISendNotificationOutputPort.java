package br.com.fiap.notification.application.ports.out;

import br.com.fiap.notification.application.domain.model.Notification;

public interface ISendNotificationOutputPort {

    Notification send(Notification notification);
}
