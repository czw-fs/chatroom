package com.fs.chatroomadmin.service.chatUser.impl;


import com.fs.chatroomadmin.entity.dto.ChatUserListDto;
import com.fs.chatroomadmin.entity.pojo.ChatUser;
import com.fs.chatroomadmin.mapper.ChatUserMapper;
import com.fs.chatroomadmin.service.chatUser.ChatUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatUserServiceImpl implements ChatUserService {

    @Autowired
    private ChatUserMapper chatUserMapper;

    @Override
    public PageInfo<ChatUser> getList(ChatUserListDto chatUserListDto) {
        PageHelper.startPage(chatUserListDto.getPageNum(),chatUserListDto.getPageSize());
        List<ChatUser> chatUserList = chatUserMapper.queryList(chatUserListDto.getPageNum(), chatUserListDto.getPageSize());
        PageInfo<ChatUser> pageInfo = new PageInfo<>(chatUserList);
        return pageInfo;
    }
}
