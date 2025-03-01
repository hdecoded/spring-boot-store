package com.hdecoded.store.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String email;
    private String password;
    private String name;
}
