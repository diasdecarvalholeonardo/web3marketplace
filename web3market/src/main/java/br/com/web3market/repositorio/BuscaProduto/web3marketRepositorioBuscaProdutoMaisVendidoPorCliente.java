package br.com.web3market.repositorio.BuscaProduto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosPorCliente;

@Repository
public interface web3marketRepositorioBuscaProdutoMaisVendidoPorCliente extends JpaRepository<web3marketEntidadeBuscaProdutoMaisVendidosPorCliente, Long>  {
	@Modifying
	@Query(value = "INSERT INTO 000001_produto_cadastro_busca_produtos_mais_vendidos_por_cliente ("
			+ "                 cpf_cliente, "
			+ "                 produtoSelecionado,"
			+ "                 produtoSelecionado_categoria_adCarrinho, "
			+ "                 mediaPreco_Produtoindividual_adCarrinho,"
			+ "                 modaPreco_Produtoindividual_adCarrinho, "
			+ "                 PrecoMaisCaro_Produtoindividual_adCarrinho, "
			+ "                 modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho, "
			+ "                 PrecoMaisBarato_Produtoindividual_adCarrinho, "
			+ "                 modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho, "
			+ "                 produtoSelecionado_categoria_adCarrinho_comprei, "
			+ "                 tipoProduto_PreferenciaPessoal, "
			+ "                 PreferenciaPessoal, "
			+ "                 grau_preferencia) "
			+ "     VALUES ("
			+ "                :cpf_cliente, "
			+ "                :produtoSelecionado,           "
			+ "                :produtoSelecionado_categoria_adCarrinho, "
			+ "                :mediaPreco_Produtoindividual_adCarrinho,    "
			+ "                :modaPreco_Produtoindividual_adCarrinho, "
			+ "                :PrecoMaisCaro_Produtoindividual_adCarrinho,"
			+ "                :modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho,"
			+ "                :PrecoMaisBarato_Produtoindividual_adCarrinho,"
			+ "                :modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho, "
			+ "                :produtoSelecionado_categoria_adCarrinho_comprei, "
			+ "                :tipoProduto_PreferenciaPessoal,"
			+ "                :PreferenciaPessoal, "
			+ "                :grau_preferencia)", nativeQuery = true)
	
	int insertData_BuscaProdutoMaisVendidoPorCliente(
			       @Param("cpf_cliente") String cpf_cliente, 
			       @Param("produtoSelecionado") String produtoSelecionado, 
			       @Param("produtoSelecionado_categoria_adCarrinho") String produtoSelecionado_categoria_adCarrinho, 
			       @Param("mediaPreco_Produtoindividual_adCarrinho") String mediaPreco_Produtoindividual_adCarrinho, 
			       @Param("modaPreco_Produtoindividual_adCarrinho") String modaPreco_Produtoindividual_adCarrinho,
			       @Param("PrecoMaisCaro_Produtoindividual_adCarrinho") String PrecoMaisCaro_Produtoindividual_adCarrinho,
			       @Param("modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho") String modaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho,
			       @Param("PrecoMaisBarato_Produtoindividual_adCarrinho") String PrecoMaisBarato_Produtoindividual_adCarrinho, 
			       @Param("modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho") String modaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho, 
			       @Param("produtoSelecionado_categoria_adCarrinho_comprei") String produtoSelecionado_categoria_adCarrinho_comprei, 
			       @Param("tipoProduto_PreferenciaPessoal") String tipoProduto_PreferenciaPessoal, 
			       @Param("PreferenciaPessoal") String PreferenciaPessoal, 
			       @Param("grau_preferencia") String grau_preferencia);}
