package br.com.workme.comentariosolicitacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import br.com.workme.solicitacao.Solicitacao;

@Entity
public class ComentarioSolicitacao implements Serializable {

	private static final long serialVersionUID = -1569393899885639699L;

	@Id
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "cd_pessoa", referencedColumnName = "cd_pessoa"),
			@JoinColumn(name = "cd_servico", referencedColumnName = "cd_servico"),
			@JoinColumn(name = "cd_solicitante", referencedColumnName = "cd_solicitante"),
			@JoinColumn(name = "cd_solicitacao", referencedColumnName = "cd_solicitacao") })
	private Solicitacao solicitacao;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_comentario_solicitacao")
	private Long cdComentarioSolicitacao;

	private String descricao;

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Long getCdComentarioSolicitacao() {
		return cdComentarioSolicitacao;
	}

	public void setCdComentarioSolicitacao(Long cdComentarioSolicitacao) {
		this.cdComentarioSolicitacao = cdComentarioSolicitacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
