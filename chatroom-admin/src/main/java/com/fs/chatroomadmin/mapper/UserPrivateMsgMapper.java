package com.fs.chatroomadmin.mapper;

import com.fs.chatroomadmin.entity.pojo.UserPrivateMsg;

import java.util.List;

public interface UserPrivateMsgMapper {
    List<UserPrivateMsg> queryList(Integer pageNum, Integer pageSize);
}
