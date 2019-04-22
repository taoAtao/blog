package com.cnc.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cnc.blog.service.UserInfoServiceImpl;

/**
 * @author xiangt
 */

@Controller
public class UserController {
    @Autowired
    private UserInfoServiceImpl userInfoService;

    /*
    用modelandview向jsp传值
     */
    @RequestMapping("/listUser")
    public ModelAndView listAllUser(){
        return new ModelAndView("list","massage",userInfoService.listUserInfo());
    }
}
