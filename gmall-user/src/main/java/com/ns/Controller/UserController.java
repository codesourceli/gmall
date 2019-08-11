package com.ns.Controller;

import com.ns.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){

        return "Hello Index";
    }

}
