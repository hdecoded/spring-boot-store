package com.hdecoded.store.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${email.host}")
    private String EmailHost;
    @Value("${email.port}")
    private int EmailPort;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Email sent to " + recipientEmail + ": " + message);
        System.out.println("Email host and port: " + EmailHost + ":" + EmailPort);
    }
}
