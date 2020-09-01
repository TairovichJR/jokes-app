package guru.springframework.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.services.JokesService;

@Controller
public class JokesController {

	private final JokesService jokesService;

	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		return "chucknorris";
	}
	
	
	
}
