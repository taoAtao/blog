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

    Integer getIdByName(@Param("name") String name) throws Exception;

    void addUserInfo(UserInfo userInfo) throws Exception;

    void updateUserInfoById(@Param("id") Integer id,@Param("userInfo") UserInfo userInfo) throws Exception;

    UserInfo findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
}
