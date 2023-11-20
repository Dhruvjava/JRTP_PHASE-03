package com.cb;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private MobileNotification mobileNotification;

    private EmailNotification emailNotification;

    public NotificationService(EmailNotification emailNotification, MobileNotification mobileNotification) {
        this.emailNotification = emailNotification;
        this.mobileNotification = mobileNotification;
    }

    public void triggerNotification() {
        emailNotification.sendNotification();
        mobileNotification.sendNotification();
    }

}
