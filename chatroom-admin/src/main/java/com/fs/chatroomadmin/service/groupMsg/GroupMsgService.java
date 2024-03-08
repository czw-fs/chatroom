package com.fs.chatroomadmin.service.groupMsg;

import com.fs.chatroomadmin.entity.dto.GroupMsgListDto;
import com.fs.chatroomadmin.entity.pojo.GroupMsg;
import com.github.pagehelper.PageInfo;

public interface GroupMsgService {

    PageInfo<GroupMsg> getList(GroupMsgListDto groupMsgListDto);
}
