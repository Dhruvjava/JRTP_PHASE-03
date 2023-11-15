package com.cb.service.impl;

import com.cb.service.INotificationService;
import org.springframework.stereotype.Service;

@Service
public class MobileNotification implements INotificationService {

    public void sendNotification(){
        System.out.println("SMS Notification has been sent.");
    }

}
