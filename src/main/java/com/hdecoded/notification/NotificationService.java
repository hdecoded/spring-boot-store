package com.hdecoded.notification;

import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    void send(String message);
}
