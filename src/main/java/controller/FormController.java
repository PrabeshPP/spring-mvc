package controller;

import controller.model.User;
import org.springframework.stereotype.Controller;
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
    public ModelAndView handleForm(@RequestParam(value = "email") String email, @RequestParam("username") String username){
        User user=new User();
        user.setUserName(username);
        user.setEmail(email);
        System.out.println(user);
        //Process
        ModelAndView modelAndView=new ModelAndView();
       modelAndView.addObject("email",email);
       modelAndView.addObject("username",username);
       modelAndView.setViewName("formAfter");
       return modelAndView;
    }
}
