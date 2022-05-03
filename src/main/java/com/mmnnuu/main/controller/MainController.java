package com.mmnnuu.main.controller;

import com.mmnnuu.main.entity.MainEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = {"/main", "/"})
    public String view(Model model, MainEntity paramEntity) {

        return "main";
    }
}
