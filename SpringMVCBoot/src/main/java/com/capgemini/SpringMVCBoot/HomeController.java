package com.capgemini.SpringMVCBoot;

import com.capgemini.SpringMVCBoot.model.Alien;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i , @RequestParam("num2") int j , ModelMap model){

        int num3 = i + j ;

        model.addAttribute("num3",num3);

        return "result";
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("a1") Alien a){

        return "result";

    }
    @ModelAttribute
    public void modelData(Model m){
        m.addAttribute("name","Aliens");
    }
}
