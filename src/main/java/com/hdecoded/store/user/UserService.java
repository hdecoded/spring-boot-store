package com.hdecoded.store.user;

import com.hdecoded.store.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        var userCreated = userRepository.save(user);
        if (userCreated) {
            notificationService.send("User saved", user.getEmail());
        }
        notificationService.send("User already registered", user.getEmail());
    }
}
