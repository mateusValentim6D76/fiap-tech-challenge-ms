package br.com.fiap.notification.adapters.out.repository;

import br.com.fiap.notification.application.domain.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ISendNotificationRepository extends JpaRepository<Notification, Long> {
}
