package me.adityasaraswat;

import org.springframework.cache.annotation.CacheAnnotationParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        //CartService cs = new CartService();
        //cs.addToCart();

        User user = context.getBean(User.class);
        System.out.println(user.getName());

        CartService cartService = context.getBean(CartService.class);
        cartService.addToCart();
    }
}
