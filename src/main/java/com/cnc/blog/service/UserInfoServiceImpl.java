package com.cnc.blog.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cnc.blog.dao.IUserInfoDao;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    public UserInfo getUserInfoById(Integer id) {
        try {
            return userInfoDao.getUserInfoById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserInfo> listUserInfo() {
        try {
            return userInfoDao.listUserInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int addUser(UserInfo userInfo) {
        try {
            userInfoDao.addUserInfo(userInfo);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

}
