package com.fs.chatroomadmin.service.systemUser;

import com.fs.chatroomadmin.entity.dto.SystemUserListDto;
import com.fs.chatroomadmin.entity.pojo.SystemUser;

import java.util.List;

public interface SystemUserSerivce {
    List<SystemUser> queryList(SystemUserListDto systemUserListDto);
}
