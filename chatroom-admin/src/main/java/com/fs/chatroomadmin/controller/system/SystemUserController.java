package com.fs.chatroomadmin.controller.system;


import com.fs.chatroomadmin.entity.dto.SystemUserListDto;
import com.fs.chatroomadmin.entity.pojo.SystemUser;
import com.fs.chatroomadmin.entity.vo.RespUtils;
import com.fs.chatroomadmin.service.systemUser.SystemUserSerivce;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统用户详情
 */

@RestController
@RequestMapping("/system/user")
public class SystemUserController {

    @Autowired
    private SystemUserSerivce systemUserSerivce;

    @GetMapping("/list")
    public RespUtils<Map> list(SystemUserListDto systemUserListDto){
        PageInfo<SystemUser> pageInfo = systemUserSerivce.queryList(systemUserListDto);

        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());

        return RespUtils.success(map);
    }

}
