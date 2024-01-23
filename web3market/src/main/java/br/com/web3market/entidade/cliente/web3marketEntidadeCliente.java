package br.com.web3market.entidade.cliente;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "000001_cliente_cadastro")

public class web3marketEntidadeCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_cliente")
	private String nome_cliente;

	@Column(name = "cpf_cliente")
	private String cpf_cliente;

	@Column(name = "whatsapp_cliente")
	private String whatsapp_cliente;

	@Column(name = "email_cliente")
	private String email_cliente;

	@Column(name = "telefone_cliente")
	private String telefone_cliente;

	@Column(name = "endereco_residencial_cliente")
	private String endereco_residencial_cliente;

	@Column(name = "endereco_entrega_cliente")
	private String endereco_entrega_cliente;

	@Column(name = "detalhes")
	private String detalhes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getWhatsapp_cliente() {
		return whatsapp_cliente;
	}

	public void setWhatsapp_cliente(String whatsapp_cliente) {
		this.whatsapp_cliente = whatsapp_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public String getEndereco_residencial_cliente() {
		return endereco_residencial_cliente;
	}

	public void setEndereco_residencial_cliente(String endereco_residencial_cliente) {
		this.endereco_residencial_cliente = endereco_residencial_cliente;
	}

	public String getEndereco_entrega_cliente() {
		return endereco_entrega_cliente;
	}

	public void setEndereco_entrega_cliente(String endereco_entrega_cliente) {
		this.endereco_entrega_cliente = endereco_entrega_cliente;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public web3marketEntidadeCliente() {}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf_cliente, detalhes, email_cliente, endereco_entrega_cliente,
				endereco_residencial_cliente, id, nome_cliente, telefone_cliente, whatsapp_cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		web3marketEntidadeCliente other = (web3marketEntidadeCliente) obj;
		return Objects.equals(cpf_cliente, other.cpf_cliente) && Objects.equals(detalhes, other.detalhes)
				&& Objects.equals(email_cliente, other.email_cliente)
				&& Objects.equals(endereco_entrega_cliente, other.endereco_entrega_cliente)
				&& Objects.equals(endereco_residencial_cliente, other.endereco_residencial_cliente)
				&& Objects.equals(id, other.id) && Objects.equals(nome_cliente, other.nome_cliente)
				&& Objects.equals(telefone_cliente, other.telefone_cliente)
				&& Objects.equals(whatsapp_cliente, other.whatsapp_cliente);
	}

	public web3marketEntidadeCliente(Long id, String nome_cliente, String cpf_cliente, String whatsapp_cliente,
			String email_cliente, String telefone_cliente, String endereco_residencial_cliente,
			String endereco_entrega_cliente, String detalhes) {
		super();
		this.id = id;
		this.nome_cliente = nome_cliente;
		this.cpf_cliente = cpf_cliente;
		this.whatsapp_cliente = whatsapp_cliente;
		this.email_cliente = email_cliente;
		this.telefone_cliente = telefone_cliente;
		this.endereco_residencial_cliente = endereco_residencial_cliente;
		this.endereco_entrega_cliente = endereco_entrega_cliente;
		this.detalhes = detalhes;
	}

}
