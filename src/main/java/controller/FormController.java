package controller;

import controller.model.Tweet;
import controller.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @RequestMapping("/form")
    public  String form(){
        return "form";
    }

    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public ModelAndView handleForm(@ModelAttribute User user){
        ModelAndView modelAndView=new ModelAndView();
       modelAndView.addObject("user",user);
       modelAndView.setViewName("formAfter");
       return modelAndView;
    }

    @RequestMapping("/tweet")
    public String tweet(){
        return "tweet";
    }

    @RequestMapping(path ="/tweets",method = RequestMethod.POST)
    public ModelAndView tweeting(@ModelAttribute Tweet tweet){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("twt",tweet);
        modelAndView.setViewName("success");
        return modelAndView;
    }


}
