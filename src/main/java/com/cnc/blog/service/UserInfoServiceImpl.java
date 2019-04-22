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

    @Override
    public boolean checkUser(String name) {
        try {
            if (userInfoDao.getIdByName(name) == null)
                return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
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
    public void addUser(UserInfo userInfo) {
        try {
            userInfoDao.addUserInfo(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

    @Override
    public int updateUserById(Integer id, UserInfo userInfo) {
        try {
            userInfoDao.updateUserInfoById(id, userInfo);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String login(String name, String password) {
        if (userInfoDao.findUserByNameAndPwd(name, password) != null) {
            return "loginSuccess";
        }
        else
        return "loginFail";
    }

    @Override
    public String regist(UserInfo userInfo) {
        if (checkUser(userInfo.getName())) {
            return "registFail";
        } else {
            try {
                userInfoDao.addUserInfo(userInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "registSuccess";
        }
    }

}
