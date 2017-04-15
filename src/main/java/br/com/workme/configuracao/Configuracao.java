package br.com.workme.configuracao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.workme.pessoa.Pessoa;

@Entity
public class Configuracao implements Serializable {

	private static final long serialVersionUID = -6024059583275516567L;

	@Id
	@OneToOne
	@JoinColumn(name = "cd_pessoa")
	private Pessoa pessoa;

	@Column(name = "sn_empresa")
	private Boolean snEmpresa;

	@Column(name = "sn_cliente")
	private Boolean snCliente;

	@Column(name = "sn_documento")
	private Boolean snDocumento;

	@Column(name = "sn_nome")
	private Boolean snNome;

	@Column(name = "sn_fantasia")
	private Boolean snFantasia;

	@Column(name = "sn_telefone")
	private Boolean snTelefone;

	@Column(name = "sn_endereco")
	private Boolean snEndereco;

	@Column(name = "sn_bairro")
	private Boolean snBairro;

	@Column(name = "sn_cidade")
	private Boolean snCidade;

	@Column(name = "sn_estado")
	private Boolean snEstado;

	@Column(name = "sn_email")
	private Boolean snEmail;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Boolean getSnEmpresa() {
		return snEmpresa;
	}

	public void setSnEmpresa(Boolean snEmpresa) {
		this.snEmpresa = snEmpresa;
	}

	public Boolean getSnCliente() {
		return snCliente;
	}

	public void setSnCliente(Boolean snCliente) {
		this.snCliente = snCliente;
	}

	public Boolean getSnDocumento() {
		return snDocumento;
	}

	public void setSnDocumento(Boolean snDocumento) {
		this.snDocumento = snDocumento;
	}

	public Boolean getSnNome() {
		return snNome;
	}

	public void setSnNome(Boolean snNome) {
		this.snNome = snNome;
	}

	public Boolean getSnFantasia() {
		return snFantasia;
	}

	public void setSnFantasia(Boolean snFantasia) {
		this.snFantasia = snFantasia;
	}

	public Boolean getSnTelefone() {
		return snTelefone;
	}

	public void setSnTelefone(Boolean snTelefone) {
		this.snTelefone = snTelefone;
	}

	public Boolean getSnEndereco() {
		return snEndereco;
	}

	public void setSnEndereco(Boolean snEndereco) {
		this.snEndereco = snEndereco;
	}

	public Boolean getSnBairro() {
		return snBairro;
	}

	public void setSnBairro(Boolean snBairro) {
		this.snBairro = snBairro;
	}

	public Boolean getSnCidade() {
		return snCidade;
	}

	public void setSnCidade(Boolean snCidade) {
		this.snCidade = snCidade;
	}

	public Boolean getSnEstado() {
		return snEstado;
	}

	public void setSnEstado(Boolean snEstado) {
		this.snEstado = snEstado;
	}

	public Boolean getSnEmail() {
		return snEmail;
	}

	public void setSnEmail(Boolean snEmail) {
		this.snEmail = snEmail;
	}

}
