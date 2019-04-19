package com.cnc.blog.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */

@Repository
public interface IUserInfoMapper {
    List<UserInfo> listUserInfo();
    UserInfo getUserInfoById();
}
