package br.com.workme.solicitacao;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import br.com.workme.pessoa.Pessoa;
import br.com.workme.servico.Servico;

@Entity
public class Solicitacao implements Serializable {

	private static final long serialVersionUID = -3844635838578163136L;

	@Id
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "cd_pessoa"), @JoinColumn(name = "cd_servico") })
	private Servico servico;

	@Id
	@ManyToOne
	@JoinColumn(name = "cd_solicitante")
	private Pessoa solicitante;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_solicitacao")
	private Long cdSolicitacao;

	@Column(name = "dh_solicitacao")
	private Calendar dhSolicitacao;

	private String descricao;

	private String status;

	@Column(name = "motivo_recusado")
	private String motivoRecusado;

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Pessoa getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Pessoa solicitante) {
		this.solicitante = solicitante;
	}

	public Long getCdSolicitacao() {
		return cdSolicitacao;
	}

	public void setCdSolicitacao(Long cdSolicitacao) {
		this.cdSolicitacao = cdSolicitacao;
	}

	public Calendar getDhSolicitacao() {
		return dhSolicitacao;
	}

	public void setDhSolicitacao(Calendar dhSolicitacao) {
		this.dhSolicitacao = dhSolicitacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotivoRecusado() {
		return motivoRecusado;
	}

	public void setMotivoRecusado(String motivoRecusado) {
		this.motivoRecusado = motivoRecusado;
	}

}
