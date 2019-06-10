package org.sang.aop.service;

import org.sang.aop.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserById(Integer id) {
        System.out.println("get...");
        return "user";
    }
    public void deleteUserById(Integer id) {
        int i = 1 / 0;
        System.out.println("delete...");
    }
}
