package com.spring1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String index(ModelMap model){
		System.out.println("request mappimg is working for helloworld");
        return "helloWorld";
    }

}
