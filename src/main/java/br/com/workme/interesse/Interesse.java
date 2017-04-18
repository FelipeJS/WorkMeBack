package br.com.workme.interesse;

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
public class Interesse implements Serializable{
	
	private static final long serialVersionUID = 2468835097927775601L;

	@Id
	@Column(name = "cd_interesse")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cdInteresse;
	
	@ManyToOne
	@JoinColumn(name = "cd_pessoa", referencedColumnName = "cd_pessoa")
	private Pessoa pessoa;

	private String descricao;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getCdInteresse() {
		return cdInteresse;
	}

	public void setCdInteresse(Long cdInteresse) {
		this.cdInteresse = cdInteresse;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
