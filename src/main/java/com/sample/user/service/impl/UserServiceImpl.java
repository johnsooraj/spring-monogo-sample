package com.sample.user.service.impl;

import com.sample.models.Address;
import com.sample.models.Users;
import com.sample.user.repository.AddressRepository;
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

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Users> getAllUsers() {
        this.createDummyUsers();
        return userRepository.findAll();
    }

    private List<Users> createDummyUsers() {
        List<Users> users = new ArrayList<>();
        Users users1 = new Users("John Sooraj");
        users1.setFirstName("John");

        Users users2 = new Users("John Sooraj2");
        users1.setFirstName("John2");

        Address address = new Address();
        address.setAddressLine1("test1");
        addressRepository.save(address);


        users1.setAddress(address);
        users2.setAddress(address);

        users.add(userRepository.save(users1));
        users.add(userRepository.save(users2));
        return users;
    }
}
