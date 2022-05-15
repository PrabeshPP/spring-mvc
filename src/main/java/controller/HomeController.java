package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/view")
public class HomeController{
    @RequestMapping(path = "/home",method = RequestMethod.GET)
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

    @RequestMapping("/contact")
    public ModelAndView contact(){
        ModelAndView modelAndView=new ModelAndView();
        LocalDateTime now =LocalDateTime.now();
        modelAndView.setViewName("contact");
        modelAndView.addObject("number","+977-123456789");
        modelAndView.addObject("date",now);
        return modelAndView;
    }

    @RequestMapping("/skills")
    public ModelAndView skills(){
        ModelAndView modelAndView=new ModelAndView();
        String[] arr={"Java,Dart,JavaScript,HTML,CSS"};
        modelAndView.addObject("skills",arr);
        modelAndView.setViewName("skills");
        return modelAndView;
    }




}