package com.example.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    String showMain(){
        System.out.println("안녕하세여tetetete");
        return "안녕하세요";
    }

    @GetMapping("/about")
    @ResponseBody
    String showAbout(){
        return "어바웃";
    }
}
