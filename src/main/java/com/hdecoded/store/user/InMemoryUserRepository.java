package com.hdecoded.store.user;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {

    private final HashMap<String, User> hashMap = new HashMap<>();

    @Override
    public boolean save(User user) {
        if (hashMap.containsKey(user.getEmail())) {
            System.out.println("User already exists");
            return false;
        } else {
            hashMap.put(user.getEmail(), user);
        }
        System.out.println(hashMap);
        return true;
    }
}
