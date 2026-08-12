package me.adityasaraswat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.adityasaraswat")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Aditya",20);
    }

    @Bean
    public CartService cartService(){
        return new CartService();
    }
}
