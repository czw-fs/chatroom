package com.fs.chatroomadmin.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理后台用户
 *
 * @author makejava
 * @since 2020-06-16 11:35:56
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemUser {

    private Integer id;

    private String userName;

    private String password;

    private String userProfile;

}
