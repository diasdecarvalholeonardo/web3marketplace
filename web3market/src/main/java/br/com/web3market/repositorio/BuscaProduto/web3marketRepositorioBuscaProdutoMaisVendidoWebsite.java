package br.com.web3market.repositorio.BuscaProduto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosWebsite;

@Repository
public interface web3marketRepositorioBuscaProdutoMaisVendidoWebsite extends JpaRepository<web3marketEntidadeBuscaProdutoMaisVendidosWebsite, Long> {
	@Modifying
	@Query(value = "INSERT INTO 000001_produto_cadastro_busca_produtos_mais_vendidos_website ("
			+ "                 produtoSelecionado,"
			+ "                 produtoSelecionado_categoria,"
			+ "                 modaPreco_produtoSelecionado_categoria, "
			+ "                 produtoSelecionado_categoria_adCarrinho,"
			+ "                 modaPreco_ProdutoSelecionado_categoria_adCarrinho, "
			+ "                 produtoSelecionado_categoria_adCarrinho_vendido,"
			+ "                 modaPreco_ProdutoSelecionado_adCarrinho_vendido,"
			+ "                 PreferenciaGeral,"
			+ "                 moda_PreferenciaGeral,"
			+ "                 grau_preferencia,"
			+ "                 mediaPreco_Produtoindividual_adCarrinho,"
			+ "                 moda_mediaPreco_Produtoindividual_adCarrinho,"
			+ "                 mediaPreco_Produtoindividual_adCarrinho_vendido,"
			+ "                 moda_mediaPreco_Produtoindividual_adCarrinho_vendido) "
			+ "     VALUES ("
			+ "                :produtoSelecionado, "
			+ "                :produtoSelecionado_categoria, "
			+ "                :modaPreco_produtoSelecionado_categoria, "
			+ "                :produtoSelecionado_categoria_adCarrinho,   "
			+ "                :modaPreco_ProdutoSelecionado_categoria_adCarrinho, "
			+ "                :produtoSelecionado_categoria_adCarrinho_vendido, "
			+ "                :modaPreco_ProdutoSelecionado_adCarrinho_vendido,"
			+ "                :PreferenciaGeral,"
			+ "                :moda_PreferenciaGeral,"
			+ "                :grau_preferencia,"
			+ "                :mediaPreco_Produtoindividual_adCarrinho,"
			+ "                :moda_mediaPreco_Produtoindividual_adCarrinho,"
			+ "                :mediaPreco_Produtoindividual_adCarrinho_vendido,"
			+ "                :moda_mediaPreco_Produtoindividual_adCarrinho_vendido)", nativeQuery = true)
	int insertData_BuscaProdutoMaisVendidoWebsite(
			       @Param("produtoSelecionado") String produtoSelecionado, 
			       @Param("produtoSelecionado_categoria") String produtoSelecionado_categoria, 
			       @Param("modaPreco_produtoSelecionado_categoria") String modaPreco_produtoSelecionado_categoria, 
			       @Param("produtoSelecionado_categoria_adCarrinho") String produtoSelecionado_categoria_adCarrinho, 
			       @Param("modaPreco_ProdutoSelecionado_categoria_adCarrinho") String modaPreco_ProdutoSelecionado_categoria_adCarrinho, 
			       @Param("produtoSelecionado_categoria_adCarrinho_vendido") String produtoSelecionado_categoria_adCarrinho_vendido, 
			       @Param("modaPreco_ProdutoSelecionado_adCarrinho_vendido") String modaPreco_ProdutoSelecionado_adCarrinho_vendido, 			       
			       @Param("PreferenciaGeral") String PreferenciaGeral, 
			       @Param("moda_PreferenciaGeral") String moda_PreferenciaGeral, 
			       @Param("grau_preferencia") String grau_preferencia, 
			       @Param("mediaPreco_Produtoindividual_adCarrinho") String mediaPreco_Produtoindividual_adCarrinho, 
			       @Param("moda_mediaPreco_Produtoindividual_adCarrinho") String moda_mediaPreco_Produtoindividual_adCarrinho, 
			       @Param("mediaPreco_Produtoindividual_adCarrinho_vendido") String mediaPreco_Produtoindividual_adCarrinho_vendido, 			       
			       @Param("moda_mediaPreco_Produtoindividual_adCarrinho_vendido") String moda_mediaPreco_Produtoindividual_adCarrinho_vendido);}
