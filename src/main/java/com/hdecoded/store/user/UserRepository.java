package com.hdecoded.store.user;

public interface UserRepository {

    public void save(User user);

    User findByEmail(String email);
}
