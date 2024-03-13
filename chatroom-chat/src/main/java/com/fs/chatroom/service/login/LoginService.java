package com.fs.chatroom.service.login;

import com.fs.chatroom.entity.dto.LoginDto;

public interface LoginService {

    Integer getUserId(LoginDto loginDto);
}
