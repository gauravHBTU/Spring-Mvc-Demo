
package com.mvcdemo.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/home")
public class HomeController {
   
    @RequestMapping(value="/home.htm" ,method =RequestMethod.GET )
    public String requestHandler(){
        
        return "home";
    }
    @RequestMapping(value="/about.htm" ,method =RequestMethod.GET )
    public ModelAndView requestHndlr(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("about");
        mav.addObject("token", "admin");
        return mav;
    } 
}