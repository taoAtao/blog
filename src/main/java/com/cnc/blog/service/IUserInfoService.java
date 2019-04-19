package com.cnc.blog.service;

import java.util.List;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */

public interface IUserInfoService {

    UserInfo getUserInfoById(Integer id);

    List<UserInfo> listUserInfo();

    int addUser(UserInfo userInfo);

    int deleteUserById(Integer id);

}
