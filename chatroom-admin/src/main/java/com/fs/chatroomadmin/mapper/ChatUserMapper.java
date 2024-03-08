package com.fs.chatroomadmin.mapper;

import com.fs.chatroomadmin.entity.pojo.ChatUser;

import java.util.List;

public interface ChatUserMapper {


    List<ChatUser> queryList(Integer pageNum, Integer pageSize);
}
