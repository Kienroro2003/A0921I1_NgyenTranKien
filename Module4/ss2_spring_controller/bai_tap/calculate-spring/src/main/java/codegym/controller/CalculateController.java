package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/views")
public class CalculateController {
    @GetMapping("index")
    public String viewCalculate() {
        return "/views/index";
    }

    @GetMapping("/result")
    public String getCalculate(@RequestParam(value = "num1", defaultValue = "0") long num1,
                               @RequestParam(value = "num2", defaultValue = "0") long num2,
                               @RequestParam("calculator") String operator,
                               Model model) {
        long result = 0;
        switch (operator) {
            case "+": {
                result = num1 + num2;
                break;
            }
            case "-": {
                result = num1 - num2;
                break;
            }
            case "*": {
                result = num1 * num2;
                break;
            }
            case "/": {
                result = num1 / num2;
                break;
            }
        }
        model.addAttribute("result", result);
        return "/views/index";
    }
}
