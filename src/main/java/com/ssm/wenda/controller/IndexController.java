package com.ssm.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping(path = {"/","index"})
    @ResponseBody
    public String Index() {
        return "Hello Coder";
    }

    @RequestMapping(path = {"profile/{UserId}"})
    @ResponseBody
    public String Profile(@PathVariable("UserId") int UserId) {
        return String.format("Profile Page of %d", UserId);
    }

    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String template( ) {
        //model.addAttribute("value1", "vvvvv1");
        return "index";
    }
}
