package br.com.workme.pessoa;

import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

	public Pessoa findByEmailAndSenha(String email, String senha);
	
	public Pessoa findByCdPessoa(Long cdPessoa);
}
