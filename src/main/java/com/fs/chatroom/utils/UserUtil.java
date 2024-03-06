package com.fs.chatroom.utils;

import com.fs.chatroom.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtil {
  /**
   * 获取当前登录用户实体
   * @return
   */
  public static User getCurrentUser(){
    return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
  }
}
