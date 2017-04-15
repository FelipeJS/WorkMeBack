package br.com.workme.pessoa;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@RequestMapping(value = "/salvar", method = POST)
	public Pessoa salvar(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@RequestMapping("/listar")
	public Iterable<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
}
