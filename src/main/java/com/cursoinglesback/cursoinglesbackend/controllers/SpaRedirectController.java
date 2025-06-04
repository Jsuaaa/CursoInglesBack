package com.cursoinglesback.cursoinglesbackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpaRedirectController {


    @RequestMapping(value = "/{[path:[^\\.]*}")
    public String forward() {
        return "forward:/index.html";
    }

}
