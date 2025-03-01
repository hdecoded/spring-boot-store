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
        userService.registerUser(new User(1L, "hd@outlook.in", "Pass", "Hemanth"));
        userService.registerUser(new User(1L, "hd@outlook.in", "Pass", "Hemanth"));
        userService.registerUser(new User(2L, "sp@outlook.in", "Pass", "Sowmya"));
    }
}
