package org.cb.service.impl;

import org.cb.service.NotificationService;
import org.springframework.stereotype.Service;


@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Mail Sent Successfully !!!");
    }
}
