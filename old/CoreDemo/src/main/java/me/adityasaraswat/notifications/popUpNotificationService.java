package me.adityasaraswat.notifications;

public class popUpNotificationService implements notificationService{

    @Override
    public void sendNotification(){
        System.out.println("Pop-up notification sent");
    }
}
