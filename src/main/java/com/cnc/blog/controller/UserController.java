package com.cnc.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cnc.blog.pojo.UserInfo;
import com.cnc.blog.service.UserInfoServiceImpl;

/**
 * @author xiangt
 */

@Controller
public class UserController {
    @Autowired
    private UserInfoServiceImpl userInfoService;

    /**
     *用modelandview向jsp传值
     */
    @RequestMapping("/list")
    public ModelAndView listAllUser() {
        return new ModelAndView("list", "massage", userInfoService.listUserInfo());
    }

    /**
     * 初始页面
     * @return
     */
    @RequestMapping("/")
    public String login() {
        return "login";
    }

    /**
     * 用户登录
     * @param name
     * @param password
     * @param model
     * @return
     */
    @RequestMapping("/checkLogin")
    public String checkLogin(String name, String password, Model model) {
        return userInfoService.login(name,password);
    }


    @RequestMapping("/register")
    public String register(){
     return "register";
    }

    @RequestMapping("/checkRegister")
    public String checkRegister(@ModelAttribute UserInfo userInfo, Model model){
        return userInfoService.regist(userInfo);
    }
}
