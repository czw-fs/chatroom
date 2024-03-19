package com.fs.chatroom.mapper;

import com.fs.chatroom.entity.pojo.FriendMsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FriendMsgMapper {


    List<FriendMsg> selectCurrentMsgByFriendId(@Param("friendId") Integer FriendId,@Param("curId")Integer curId);

}
