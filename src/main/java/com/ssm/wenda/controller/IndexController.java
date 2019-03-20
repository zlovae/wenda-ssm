package com.ssm.wenda.controller;

import com.ssm.wenda.service.WendaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping
public class IndexController {

    @Autowired
    WendaService wendaService;
/*
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

*/
    @RequestMapping(value = "/hello")
    public String template() {
        //model.addAttribute("value1", "vvvvv1");
        return "home";
    }
}
