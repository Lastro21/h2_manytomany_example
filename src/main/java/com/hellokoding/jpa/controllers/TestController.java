package com.hellokoding.jpa.controllers;

import com.hellokoding.jpa.models.Route;
import com.hellokoding.jpa.models.User;
import com.hellokoding.jpa.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/show")
    public String show() {

        final User userExists = userService.findByName("Lastro");

        if (userExists != null) {
            System.out.println(userExists.getName());
            System.out.println(userExists.getRoutes());
            System.out.println(userExists.getRoutes().size());
            for (Route route : userExists.getRoutes()) {
                System.out.println(route.getRoute());
            }
        }
        return "Was show";
    }
}
