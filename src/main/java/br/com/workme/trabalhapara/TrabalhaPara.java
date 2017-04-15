package br.com.workme.trabalhapara;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.workme.pessoa.Pessoa;

@Entity
public class TrabalhaPara implements Serializable {

	private static final long serialVersionUID = 8804445713194031075L;

	@Id
	@ManyToOne
	@JoinColumn(name = "cd_pessoa")
	private Pessoa pessoa;

	@Id
	@ManyToOne
	@JoinColumn(name = "cd_pessoa")
	private Pessoa funcionario;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Pessoa funcionario) {
		this.funcionario = funcionario;
	}

}
