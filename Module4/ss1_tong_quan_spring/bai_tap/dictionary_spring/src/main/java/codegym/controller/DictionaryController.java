package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("views")
public class DictionaryController {
        private static Map<String, String> map = new HashMap<>();
        static {
            map.put("hello","xin chào");
            map.put("goodbye","tam biet");
            map.put("good morning","chao buoi sang");
        }
    @GetMapping("/dictionary")
    public String getDictionary() {
        return "views/dictionary";
    }

    @GetMapping("/getDictionary")
    public String getDictionary(@RequestParam String eng, Model model){
            String fixEng = eng.toLowerCase();
            String result = "";
            if(map.containsKey(fixEng)){
                result = map.get(fixEng);
            }else{
                result = "Khong ton tai";
            }
            model.addAttribute("result",result);
            return "views/dictionary";
    }
}
