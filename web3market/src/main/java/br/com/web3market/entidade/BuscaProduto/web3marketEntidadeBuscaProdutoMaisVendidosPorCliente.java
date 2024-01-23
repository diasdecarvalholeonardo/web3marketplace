package br.com.web3market.entidade.BuscaProduto;

import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "000001_produto_cadastro_busca_produtos_mais_vendidos_por_cliente")
public class web3marketEntidadeBuscaProdutoMaisVendidosPorCliente {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "cpf_cliente")
	private String cpf_cliente;
    
	@Column(name = "produtoSelecionado")
	private String produtoSelecionado;
    
	@Column(name = "produtoSelecionado_categoria_adCarrinho")
	private String produtoSelecionado_categoria_adCarrinho;
    
	@Column(name = "mediaPreco_Produtoindividual_adCarrinho")
	private String mediaPreco_Produtoindividual_adCarrinho;
    
	@Column(name = "modaPreco_Produtoindividual_adCarrinho")
	private String modaPreco_Produtoindividual_adCarrinho;
    
	@Column(name = "PrecoMaisCaro_Produtoindividual_adCarrinho")
	private String PrecoMaisCaro_Produtoindividual_adCarrinho;
    
	@Column(name = "modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho")
	private String modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho;
    
	@Column(name = "PrecoMaisBarato_Produtoindividual_adCarrinho")
	private String PrecoMaisBarato_Produtoindividual_adCarrinho;
    
	@Column(name = "modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho")
	private String modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho;
   
	@Column(name = "produtoSelecionado_categoria_adCarrinho_comprei")
	private String produtoSelecionado_categoria_adCarrinho_comprei;	
    
	@Column(name = "tipoProduto_PreferenciaPessoal")
	private String tipoProduto_PreferenciaPessoal;	
    
	@Column(name = "PreferenciaPessoal")
	private String PreferenciaPessoal;	
    
	@Column(name = "grau_preferencia")
	private String grau_preferencia;

	public web3marketEntidadeBuscaProdutoMaisVendidosPorCliente() {}

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

	public String getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(String produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public String getProdutoSelecionado_categoria_adCarrinho() {
		return produtoSelecionado_categoria_adCarrinho;
	}

	public void setProdutoSelecionado_categoria_adCarrinho(String produtoSelecionado_categoria_adCarrinho) {
		this.produtoSelecionado_categoria_adCarrinho = produtoSelecionado_categoria_adCarrinho;
	}

	public String getMediaPreco_Produtoindividual_adCarrinho() {
		return mediaPreco_Produtoindividual_adCarrinho;
	}

	public void setMediaPreco_Produtoindividual_adCarrinho(String mediaPreco_Produtoindividual_adCarrinho) {
		this.mediaPreco_Produtoindividual_adCarrinho = mediaPreco_Produtoindividual_adCarrinho;
	}

	public String getModaPreco_Produtoindividual_adCarrinho() {
		return modaPreco_Produtoindividual_adCarrinho;
	}

	public void setModaPreco_Produtoindividual_adCarrinho(String modaPreco_Produtoindividual_adCarrinho) {
		this.modaPreco_Produtoindividual_adCarrinho = modaPreco_Produtoindividual_adCarrinho;
	}

	public String getPrecoMaisCaro_Produtoindividual_adCarrinho() {
		return PrecoMaisCaro_Produtoindividual_adCarrinho;
	}

	public void setPrecoMaisCaro_Produtoindividual_adCarrinho(String precoMaisCaro_Produtoindividual_adCarrinho) {
		PrecoMaisCaro_Produtoindividual_adCarrinho = precoMaisCaro_Produtoindividual_adCarrinho;
	}

	public String getModaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho() {
		return modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho;
	}

	public void setModaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho(
			String modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho) {
		this.modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho = modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho;
	}

	public String getPrecoMaisBarato_Produtoindividual_adCarrinho() {
		return PrecoMaisBarato_Produtoindividual_adCarrinho;
	}

	public void setPrecoMaisBarato_Produtoindividual_adCarrinho(String precoMaisBarato_Produtoindividual_adCarrinho) {
		PrecoMaisBarato_Produtoindividual_adCarrinho = precoMaisBarato_Produtoindividual_adCarrinho;
	}

	public String getModaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho() {
		return modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho;
	}

	public void setModaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho(
			String modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho) {
		this.modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho = modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho;
	}

	public String getProdutoSelecionado_categoria_adCarrinho_comprei() {
		return produtoSelecionado_categoria_adCarrinho_comprei;
	}

	public void setProdutoSelecionado_categoria_adCarrinho_comprei(String produtoSelecionado_categoria_adCarrinho_comprei) {
		this.produtoSelecionado_categoria_adCarrinho_comprei = produtoSelecionado_categoria_adCarrinho_comprei;
	}

	public String getTipoProduto_PreferenciaPessoal() {
		return tipoProduto_PreferenciaPessoal;
	}

	public void setTipoProduto_PreferenciaPessoal(String tipoProduto_PreferenciaPessoal) {
		this.tipoProduto_PreferenciaPessoal = tipoProduto_PreferenciaPessoal;
	}

	public String getPreferenciaPessoal() {
		return PreferenciaPessoal;
	}

	public void setPreferenciaPessoal(String preferenciaPessoal) {
		PreferenciaPessoal = preferenciaPessoal;
	}

	public String getGrau_preferencia() {
		return grau_preferencia;
	}

	public void setGrau_preferencia(String grau_preferencia) {
		this.grau_preferencia = grau_preferencia;
	}



}
