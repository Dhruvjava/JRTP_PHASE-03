package com.cb.notification;

import java.util.Objects;

public class BankAccount {

    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        MobileNotification mobile = new MobileNotification();
        MobileAppNotification mobileApp = new MobileAppNotification();
        WhatsAppNotification whatsApp = new WhatsAppNotification();
        BankAccountService bankAccountService = new BankAccountService(mobile, email, whatsApp, mobileApp);


//        bankAccountService.accountTransaction();
//        bankAccountService.accountStatement();

//        String name = null;
        String name = "";
//        boolean exist = Objects.nonNull(name);
        boolean exist = Objects.isNull(name);
        if(exist){
            System.out.println("name is empty !!!");
        }else {
            System.out.println("name is not empty !!!");
        }
    }

}
