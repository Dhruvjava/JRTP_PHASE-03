package com.cb;

import org.springframework.stereotype.Component;

@Component
public class MobileNotification {

    public void sendNotification() {
        System.out.println("SMS Notification sent !!!");
    }

}
