package com.capgemini.SpringMVCBoot;

import com.capgemini.SpringMVCBoot.model.Alien;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/getAliens")
   public String getAliens(Model model){
        List<Alien> aliens= Arrays.asList(new Alien(1,"Abhishek"),new Alien(2,"Arjun"));
        model.addAttribute("result",aliens);
        return "showAliens";

   }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute("a1") Alien a){

        return "result";

    }
    @ModelAttribute
    public void modelData(Model m){
        m.addAttribute("name","Aliens");
    }
}
