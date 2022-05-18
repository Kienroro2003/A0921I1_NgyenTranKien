package codegym.controller;

import codegym.entity.Declaration;
import codegym.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/declaration")
public class DeclarationController {
    @Autowired
    private DeclarationService declarationService;

    @GetMapping("/create")
    public ModelAndView getCreate(){
        String[] vehicles = {"Tàu bay", "Tàu thuyền", "Ô tô", "Khác"};
        ModelAndView modelAndView = new ModelAndView("/create","declaration",new Declaration());
        modelAndView.addObject("vehicles",vehicles);
        String[] sex = {"Male","Female"};
        modelAndView.addObject("sex",sex);
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView getList(){
        ModelAndView modelAndView = new ModelAndView("/list","declarations",declarationService.findAll());

        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView addDeclaration(@ModelAttribute("declaration")Declaration declaration){
        ModelAndView modelAndView = new ModelAndView("redirect:/declaration/list");
        declarationService.create(declaration);
        return modelAndView;
    }

    @GetMapping("/update")
    public ModelAndView viewUpdate(@RequestParam("name")Declaration declaration){
        ModelAndView modelAndView = new ModelAndView("/update","declaration",declaration);
        String[] sex = {"Male","Female"};
        modelAndView.addObject("sex",sex);
        String[] vehicles = {"Tàu bay", "Tàu thuyền", "Ô tô", "Khác"};
        modelAndView.addObject("vehicles",vehicles);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView getUpdate(@ModelAttribute("declaration")Declaration declaration){
        ModelAndView modelAndView = new ModelAndView("redirect:/declaration/list");
        declarationService.update(declaration);
        return modelAndView;
    }

//    @PostMapping("/update")
}
