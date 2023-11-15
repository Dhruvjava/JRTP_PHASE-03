package com.cb.service.impl;

import com.cb.service.INotificationService;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppNotification implements INotificationService {

    public void sendNotification(){
        System.out.println("WhatsApp Notification has been sent.");
    }

}
