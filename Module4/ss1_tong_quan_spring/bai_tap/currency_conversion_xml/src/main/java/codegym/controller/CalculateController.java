package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/view")
public class CalculateController {
    @RequestMapping("/calculate")
    public String calculate(){
        return "/calculate";
    }

    @PostMapping("/convert")
    public String getCalculate(@RequestParam(value = "usd",defaultValue = "0") float usd, @RequestParam("rate") float rate, Model model){
        float vnd = usd * rate;
        model.addAttribute("vnd",vnd);
        model.addAttribute("usd",usd);

        return "/calculate";
    }
}
