package org.cb;

import org.cb.api.NotificationAPI;
import org.cb.service.NotificationService;
import org.cb.service.impl.EmailNotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Notification {

    public static void main(String[] args) {
//        NotificationService notificationService =new EmailNotificationService();
//
//        NotificationAPI api = new NotificationAPI();
//        api.setNotificationService(notificationService);
//        api.triggerNotification();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Notification.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

        NotificationAPI notificationAPI = applicationContext.getBean("notificationAPI", NotificationAPI.class);
        NotificationService notificationService = applicationContext.getBean("emailNotificationService", EmailNotificationService.class);
//        notificationAPI.setNotificationService(notificationService);
        notificationAPI.triggerNotification();
    }

}
