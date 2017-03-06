package com.ttpai.test.controller;

import com.ttpai.test.model.User;
import com.ttpai.test.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2017/3/3 17:52
 */
@Controller
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showUser(){

        User user = userService.getUserById(1);

        ModelAndView mv = new ModelAndView();

        mv.addObject("user",user);

        return "showUser";
    }
}
