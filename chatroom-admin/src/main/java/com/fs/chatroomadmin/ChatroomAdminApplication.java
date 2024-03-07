package com.fs.chatroomadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fs.chatroomadmin.mapper")
public class ChatroomAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomAdminApplication.class, args);
	}

}
