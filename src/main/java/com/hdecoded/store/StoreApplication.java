package com.hdecoded.store;

import com.hdecoded.store.user.User;
import com.hdecoded.store.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class);
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class);
//        var hv = context.getBean(HeavyResource.class);
//        var orderService = context.getBean(OrderService.class);
//        var orderService2 = context.getBean(OrderService.class);
//        orderService.placeOrder();
//        context.close();
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var userService = context.getBean(UserService.class);

        User user1 = new User();
        user1.setEmail("user1@hotmail.com");
        user1.setPassword("password");
        user1.setName("user1");
        user1.setId(1L);
        userService.registerUser(user1);
        User user2 = new User();
        user2.setEmail("user2@hotmail.com");
        user2.setPassword("password");
        user2.setName("user2");
        user2.setId(2L);
        userService.registerUser(user2);
    }
}
