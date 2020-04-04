package br.usjt.previsaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaoTempo.model.Tempo;
import br.usjt.previsaoTempo.repository.TempoRepository;
import br.usjt.previsaoTempoService.TempoService; 

@Controller 

public class PrevisaoTempoController {  
	//a injeção de dependência ocorre aqui  
	//@Autowired  
	//private TempoRepository tempoRepo;

	@Autowired 
	private TempoRepository tempoRepo;;


	@Autowired
	public PrevisaoTempoController (TempoRepository tempoRepo) {
		this.tempoRepo = tempoRepo;
	}


	@Autowired
	public void setAlunosRepo(TempoRepository tempoRepo) {
		this.tempoRepo = tempoRepo;
	}

	@GetMapping ("/tempo") 
	public ModelAndView listarTempo () {  

		ModelAndView mv = new ModelAndView("lista_alunos");
		// para modelar o formulário
		mv.addObject(new Tempo());
		// Busque a coleção com o service
		List<Tempo> tempos = TempoService.listarTodos();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("tempos", tempos);
		// devolva o ModelAndView
		return mv;

	}

	@PostMapping("/tempo")
	public String salvar(Tempo tempo) {
		//salvando com o service
		TempoService.salvar(tempo);
		return "redirect:/tempo";
	}



}
