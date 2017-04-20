package br.com.workme.pessoa;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@RequestMapping(value = "/salvar", method = POST)
	public Pessoa salvar(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@RequestMapping(value = "/consultar", method = GET)
	public Pessoa consultar(@RequestParam Long cdPessoa) {
		return pessoaRepository.findByCdPessoa(cdPessoa);
	}

	@RequestMapping("/listar")
	public Iterable<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
}
