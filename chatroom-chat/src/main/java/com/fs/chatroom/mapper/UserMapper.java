package com.fs.chatroom.mapper;

import com.fs.chatroom.entity.pojo.FriendMsg;
import com.fs.chatroom.entity.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User selectChatUserById(@Param("userId") Integer userId);

    List<User> selectUserWithoutSelf(@Param("userId")Integer userId);

    User findUserByUserName(@Param("userName") String userName);

    List<FriendMsg> selectCurrentMsgByFriendId(Integer chatId);
}
