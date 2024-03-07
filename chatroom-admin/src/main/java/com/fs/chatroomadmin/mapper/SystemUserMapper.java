package com.fs.chatroomadmin.mapper;

import com.fs.chatroomadmin.entity.pojo.SystemUser;

import java.util.List;

public interface SystemUserMapper {
    List<SystemUser> queryList(Integer pageNum, Integer pageSize);
}
