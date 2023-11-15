package com.cb.service.impl;

import com.cb.service.INotificationService;
import org.springframework.stereotype.Service;

@Service
public class MobileAppNotification implements INotificationService {

    public void sendNotification(){
        System.out.println("Notification has been sent to Mobile App.");
    }

}
