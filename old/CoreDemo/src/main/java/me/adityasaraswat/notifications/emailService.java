package me.adityasaraswat.notifications;

public class emailService implements notificationService{

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }
}
