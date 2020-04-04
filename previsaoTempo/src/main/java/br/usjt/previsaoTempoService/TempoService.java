package br.usjt.previsaoTempoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaoTempo.model.Tempo;
import br.usjt.previsaoTempo.repository.TempoRepository;

@Service

public class TempoService {

	@Autowired
	private static TempoRepository tempoRepo;;

	public static void salvar (Tempo tempo) {
		tempoRepo.save(tempo);
	}

	public static List <Tempo> listarTodos (){

		return tempoRepo.findAll();

	}

}
