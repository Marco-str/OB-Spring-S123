package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    @Autowired
    public UserService(NotificationService notificationService) {

        this.notificationService = notificationService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

}
