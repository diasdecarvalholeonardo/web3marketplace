package br.com.web3market.entidade.inserirenderecopaginaproduto;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "000001_enderecos_logicos_produto_cadastro")
public class web3marketEntidadeInserirEndereco {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "cpf_cliente")
	private String cpf_cliente;
    
	@Column(name = "endereco_inserir_produto_por_cliente")
	private String endereco_inserir_produto_por_cliente;
    
	@Column(name = "endereco_inserir_produto_por_cliente_confirma")
	private String endereco_inserir_produto_por_cliente_confirma;
    
	@Column(name = "endereco_inserir_produto_por_cliente_salvo")
	private String endereco_inserir_produto_por_cliente_salvo;
    
	@Column(name = "endereco_inserir_produto_por_vendas_gerais")
	private String endereco_inserir_produto_por_vendas_gerais;
    
	@Column(name = "endereco_inserir_produto_por_vendas_gerais_confirma")
	private String endereco_inserir_produto_por_vendas_gerais_confirma;
    
	@Column(name = "endereco_inserir_produto_por_vendas_gerais_salvo")
	private String endereco_inserir_produto_por_vendas_gerais_salvo;

	public web3marketEntidadeInserirEndereco() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getEndereco_inserir_produto_por_cliente() {
		return endereco_inserir_produto_por_cliente;
	}

	public void setEndereco_inserir_produto_por_cliente(String endereco_inserir_produto_por_cliente) {
		this.endereco_inserir_produto_por_cliente = endereco_inserir_produto_por_cliente;
	}

	public String getEndereco_inserir_produto_por_cliente_confirma() {
		return endereco_inserir_produto_por_cliente_confirma;
	}

	public void setEndereco_inserir_produto_por_cliente_confirma(String endereco_inserir_produto_por_cliente_confirma) {
		this.endereco_inserir_produto_por_cliente_confirma = endereco_inserir_produto_por_cliente_confirma;
	}

	public String getEndereco_inserir_produto_por_cliente_salvo() {
		return endereco_inserir_produto_por_cliente_salvo;
	}

	public void setEndereco_inserir_produto_por_cliente_salvo(String endereco_inserir_produto_por_cliente_salvo) {
		this.endereco_inserir_produto_por_cliente_salvo = endereco_inserir_produto_por_cliente_salvo;
	}

	public String getEndereco_inserir_produto_por_vendas_gerais() {
		return endereco_inserir_produto_por_vendas_gerais;
	}

	public void setEndereco_inserir_produto_por_vendas_gerais(String endereco_inserir_produto_por_vendas_gerais) {
		this.endereco_inserir_produto_por_vendas_gerais = endereco_inserir_produto_por_vendas_gerais;
	}

	public String getEndereco_inserir_produto_por_vendas_gerais_confirma() {
		return endereco_inserir_produto_por_vendas_gerais_confirma;
	}

	public void setEndereco_inserir_produto_por_vendas_gerais_confirma(
			String endereco_inserir_produto_por_vendas_gerais_confirma) {
		this.endereco_inserir_produto_por_vendas_gerais_confirma = endereco_inserir_produto_por_vendas_gerais_confirma;
	}

	public String getEndereco_inserir_produto_por_vendas_gerais_salvo() {
		return endereco_inserir_produto_por_vendas_gerais_salvo;
	}

	public void setEndereco_inserir_produto_por_vendas_gerais_salvo(
			String endereco_inserir_produto_por_vendas_gerais_salvo) {
		this.endereco_inserir_produto_por_vendas_gerais_salvo = endereco_inserir_produto_por_vendas_gerais_salvo;
	}

	public web3marketEntidadeInserirEndereco(Long id, String cpf_cliente, String endereco_inserir_produto_por_cliente,
			String endereco_inserir_produto_por_cliente_confirma, String endereco_inserir_produto_por_cliente_salvo,
			String endereco_inserir_produto_por_vendas_gerais,
			String endereco_inserir_produto_por_vendas_gerais_confirma,
			String endereco_inserir_produto_por_vendas_gerais_salvo) {
		super();
		this.id = id;
		this.cpf_cliente = cpf_cliente;
		this.endereco_inserir_produto_por_cliente = endereco_inserir_produto_por_cliente;
		this.endereco_inserir_produto_por_cliente_confirma = endereco_inserir_produto_por_cliente_confirma;
		this.endereco_inserir_produto_por_cliente_salvo = endereco_inserir_produto_por_cliente_salvo;
		this.endereco_inserir_produto_por_vendas_gerais = endereco_inserir_produto_por_vendas_gerais;
		this.endereco_inserir_produto_por_vendas_gerais_confirma = endereco_inserir_produto_por_vendas_gerais_confirma;
		this.endereco_inserir_produto_por_vendas_gerais_salvo = endereco_inserir_produto_por_vendas_gerais_salvo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf_cliente, endereco_inserir_produto_por_cliente,
				endereco_inserir_produto_por_cliente_confirma, endereco_inserir_produto_por_cliente_salvo,
				endereco_inserir_produto_por_vendas_gerais, endereco_inserir_produto_por_vendas_gerais_confirma,
				endereco_inserir_produto_por_vendas_gerais_salvo, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		web3marketEntidadeInserirEndereco other = (web3marketEntidadeInserirEndereco) obj;
		return Objects.equals(cpf_cliente, other.cpf_cliente)
				&& Objects.equals(endereco_inserir_produto_por_cliente, other.endereco_inserir_produto_por_cliente)
				&& Objects.equals(endereco_inserir_produto_por_cliente_confirma,
						other.endereco_inserir_produto_por_cliente_confirma)
				&& Objects.equals(endereco_inserir_produto_por_cliente_salvo,
						other.endereco_inserir_produto_por_cliente_salvo)
				&& Objects.equals(endereco_inserir_produto_por_vendas_gerais,
						other.endereco_inserir_produto_por_vendas_gerais)
				&& Objects.equals(endereco_inserir_produto_por_vendas_gerais_confirma,
						other.endereco_inserir_produto_por_vendas_gerais_confirma)
				&& Objects.equals(endereco_inserir_produto_por_vendas_gerais_salvo,
						other.endereco_inserir_produto_por_vendas_gerais_salvo)
				&& Objects.equals(id, other.id);
	}
	
}
