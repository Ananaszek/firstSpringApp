package pl.agataanaszewicz.firstSpringApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class MainController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){

        String[] texts = {"HEJ!", "Ale jestem glodny!", "Ladny dzis dzien!"};
        model.addAttribute("helloMsg", texts[new Random().nextInt(texts.length)]);
        return "index";
    }

    @RequestMapping(value = "/message/{text}", method = RequestMethod.GET)
    @ResponseBody
    public String oskar(@PathVariable("text") String text){
        return "<center>" + text + "</center>";
    }

    @RequestMapping(value = "/age/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String age(@PathVariable("age") int age){
        return age >= 18 ? "Jesteś pełnoletni " : "Nie jesteś pełnoletni!";
    }

}
