package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/views")
public class SandwichController {
    @GetMapping("/menu")
    public String viewMenu() {
        return "/views/menu";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        List<String> condiments = new ArrayList<>();
        condiments.addAll(Arrays.asList(condiment));
        model.addAttribute("condiments", condiments);
        return "views/menu";
    }
}
