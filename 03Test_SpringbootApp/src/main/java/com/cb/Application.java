package com.cb;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var run = SpringApplication.run(Application.class, args);
        var mobileNotification = run.getBean("notificationService", NotificationService.class);
        mobileNotification.triggerNotification();

//        String fileContent = "I am from Naresh IT I am from Naresh IT from Naresh";
//
//        Map<String, Integer> wordsMap = new LinkedHashMap<>();
//        String[] words = fileContent.split(" ");
//        for (String word : words) {
//            Integer count = wordsMap.get(word);
//            if (count == null) {
//                count = 1;
//                wordsMap.put(word, count);
//            } else {
//                wordsMap.put(word, count + 1);
//            }
//        }
//        System.out.println(wordsMap.entrySet());
//
//        wordsMap.entrySet().stream().filter(entry -> entry.getValue() == 2).forEach(entry -> System.out.println(entry.getKey()));

//        EmailNotification emailNotification = new EmailNotification();
//        MobileNotification mobileNotification = new MobileNotification();
//        NotificationService notificationService = new NotificationService(emailNotification, mobileNotification);
//        notificationService.triggerNotification();

    }

}
