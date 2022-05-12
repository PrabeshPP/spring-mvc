package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//To make this Controller ,we have to put @Controller annotation
@Controller
public class HomeController {
    @RequestMapping("/home")
    public  String home(){
        System.out.println("Showing Home Page");
        return "index";
    }
}
