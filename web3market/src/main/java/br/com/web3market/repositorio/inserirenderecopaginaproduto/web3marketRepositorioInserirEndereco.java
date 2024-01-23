package br.com.web3market.repositorio.inserirenderecopaginaproduto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.web3market.entidade.inserirenderecopaginaproduto.web3marketEntidadeInserirEndereco;

@Repository
public interface web3marketRepositorioInserirEndereco extends JpaRepository<web3marketEntidadeInserirEndereco, Long> {
	@Modifying
	@Query(value = "INSERT INTO 000001_enderecos_logicos_produto_cadastro("
	+ "cpf_cliente,"
	+ "endereco_inserir_produto_por_cliente,"
	+ "endereco_inserir_produto_por_cliente_confirma,"
	+ "endereco_inserir_produto_por_cliente_salvo,"
	+ "endereco_inserir_produto_por_vendas_gerais,"
	+ "endereco_inserir_produto_por_vendas_gerais_confirma,"
	+ "endereco_inserir_produto_por_vendas_gerais_salvo"
	+ "VALUES ("
	+ ":cpf_cliente,"
	+ ":endereco_inserir_produto_por_cliente,"
	+ ":endereco_inserir_produto_por_cliente_confirma,"
	+ ":endereco_inserir_produto_por_cliente_salvo,"
	+ ":endereco_inserir_produto_por_vendas_gerais,"
	+ ":endereco_inserir_produto_por_vendas_gerais_confirma," 
	+ ":endereco_inserir_produto_por_vendas_gerais_salvo)", nativeQuery = true)
	
int insertData_InserirEndereco(			       
	@Param("cpf_cliente") String cpf_cliente, 	
	@Param("endereco_inserir_produto_por_cliente") String endereco_inserir_produto_por_cliente, 
	@Param("endereco_inserir_produto_por_cliente_confirma") String endereco_inserir_produto_por_cliente_confirma, 
    @Param("endereco_inserir_produto_por_cliente_salvo") String endereco_inserir_produto_por_cliente_salvo, 
	@Param("endereco_inserir_produto_por_vendas_gerais") String endereco_inserir_produto_por_vendas_gerais, 	
	@Param("endereco_inserir_produto_por_vendas_gerais_confirma") String endereco_inserir_produto_por_vendas_gerais_confirma, 
    @Param("endereco_inserir_produto_por_vendas_gerais_salvo") String endereco_inserir_produto_por_vendas_gerais_salvo);}

