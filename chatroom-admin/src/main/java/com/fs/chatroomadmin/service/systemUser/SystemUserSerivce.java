package com.fs.chatroomadmin.service.systemUser;

import com.fs.chatroomadmin.entity.dto.SystemUserListDto;
import com.fs.chatroomadmin.entity.pojo.SystemUser;
import com.github.pagehelper.PageInfo;

public interface SystemUserSerivce {
    PageInfo<SystemUser> queryList(SystemUserListDto systemUserListDto);
}
