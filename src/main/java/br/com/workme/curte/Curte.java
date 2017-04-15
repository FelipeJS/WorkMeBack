package br.com.workme.curte;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.workme.pessoa.Pessoa;

@Entity
public class Curte implements Serializable {

	private static final long serialVersionUID = 4701686210543870101L;

	@Id
	@ManyToOne
	@JoinColumn(name = "cd_pessoa")
	private Pessoa pessoa;

	@Id
	@ManyToOne
	@JoinColumn(name = "cd_pessoa")
	private Pessoa pessoaCurtida;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoaCurtida() {
		return pessoaCurtida;
	}

	public void setPessoaCurtida(Pessoa pessoaCurtida) {
		this.pessoaCurtida = pessoaCurtida;
	}

}
