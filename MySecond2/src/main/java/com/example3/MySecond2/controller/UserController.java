package com.example3.MySecond2.controller;

import com.example3.MySecond2.dto.UserDTO;
import com.example3.MySecond2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v2/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/getUser")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }
    @GetMapping(value = "/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
       return userService.saveUser(userDTO);
    }
    @GetMapping(value = "/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
    @GetMapping(value = "/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }
    @GetMapping(value = "/getUserByUserId/{userID}")
    public UserDTO getUserByUserID(@PathVariable String userID){
        return   userService.getUserByUserID(userID);
    }
    @GetMapping(value = "/getUserByUserIDAndAddress/{userID}/{address}")
    public UserDTO getUserByUserIDAndAddress(@PathVariable String userID ,@PathVariable String address){
        return userService.getUserByUserIDAndAddress(userID,address);
    }
}
