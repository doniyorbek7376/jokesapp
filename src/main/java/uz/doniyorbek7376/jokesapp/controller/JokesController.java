package uz.doniyorbek7376.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uz.doniyorbek7376.jokesapp.service.JokesService;

@Controller
public class JokesController {

    private final JokesService service;

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", service.getRandomJoke());
        return "chucknorris";
    }

    public JokesController(JokesService service) {
        this.service = service;
    }

}
