package codegym.controller;

import codegym.entity.Song;
import codegym.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("songs",songService.findAll());
        return "/song/list";
    }

    //get view create
    @GetMapping("/create")
    public ModelAndView viewCreate(){
        return new ModelAndView("/song/create","song",new Song());
    }

    // submit create
    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("song")Song song){
        songService.create(song);
        return new ModelAndView("redirect:/song/list");
    }

    @GetMapping("/update/{id}")
    public ModelAndView viewUpdate(@PathVariable("id")Song song){
        return new ModelAndView("/song/update","song",song);
    }

    @PostMapping("/update")
    public ModelAndView update(Song song){
        songService.update(song);
        return new ModelAndView("redirect:/song/list");
    }

    @GetMapping("/delete/{id}")
    public String getDelete(@PathVariable("id")int id, Model model){
        songService.delete(id);
        return "redirect:/song/list";
    }
}
