package com.hellokoding.jpa.services;

import com.hellokoding.jpa.models.User;

public interface UserService {
    User findByName(final String name);
}
