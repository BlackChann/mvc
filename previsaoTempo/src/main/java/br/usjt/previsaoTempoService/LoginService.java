package br.usjt.previsaoTempoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaoTempo.model.Usuario;
import br.usjt.previsaoTempo.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
				usuario.getSenha()) != null;
	}
}
