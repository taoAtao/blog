package com.cnc.blog.service;

import java.util.List;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */

public interface IUserInfoService {

    boolean checkUser(String name) throws Exception;

    List<UserInfo> listUserInfo();

    void addUser(UserInfo userInfo);

    int deleteUserById(Integer id);

    int updateUserById(Integer id,UserInfo userInfo);

    String login(String name, String password);

    String regist(UserInfo userInfo);
}
