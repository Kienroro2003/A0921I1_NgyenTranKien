package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/views")
public class CalculateController {
    @GetMapping("/input")
    public String getConvert() {
        return "views/input";
    }

    @GetMapping("/convert")
    public String change(@RequestParam float usd, @RequestParam float rate, Model model) {
        float vnd = usd * rate;
        model.addAttribute("vnd",vnd);
        return "views/input";

    }
}
