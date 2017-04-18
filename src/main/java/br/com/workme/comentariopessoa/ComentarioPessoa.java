package br.com.workme.comentariopessoa;

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
public class ComentarioPessoa implements Serializable {

	private static final long serialVersionUID = -8312107080075054554L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_comentario_pessoa")
	private Long cdComentarioPessoa;
	
	@ManyToOne
	@JoinColumn(name = "cd_pessoa", referencedColumnName = "cd_pessoa")
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "cd_pessoa_comentada", referencedColumnName = "cd_pessoa")
	private Pessoa pessoaComentada;

	private String descricao;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoaComentada() {
		return pessoaComentada;
	}

	public void setPessoaComentada(Pessoa pessoaComentada) {
		this.pessoaComentada = pessoaComentada;
	}

	public Long getCdComentarioPessoa() {
		return cdComentarioPessoa;
	}

	public void setCdComentarioPessoa(Long cdComentarioPessoa) {
		this.cdComentarioPessoa = cdComentarioPessoa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
