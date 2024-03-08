package com.fs.chatroomadmin.service.chatUser;

import com.fs.chatroomadmin.entity.dto.ChatUserListDto;
import com.fs.chatroomadmin.entity.pojo.ChatUser;
import com.github.pagehelper.PageInfo;

public interface ChatUserService {
    PageInfo<ChatUser> getList(ChatUserListDto chatUserListDto);
}
