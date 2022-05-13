package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController{
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Prabesh");
        List<String> friends=new ArrayList<>();
        friends.add("Prabesh");
        friends.add("Prabesh");
        friends.add("Carlo");
        friends.add("Rocky");
        model.addAttribute("list",friends);
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
       ModelAndView modelAndView=new ModelAndView();

       //Setting the Project
        modelAndView.addObject("name","Don't Know");
        modelAndView.setViewName("help");
        return modelAndView;
    }




}