package br.com.workme.trabalhapara;

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
public class TrabalhaPara implements Serializable {

	private static final long serialVersionUID = 8804445713194031075L;

	@Id
	@Column(name = "cd_trabalha_para")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cdTrabalhaPara;
	
	@ManyToOne
	@JoinColumn(name = "cd_pessoa", referencedColumnName = "cd_pessoa")
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "cd_funcionario", referencedColumnName = "cd_pessoa")
	private Pessoa funcionario;

	public Long getCdTrabalhaPara() {
		return cdTrabalhaPara;
	}

	public void setCdTrabalhaPara(Long cdTrabalhaPara) {
		this.cdTrabalhaPara = cdTrabalhaPara;
	}

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
