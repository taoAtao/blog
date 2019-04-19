package com.cnc.blog.service;

import java.util.List;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */

public interface IUserInfoService {

    UserInfo getUserInfoById();

    List<UserInfo> listUserInfo();

}
