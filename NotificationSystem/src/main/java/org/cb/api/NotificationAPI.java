package org.cb.api;

import org.cb.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationAPI {

    @Autowired
    private NotificationService notificationService;

    public void triggerNotification(){
        this.notificationService.sendNotification();
    }
}
