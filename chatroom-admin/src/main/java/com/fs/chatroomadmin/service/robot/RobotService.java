package com.fs.chatroomadmin.service.robot;

import com.fs.chatroomadmin.entity.dto.RobotListDto;
import com.fs.chatroomadmin.entity.pojo.Robot;
import com.github.pagehelper.PageInfo;

public interface RobotService {
    PageInfo<Robot> getList(RobotListDto robotListDto);
}
