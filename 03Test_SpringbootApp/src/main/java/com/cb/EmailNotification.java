package com.cb;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification {

    public void sendNotification(){
        System.out.println("Email Notification sent !!!");
    }

}
