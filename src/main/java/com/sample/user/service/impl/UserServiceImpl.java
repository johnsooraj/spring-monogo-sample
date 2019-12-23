package com.sample.user.service.impl;

import com.sample.models.Users;
import com.sample.user.repository.UserRepository;
import com.sample.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getAllUsers() {
        this.createDummyUsers();
        return userRepository.findAll();
    }

    private List<Users> createDummyUsers() {
        List<Users> users = new ArrayList<>();
        Users users1 = new Users("John Sooraj");
        users1.setFirstName("John");
        users.add(userRepository.save(users1));
/*        users.add(userRepository.save(new Users("John Sooraj2")));
        users.add(userRepository.save(new Users("John Sooraj3")));
        users.add(userRepository.save(new Users("John Sooraj4")));*/
        return users;
    }
}
