package br.com.web3market.entidade.BuscaProduto;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sf_produto_cadastro_busca_produtos_mais_vendidos_website")
public class web3marketEntidadeBuscaProdutoMaisVendidosWebsite {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "produtoSelecionado")
	private String produtoSelecionado;
	
	@Column(name = "produtoSelecionado_categoria")
	private String produtoSelecionado_categoria;
	
	@Column(name = "modaPreco_produtoSelecionado_categoria")
	private String modaPreco_produtoSelecionado_categoria;
	
	@Column(name = "produtoSelecionado_categoria_adCarrinho")
	private String produtoSelecionado_categoria_adCarrinho;
	
	@Column(name = "modaPreco_ProdutoSelecionado_categoria_adCarrinho")
	private String modaPreco_ProdutoSelecionado_categoria_adCarrinho;
	
	@Column(name = "produtoSelecionado_categoria_adCarrinho_vendido")
	private String produtoSelecionado_categoria_adCarrinho_vendido;
	
	@Column(name = "modaPreco_ProdutoSelecionado_adCarrinho_vendido")
	private String modaPreco_ProdutoSelecionado_adCarrinho_vendido;
	
	@Column(name = "PreferenciaGeral")
	private String PreferenciaGeral;
	
	@Column(name = "moda_PreferenciaGeral")
	private String moda_PreferenciaGeral;
	
	@Column(name = "grau_preferencia")
	private String grau_preferencia;
	
	@Column(name = "mediaPreco_Produtoindividual_adCarrinho")
	private String mediaPreco_Produtoindividual_adCarrinho;
	
	@Column(name = "moda_mediaPreco_Produtoindividual_adCarrinho")
	private String moda_mediaPreco_Produtoindividual_adCarrinho;
	
	@Column(name = "mediaPreco_Produtoindividual_adCarrinho_vendido")
	private String mediaPreco_Produtoindividual_adCarrinho_vendido;
	
	@Column(name = "moda_mediaPreco_Produtoindividual_adCarrinho_vendido")
	private String moda_mediaPreco_Produtoindividual_adCarrinho_vendido;

	public web3marketEntidadeBuscaProdutoMaisVendidosWebsite() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(String produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public String getProdutoSelecionado_categoria() {
		return produtoSelecionado_categoria;
	}

	public void setProdutoSelecionado_categoria(String produtoSelecionado_categoria) {
		this.produtoSelecionado_categoria = produtoSelecionado_categoria;
	}

	public String getModaPreco_produtoSelecionado_categoria() {
		return modaPreco_produtoSelecionado_categoria;
	}

	public void setModaPreco_produtoSelecionado_categoria(String modaPreco_produtoSelecionado_categoria) {
		this.modaPreco_produtoSelecionado_categoria = modaPreco_produtoSelecionado_categoria;
	}

	public String getProdutoSelecionado_categoria_adCarrinho() {
		return produtoSelecionado_categoria_adCarrinho;
	}

	public void setProdutoSelecionado_categoria_adCarrinho(String produtoSelecionado_categoria_adCarrinho) {
		this.produtoSelecionado_categoria_adCarrinho = produtoSelecionado_categoria_adCarrinho;
	}

	public String getModaPreco_ProdutoSelecionado_categoria_adCarrinho() {
		return modaPreco_ProdutoSelecionado_categoria_adCarrinho;
	}

	public void setModaPreco_ProdutoSelecionado_categoria_adCarrinho(
			String modaPreco_ProdutoSelecionado_categoria_adCarrinho) {
		this.modaPreco_ProdutoSelecionado_categoria_adCarrinho = modaPreco_ProdutoSelecionado_categoria_adCarrinho;
	}

	public String getProdutoSelecionado_categoria_adCarrinho_vendido() {
		return produtoSelecionado_categoria_adCarrinho_vendido;
	}

	public void setProdutoSelecionado_categoria_adCarrinho_vendido(String produtoSelecionado_categoria_adCarrinho_vendido) {
		this.produtoSelecionado_categoria_adCarrinho_vendido = produtoSelecionado_categoria_adCarrinho_vendido;
	}

	public String getModaPreco_ProdutoSelecionado_adCarrinho_vendido() {
		return modaPreco_ProdutoSelecionado_adCarrinho_vendido;
	}

	public void setModaPreco_ProdutoSelecionado_adCarrinho_vendido(String modaPreco_ProdutoSelecionado_adCarrinho_vendido) {
		this.modaPreco_ProdutoSelecionado_adCarrinho_vendido = modaPreco_ProdutoSelecionado_adCarrinho_vendido;
	}

	public String getPreferenciaGeral() {
		return PreferenciaGeral;
	}

	public void setPreferenciaGeral(String preferenciaGeral) {
		PreferenciaGeral = preferenciaGeral;
	}

	public String getModa_PreferenciaGeral() {
		return moda_PreferenciaGeral;
	}

	public void setModa_PreferenciaGeral(String moda_PreferenciaGeral) {
		this.moda_PreferenciaGeral = moda_PreferenciaGeral;
	}

	public String getGrau_preferencia() {
		return grau_preferencia;
	}

	public void setGrau_preferencia(String grau_preferencia) {
		this.grau_preferencia = grau_preferencia;
	}

	public String getMediaPreco_Produtoindividual_adCarrinho() {
		return mediaPreco_Produtoindividual_adCarrinho;
	}

	public void setMediaPreco_Produtoindividual_adCarrinho(String mediaPreco_Produtoindividual_adCarrinho) {
		this.mediaPreco_Produtoindividual_adCarrinho = mediaPreco_Produtoindividual_adCarrinho;
	}

	public String getModa_mediaPreco_Produtoindividual_adCarrinho() {
		return moda_mediaPreco_Produtoindividual_adCarrinho;
	}

	public void setModa_mediaPreco_Produtoindividual_adCarrinho(String moda_mediaPreco_Produtoindividual_adCarrinho) {
		this.moda_mediaPreco_Produtoindividual_adCarrinho = moda_mediaPreco_Produtoindividual_adCarrinho;
	}

	public String getMediaPreco_Produtoindividual_adCarrinho_vendido() {
		return mediaPreco_Produtoindividual_adCarrinho_vendido;
	}

	public void setMediaPreco_Produtoindividual_adCarrinho_vendido(String mediaPreco_Produtoindividual_adCarrinho_vendido) {
		this.mediaPreco_Produtoindividual_adCarrinho_vendido = mediaPreco_Produtoindividual_adCarrinho_vendido;
	}

	public String getModa_mediaPreco_Produtoindividual_adCarrinho_vendido() {
		return moda_mediaPreco_Produtoindividual_adCarrinho_vendido;
	}

	public void setModa_mediaPreco_Produtoindividual_adCarrinho_vendido(
			String moda_mediaPreco_Produtoindividual_adCarrinho_vendido) {
		this.moda_mediaPreco_Produtoindividual_adCarrinho_vendido = moda_mediaPreco_Produtoindividual_adCarrinho_vendido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PreferenciaGeral, grau_preferencia, id, mediaPreco_Produtoindividual_adCarrinho,
				mediaPreco_Produtoindividual_adCarrinho_vendido, modaPreco_ProdutoSelecionado_adCarrinho_vendido,
				modaPreco_ProdutoSelecionado_categoria_adCarrinho, modaPreco_produtoSelecionado_categoria,
				moda_PreferenciaGeral, moda_mediaPreco_Produtoindividual_adCarrinho,
				moda_mediaPreco_Produtoindividual_adCarrinho_vendido, produtoSelecionado, produtoSelecionado_categoria,
				produtoSelecionado_categoria_adCarrinho, produtoSelecionado_categoria_adCarrinho_vendido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		web3marketEntidadeBuscaProdutoMaisVendidosWebsite other = (web3marketEntidadeBuscaProdutoMaisVendidosWebsite) obj;
		return Objects.equals(PreferenciaGeral, other.PreferenciaGeral)
				&& Objects.equals(grau_preferencia, other.grau_preferencia) && Objects.equals(id, other.id)
				&& Objects.equals(mediaPreco_Produtoindividual_adCarrinho,
						other.mediaPreco_Produtoindividual_adCarrinho)
				&& Objects.equals(mediaPreco_Produtoindividual_adCarrinho_vendido,
						other.mediaPreco_Produtoindividual_adCarrinho_vendido)
				&& Objects.equals(modaPreco_ProdutoSelecionado_adCarrinho_vendido,
						other.modaPreco_ProdutoSelecionado_adCarrinho_vendido)
				&& Objects.equals(modaPreco_ProdutoSelecionado_categoria_adCarrinho,
						other.modaPreco_ProdutoSelecionado_categoria_adCarrinho)
				&& Objects.equals(modaPreco_produtoSelecionado_categoria, other.modaPreco_produtoSelecionado_categoria)
				&& Objects.equals(moda_PreferenciaGeral, other.moda_PreferenciaGeral)
				&& Objects.equals(moda_mediaPreco_Produtoindividual_adCarrinho,
						other.moda_mediaPreco_Produtoindividual_adCarrinho)
				&& Objects.equals(moda_mediaPreco_Produtoindividual_adCarrinho_vendido,
						other.moda_mediaPreco_Produtoindividual_adCarrinho_vendido)
				&& Objects.equals(produtoSelecionado, other.produtoSelecionado)
				&& Objects.equals(produtoSelecionado_categoria, other.produtoSelecionado_categoria)
				&& Objects.equals(produtoSelecionado_categoria_adCarrinho,
						other.produtoSelecionado_categoria_adCarrinho)
				&& Objects.equals(produtoSelecionado_categoria_adCarrinho_vendido,
						other.produtoSelecionado_categoria_adCarrinho_vendido);
	}

	public web3marketEntidadeBuscaProdutoMaisVendidosWebsite(Long id, String produtoSelecionado,
			String produtoSelecionado_categoria, String modaPreco_produtoSelecionado_categoria,
			String produtoSelecionado_categoria_adCarrinho, String modaPreco_ProdutoSelecionado_categoria_adCarrinho,
			String produtoSelecionado_categoria_adCarrinho_vendido,
			String modaPreco_ProdutoSelecionado_adCarrinho_vendido, String preferenciaGeral,
			String moda_PreferenciaGeral, String grau_preferencia, String mediaPreco_Produtoindividual_adCarrinho,
			String moda_mediaPreco_Produtoindividual_adCarrinho, String mediaPreco_Produtoindividual_adCarrinho_vendido,
			String moda_mediaPreco_Produtoindividual_adCarrinho_vendido) {
		super();
		this.id = id;
		this.produtoSelecionado = produtoSelecionado;
		this.produtoSelecionado_categoria = produtoSelecionado_categoria;
		this.modaPreco_produtoSelecionado_categoria = modaPreco_produtoSelecionado_categoria;
		this.produtoSelecionado_categoria_adCarrinho = produtoSelecionado_categoria_adCarrinho;
		this.modaPreco_ProdutoSelecionado_categoria_adCarrinho = modaPreco_ProdutoSelecionado_categoria_adCarrinho;
		this.produtoSelecionado_categoria_adCarrinho_vendido = produtoSelecionado_categoria_adCarrinho_vendido;
		this.modaPreco_ProdutoSelecionado_adCarrinho_vendido = modaPreco_ProdutoSelecionado_adCarrinho_vendido;
		PreferenciaGeral = preferenciaGeral;
		this.moda_PreferenciaGeral = moda_PreferenciaGeral;
		this.grau_preferencia = grau_preferencia;
		this.mediaPreco_Produtoindividual_adCarrinho = mediaPreco_Produtoindividual_adCarrinho;
		this.moda_mediaPreco_Produtoindividual_adCarrinho = moda_mediaPreco_Produtoindividual_adCarrinho;
		this.mediaPreco_Produtoindividual_adCarrinho_vendido = mediaPreco_Produtoindividual_adCarrinho_vendido;
		this.moda_mediaPreco_Produtoindividual_adCarrinho_vendido = moda_mediaPreco_Produtoindividual_adCarrinho_vendido;
	}
		
}
