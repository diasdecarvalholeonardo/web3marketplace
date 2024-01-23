package br.com.web3market.repositorio.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.web3market.entidade.cliente.web3marketEntidadeCliente;

@Repository
public interface web3marketRepositorioCliente_insert  extends JpaRepository<web3marketEntidadeCliente, Long>{
	@Modifying
	@Query(value = "INSERT INTO 000001_cliente_cadastro ("
			+ "                 nome_cliente,"
			+ "                 cpf_cliente,"
			+ "                 whatsapp_cliente,"
			+ "                 email_cliente,"
			+ "                 telefone_cliente,"
			+ "                 endereco_residencial_cliente, "
			+ "                 endereco_entrega_cliente, "
			+ "                 detalhes) "
			+ "     VALUES ("
			+ "              :nome_cliente, "
			+ "              :cpf_cliente, "
			+ "              :whatsapp_cliente, "
			+ "              :email_cliente, "
			+ "              :telefone_cliente, "
			+ "              :endereco_residencial_cliente, "
			+ "              :endereco_entrega_cliente, "
			+ "              :detalhes)", nativeQuery = true)
	int insertData_Cliente_insert(
			       @Param("nome_cliente") String nome_cliente, 
			       @Param("cpf_cliente") String cpf_cliente, 
			       @Param("whatsapp_cliente") String whatsapp_cliente, 
			       @Param("email_cliente") String email_cliente, 
			       @Param("telefone_cliente") String telefone_cliente, 
			       @Param("endereco_residencial_cliente") String endereco_residencial_cliente, 
			       @Param("endereco_entrega_cliente") String endereco_entrega_cliente, 
			       @Param("detalhes") String detalhes);
	
	@Modifying
	@Query(value = "SELECT endereco_entrega_cliente FROM 000001_cliente_cadastro", nativeQuery = true)
	List<web3marketEntidadeCliente> insertData_Cliente_insert_endereco_entrega_cliente();
	
}
