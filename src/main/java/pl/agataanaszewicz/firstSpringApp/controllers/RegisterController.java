package pl.agataanaszewicz.firstSpringApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.agataanaszewicz.firstSpringApp.models.forms.RegisterForm;

@Controller
public class RegisterController {

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String registerPost(@RequestParam("login") String login,
//                               @RequestParam("password") String password,
//                               @RequestParam("passwordRepeat") String passwordRepeat,
//                               Model model){
//        String text = password.equals(passwordRepeat) ? "Zarejestrowano poprawnie" : "Hasła nie sa takie same";
//        model.addAttribute("info", text);
//        return "register";
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String registerPost(){
//        return "register";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPost(@ModelAttribute("registerForm") RegisterForm form, Model model){
        model.addAttribute("info", "Rejestracja przebiegla pomyslnie");
        // model.addAttribute("registerForm", form);
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPost(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }
}
