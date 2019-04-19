package com.cnc.blog.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cnc.blog.mapper.IUserInfoMapper;
import com.cnc.blog.pojo.UserInfo;

/**
 * @author xiangt
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {


    @Autowired
    private IUserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoById() {
        return userInfoMapper.getUserInfoById();
    }

    @Override
    public List<UserInfo> listUserInfo() {
      return userInfoMapper.listUserInfo();
    }

}
