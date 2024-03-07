package com.fs.chatroom.controller;

import com.fs.chatroom.entity.User;
import com.fs.chatroom.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {
  @Autowired
  UserService userService;

  @GetMapping("/users")
  public List<User> getUsersWithoutCurrentUser(){
    return userService.getUsersWithoutCurrentUser();
  }
}