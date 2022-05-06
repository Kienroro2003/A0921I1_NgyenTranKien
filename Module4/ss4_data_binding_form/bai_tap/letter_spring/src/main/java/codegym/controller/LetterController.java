package codegym.controller;

import codegym.model.Letter;
import codegym.service.ILetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/letter")
public class LetterController {
    @Autowired
    private ILetterService letterService;
    @GetMapping("")
    public String list(Model model){
        model.addAttribute("letters",letterService.findAll());
        return "/list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id")Letter letter, Model model){
        model.addAttribute("letter",letter);
        String[] languages ={"English","Vietnamese","Japanese","Chinese"};
        String[] pageSizes = {"5","7", "9", "11","13","18","15","28"};
        model.addAttribute("languages",languages);
        model.addAttribute("pageSizes",pageSizes);
        return "/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("letter")Letter letter){
        letterService.update(letter);
        return "redirect:/letter";

    }
}
