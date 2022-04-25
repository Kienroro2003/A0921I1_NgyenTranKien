package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    private static Map<String, String> map = new HashMap<>();
    static{
        map.put("hello","xin chao");
    }

    @GetMapping("/dictionary")
    public String dictionary(){
        return "/dictionary/dictionary";
    }

    @GetMapping("/getDictionary")
    public String getDictionary(@RequestParam("eng") String eng, Model model){
        String result = "Khong ton tai";
        if(map.containsKey(eng)){
            result = map.get(eng);
        }
        model.addAttribute("result",result);
        model.addAttribute("eng",eng);
        return "/dictionary/dictionary";
    }
}
