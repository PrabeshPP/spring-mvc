package controller;

import controller.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

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
}
