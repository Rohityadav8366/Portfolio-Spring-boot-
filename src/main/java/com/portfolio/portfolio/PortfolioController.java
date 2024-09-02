package com.portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class PortfolioController {
    @GetMapping("/get")
    public String home(Model model)
    {
        model.addAttribute("name","Rohit Kumar Yadav");
        model.addAttribute("profession","Software Develeoper");
        return "index";
    }
}
