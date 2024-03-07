package com.fs.chatroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fs.chatroom.dao")
public class ChatroomChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatroomChatApplication.class, args);
    }

}
