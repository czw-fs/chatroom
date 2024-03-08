package com.fs.chatroomadmin.mapper;

import com.fs.chatroomadmin.entity.pojo.GroupMsg;

import java.util.List;

public interface GroupMsgMapper {

    List<GroupMsg> queryList(Integer pageNum, Integer pageSize);
}
