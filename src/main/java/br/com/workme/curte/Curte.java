package br.com.workme.curte;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.workme.pessoa.Pessoa;

@Entity
public class Curte implements Serializable {

	private static final long serialVersionUID = 4701686210543870101L;

	@Id
	@Column(name = "cd_curte")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cdCurte;
	
	@ManyToOne
	@JoinColumn(name = "cd_pessoa", referencedColumnName = "cd_pessoa")
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "cd_pessoa_curtida", referencedColumnName = "cd_pessoa")
	private Pessoa pessoaCurtida;

	public Long getCdCurte() {
		return cdCurte;
	}

	public void setCdCurte(Long cdCurte) {
		this.cdCurte = cdCurte;
	}

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
