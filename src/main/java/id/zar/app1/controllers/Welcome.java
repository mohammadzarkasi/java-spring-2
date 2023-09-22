package id.zar.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome
{
    @GetMapping("/")
    public String index(){
        return "welcome1";
    }
}
