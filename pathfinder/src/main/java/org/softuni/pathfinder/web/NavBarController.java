package org.softuni.pathfinder.web;

import org.softuni.pathfinder.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavBarController {
    private UserService userService;

    @Autowired
    public NavBarController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/")
    public String firstPage(Model model) {
        return "index";
    }
    @GetMapping("/home")
    public String home(Model model) {

        return "index";
    }

    @GetMapping("/about")
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/about");

        modelAndView.addObject("isInThePage",true);

        return modelAndView;

    }
}
