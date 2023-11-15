package com.cb.service.impl;

import com.cb.service.IBankAccountService;
import com.cb.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService implements IBankAccountService {

    @Autowired
    @Qualifier("mobileNotification")
    private INotificationService mobileNotification;

    @Autowired
    @Qualifier("emailNotification")
    private INotificationService emailNotification;

    @Autowired
    @Qualifier("whatsAppNotification")
    private INotificationService whatsAppNotification;

    @Autowired
    @Qualifier("mobileAppNotification")
    private INotificationService mobileAppNotification;

//    public BankAccountService(MobileNotification mobileNotification, EmailNotification emailNotification, WhatsAppNotification whatsAppNotification, MobileAppNotification mobileAppNotification) {
//        this.mobileNotification = mobileNotification;
//        this.emailNotification = emailNotification;
//        this.whatsAppNotification = whatsAppNotification;
//        this.mobileAppNotification = mobileAppNotification;
//    }

    public void accountTransaction() {
        System.out.println("Account debit/credit transaction details are "
                + "successfully sent to your Email and Mobile");
        mobileNotification.sendNotification();
        emailNotification.sendNotification();
    }

    public void accountStatement() {
        System.out.println("Account Monthly statement details are "
                + "successfully sent to your Email and Mobile");
        emailNotification.sendNotification();
        whatsAppNotification.sendNotification();
        mobileAppNotification.sendNotification();
    }
}
