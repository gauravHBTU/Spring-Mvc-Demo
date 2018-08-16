package com.mvcdemo.beans;

import com.mvcdemo.util.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController
public class DemoController {
    
    @RequestMapping(value="/home.htm" ,method =RequestMethod.GET )
    public String Response(){
      
      return "home";
    }
    
    @ResponseBody
    @RequestMapping(value="/test2" ,method =RequestMethod.GET )
    public Object jsonResponseviaRBody(){
      
        Message mobj=new Message();
        mobj.setTitle("welcome text");
        mobj.setText("hello users");
        return mobj;
    }   
}
