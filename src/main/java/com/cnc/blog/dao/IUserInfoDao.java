package com.cnc.blog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */

@Repository
public interface IUserInfoDao {

    List<UserInfo> listUserInfo() throws Exception;

    UserInfo getUserInfoById(@Param("id") Integer id) throws Exception;

    void addUserInfo(UserInfo userInfo) throws Exception;

    void deleteUserInfoById(@Param("id") Integer id) throws Exception;

}
