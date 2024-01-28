package br.com.fiap.notification.application.ports.in;

import br.com.fiap.notification.application.domain.model.Notification;

public interface ISendNotificationInputPort {

    Notification sendNotification(Notification notification);
}
