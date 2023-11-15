package com.cb.notification;

public class BankAccountService {

    private MobileNotification mobileNotification;

    private EmailNotification emailNotification;

    private WhatsAppNotification whatsAppNotification;

    private MobileAppNotification mobileAppNotification;

    public BankAccountService(MobileNotification mobileNotification, EmailNotification emailNotification, WhatsAppNotification whatsAppNotification, MobileAppNotification mobileAppNotification) {
        this.mobileNotification = mobileNotification;
        this.emailNotification = emailNotification;
        this.whatsAppNotification = whatsAppNotification;
        this.mobileAppNotification = mobileAppNotification;
    }

    public void accountTransaction() {
        System.out.println("Account debit/credit transaction details are "
                + "successfully sent to your Email and Mobile");
        this.mobileNotification.sendNotification();
        this.emailNotification.sendNotification();
    }

    public void accountStatement() {
        System.out.println("Account Monthly statement details are "
                + "successfully sent to your Email and Mobile");
        this.emailNotification.sendNotification();
        this.whatsAppNotification.sendNotification();
        this.mobileAppNotification.sendNotification();
    }
}
