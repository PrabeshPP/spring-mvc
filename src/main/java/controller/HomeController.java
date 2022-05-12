package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//To make this Controller ,we have to put @Controller annotation
@Controller
public class HomeController {
    @RequestMapping("/home")
    public  String home(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
