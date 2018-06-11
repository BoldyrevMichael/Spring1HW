package ru.boldyrev.ma.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String greet(Model uiModel, @PathVariable(value = "name") String name) {
        uiModel.addAttribute("name", name);
        return "greeting";
    }
}
