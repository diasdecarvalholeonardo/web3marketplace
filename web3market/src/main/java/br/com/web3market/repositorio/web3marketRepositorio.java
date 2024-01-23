package br.com.web3market.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.web3market.entidade.web3marketEntidade;

@Repository
public interface web3marketRepositorio extends JpaRepository<web3marketEntidade, Long>{ 	
	@Modifying
	@Query(value = "INSERT INTO sf_produto_cadastro ("
			+ "                 numero_funcionario_produto, nome_cliente,"
			+ "                 cpf_cliente, nome_fornecedor, numero_fornecedor, produto_preco, "
			+ "                 produto_warehouseAddress, produto_tamanho, quantidade_produto, "
			+ "                 data_entrada_produto, data_saida_produto, detalhes) "
			+ "     VALUES ("
			+ "              :numeroFuncionario, :nomeCliente, :cpfCliente, :nomeFornecedor, :numeroFornecedor, "
			+ "              :produtoPreco, :produtoWarehouseAddress, :produtoTamanho, :quantidadeProduto, "
			+ "              :dataEntradaProduto, :dataSaidaProduto, :detalhes)", nativeQuery = true)
	int insertData(
			       @Param("numeroFuncionario") String numeroFuncionario, 
			       @Param("nomeCliente") String nomeCliente, 
			       @Param("cpfCliente") String cpfCliente, 
			       @Param("nomeFornecedor") String nomeFornecedor, 
			       @Param("numeroFornecedor") String numeroFornecedor, 
			       @Param("produtoPreco") String produtoPreco, 
			       @Param("produtoWarehouseAddress") String produtoWarehouseAddress, 
			       @Param("produtoTamanho") String produtoTamanho, 
			       @Param("quantidadeProduto") String quantidadeProduto, 
			       @Param("dataEntradaProduto") String dataEntradaProduto, 
			       @Param("dataSaidaProduto") String dataSaidaProduto, 
			       @Param("detalhes") String detalhes);}


