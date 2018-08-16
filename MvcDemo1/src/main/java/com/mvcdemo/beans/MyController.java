
package com.mvcdemo.beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       ModelAndView mav=new ModelAndView("my");
       String token="success";
         mav.addObject("token",token);
        return mav;
    } 
}