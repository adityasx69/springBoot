package me.adityasaraswat;

import me.adityasaraswat.notifications.emailService;
import me.adityasaraswat.notifications.fakeEmailNotificationService;
import me.adityasaraswat.notifications.notificationService;
import me.adityasaraswat.notifications.smsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        notificationService notification = new fakeEmailNotificationService();
        //orderService order = new orderService(notification);
        orderService order = new orderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}
