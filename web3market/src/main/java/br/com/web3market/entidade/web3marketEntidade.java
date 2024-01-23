package br.com.web3market.entidade;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sf_produto_cadastro")

public class web3marketEntidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numero_funcionario_produto")
	private String numero_funcionario_produto;

	@Column(name = "nome_cliente")
	private String nome_cliente;

	@Column(name = "cpf_cliente")
	private String cpf_cliente;

	@Column(name = "nome_fornecedor")
	private String nome_fornecedor;

	@Column(name = "numero_fornecedor")
	private String numero_fornecedor;

	@Column(name = "produto_preco")
	private String produto_preco;

	@Column(name = "produto_warehouseAddress")
	private String produto_warehouseAddress;

	@Column(name = "produto_tamanho")
	private String produto_tamanho;

	@Column(name = "quantidade_produto")
	private String quantidade_produto;

	@Column(name = "data_entrada_produto")
	private String data_entrada_produto;// dia e hora

	@Column(name = "data_saida_produto")
	private String data_saida_produto;// dia e hora
	
	@Column(name = "detalhes")
	private String detalhes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero_funcionario_produto() {
		return numero_funcionario_produto;
	}

	public void setNumero_funcionario_produto(String numero_funcionario_produto) {
		this.numero_funcionario_produto = numero_funcionario_produto;
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

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public String getNumero_fornecedor() {
		return numero_fornecedor;
	}

	public void setNumero_fornecedor(String numero_fornecedor) {
		this.numero_fornecedor = numero_fornecedor;
	}

	public String getProduto_preco() {
		return produto_preco;
	}

	public void setProduto_preco(String produto_preco) {
		this.produto_preco = produto_preco;
	}

	public String getProduto_warehouseAddress() {
		return produto_warehouseAddress;
	}

	public void setProduto_warehouseAddress(String produto_warehouseAddress) {
		this.produto_warehouseAddress = produto_warehouseAddress;
	}

	public String getProduto_tamanho() {
		return produto_tamanho;
	}

	public void setProduto_tamanho(String produto_tamanho) {
		this.produto_tamanho = produto_tamanho;
	}

	public String getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(String quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public String getData_entrada_produto() {
		return data_entrada_produto;
	}

	public void setData_entrada_produto(String data_entrada_produto) {
		this.data_entrada_produto = data_entrada_produto;
	}

	public String getData_saida_produto() {
		return data_saida_produto;
	}

	public void setData_saida_produto(String data_saida_produto) {
		this.data_saida_produto = data_saida_produto;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public web3marketEntidade() {}
	
	public web3marketEntidade(Long id, String numero_funcionario_produto, String nome_cliente, String cpf_cliente,
			String nome_fornecedor, String numero_fornecedor, String produto_preco, String produto_warehouseAddress,
			String produto_tamanho, String quantidade_produto, String data_entrada_produto, String data_saida_produto,
			String detalhes) {
		super();
		this.id = id;
		this.numero_funcionario_produto = numero_funcionario_produto;
		this.nome_cliente = nome_cliente;
		this.cpf_cliente = cpf_cliente;
		this.nome_fornecedor = nome_fornecedor;
		this.numero_fornecedor = numero_fornecedor;
		this.produto_preco = produto_preco;
		this.produto_warehouseAddress = produto_warehouseAddress;
		this.produto_tamanho = produto_tamanho;
		this.quantidade_produto = quantidade_produto;
		this.data_entrada_produto = data_entrada_produto;
		this.data_saida_produto = data_saida_produto;
		this.detalhes = detalhes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf_cliente, data_entrada_produto, data_saida_produto, detalhes, id, nome_cliente,
				nome_fornecedor, numero_fornecedor, numero_funcionario_produto, produto_preco, produto_tamanho,
				produto_warehouseAddress, quantidade_produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		web3marketEntidade other = (web3marketEntidade) obj;
		return Objects.equals(cpf_cliente, other.cpf_cliente)
				&& Objects.equals(data_entrada_produto, other.data_entrada_produto)
				&& Objects.equals(data_saida_produto, other.data_saida_produto)
				&& Objects.equals(detalhes, other.detalhes) && Objects.equals(id, other.id)
				&& Objects.equals(nome_cliente, other.nome_cliente)
				&& Objects.equals(nome_fornecedor, other.nome_fornecedor)
				&& Objects.equals(numero_fornecedor, other.numero_fornecedor)
				&& Objects.equals(numero_funcionario_produto, other.numero_funcionario_produto)
				&& Objects.equals(produto_preco, other.produto_preco)
				&& Objects.equals(produto_tamanho, other.produto_tamanho)
				&& Objects.equals(produto_warehouseAddress, other.produto_warehouseAddress)
				&& Objects.equals(quantidade_produto, other.quantidade_produto);
	}		
}
