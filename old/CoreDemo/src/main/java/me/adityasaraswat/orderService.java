package me.adityasaraswat;

import me.adityasaraswat.notifications.emailService;
import me.adityasaraswat.notifications.notificationService;
import me.adityasaraswat.notifications.smsService;

public class orderService {
    notificationService notification;

    public orderService(notificationService notification){
        this.notification=notification;
    }

    public orderService(){

    }

    public void placeOrder(){
        System.out.println("Place order");
        notification.sendNotification();
    }

    public void setNotification(notificationService notification) {
        this.notification = notification;
    }
}
