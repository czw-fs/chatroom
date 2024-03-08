package com.fs.chatroomadmin.service.UserPrivateMsg;

import com.fs.chatroomadmin.entity.dto.UserPrivateMsgListDto;
import com.fs.chatroomadmin.entity.pojo.UserPrivateMsg;
import com.github.pagehelper.PageInfo;

public interface UserPrivateMsgService {
    PageInfo<UserPrivateMsg> getList(UserPrivateMsgListDto userPrivateMsgListDto);
}
