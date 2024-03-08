package com.fs.chatroomadmin.controller.robot;

import com.fs.chatroomadmin.entity.dto.RobotListDto;
import com.fs.chatroomadmin.entity.pojo.Robot;
import com.fs.chatroomadmin.entity.vo.RespUtils;
import com.fs.chatroomadmin.service.robot.RobotService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/robot")
public class RobotController {

    @Autowired
    private RobotService robotService;

    @GetMapping("/list")
    public RespUtils<Map> list(RobotListDto robotListDto){
        PageInfo<Robot> pageInfo = robotService.getList(robotListDto);
        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return RespUtils.success(map);
    }

}
