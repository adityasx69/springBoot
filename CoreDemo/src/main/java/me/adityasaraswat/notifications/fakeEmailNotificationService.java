package me.adityasaraswat.notifications;

public class fakeEmailNotificationService implements notificationService{

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }
}
