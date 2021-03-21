package com.tutorial.rex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

    //각 속성에 맞는 값을 데이터베이스에서 추출해 입력하면 될 것 같다.
    @RequestMapping(value = "/mail")
    public String PrintMail(Model model) {
        model.addAttribute("mailId", "mailId");
        model.addAttribute("name", "name");
        model.addAttribute("mailPath", "mailPath");
        model.addAttribute("mDate", "mDate");
        model.addAttribute("category", "category");
        model.addAttribute("contents", "contents");
        return "mail";
    }
}
