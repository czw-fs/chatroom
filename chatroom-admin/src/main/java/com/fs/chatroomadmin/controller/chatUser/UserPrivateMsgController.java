package com.fs.chatroomadmin.controller.chatUser;

import com.fs.chatroomadmin.entity.dto.UserPrivateMsgListDto;
import com.fs.chatroomadmin.entity.pojo.UserPrivateMsg;
import com.fs.chatroomadmin.entity.RespUtils;
import com.fs.chatroomadmin.service.UserPrivateMsg.UserPrivateMsgService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户私聊记录
 */

@RestController
@RequestMapping("/user/private/msg")
public class UserPrivateMsgController {

    @Autowired
    private UserPrivateMsgService userPrivateMsgService;

    @GetMapping("/list")
    public RespUtils<Map> list(UserPrivateMsgListDto userPrivateMsgListDto){
        PageInfo<UserPrivateMsg> pageInfo = userPrivateMsgService.getList(userPrivateMsgListDto);
        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return RespUtils.success(map);
    }

}
