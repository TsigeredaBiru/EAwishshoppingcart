package edu.mum.controller;

import edu.mum.entity.User;
import edu.mum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sushan on 8/13/2017.
 */
@RestController
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody User User){
        userService.saveUser(User);
        return "Success!";
    }

    @DeleteMapping(value= "/user/{userId}")
    public String deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
        return  "Success delete!";
    }

    @PutMapping(value="/user/{userId}")
    public String updateUser(@RequestBody User User, @PathVariable int userId){
        User.setUserId(userId);
        userService.updateUser(userId, User);
        return "Success update";
    }

    @GetMapping("/user/{userId}")
    public User getOneUser(@PathVariable int userId){
        return userService.getUser(userId);
    }
}
