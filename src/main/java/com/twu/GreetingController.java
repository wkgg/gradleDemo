package com.twu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
* Created by twer on 11/5/14.
*/
@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public ModelAndView greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {

        ModelAndView view = new ModelAndView("greeting");
//        view.addAttribute("name", name);
        return view;
    }

}
