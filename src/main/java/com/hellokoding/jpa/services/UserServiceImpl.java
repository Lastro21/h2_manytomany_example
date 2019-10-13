package com.hellokoding.jpa.services;

import com.hellokoding.jpa.models.User;
import com.hellokoding.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User findByName(final String name) {
        return userRepository.findByName(name);
    }

}
