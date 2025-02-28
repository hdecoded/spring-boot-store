package com.hdecoded.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class);
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class);
        var hv = context.getBean(HeavyResource.class);
        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);
        orderService.placeOrder();
        context.close();
    }
}
