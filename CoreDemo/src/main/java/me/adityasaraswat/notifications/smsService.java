package me.adityasaraswat.notifications;

public class smsService implements notificationService{

    @Override
    public void sendNotification(){
        System.out.println("SMS notification sent");
    }
}
