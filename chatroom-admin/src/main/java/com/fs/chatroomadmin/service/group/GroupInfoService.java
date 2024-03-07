package com.fs.chatroomadmin.service.group;

import com.fs.chatroomadmin.entity.dto.GroupInfoListDto;
import com.fs.chatroomadmin.entity.pojo.GroupInfo;
import com.github.pagehelper.PageInfo;

public interface GroupInfoService {

    PageInfo<GroupInfo> getList(GroupInfoListDto groupInfoListDto);
}
