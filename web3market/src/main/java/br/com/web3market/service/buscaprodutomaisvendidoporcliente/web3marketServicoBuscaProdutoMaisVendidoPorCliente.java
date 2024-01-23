package br.com.web3market.service.buscaprodutomaisvendidoporcliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosPorCliente;
import br.com.web3market.repositorio.BuscaProduto.web3marketRepositorioBuscaProdutoMaisVendidoPorCliente;

@Service
public class web3marketServicoBuscaProdutoMaisVendidoPorCliente {
	@Autowired
	private web3marketRepositorioBuscaProdutoMaisVendidoPorCliente w3R_2;
	
	public void insertData_BuscaProdutoMaisVendidoPorCliente(web3marketEntidadeBuscaProdutoMaisVendidosPorCliente data_2) {
		w3R_2.insertData_BuscaProdutoMaisVendidoPorCliente(
				data_2.getCpf_cliente(), 
				data_2.getProdutoSelecionado(), 
				data_2.getGrau_preferencia(), 
				data_2.getMediaPreco_Produtoindividual_adCarrinho(), 
				data_2.getModaPreco_Produtoindividual_adCarrinho(), 
				data_2.getPrecoMaisCaro_Produtoindividual_adCarrinho(),
				data_2.getModaPreco_PrecoMaisCaro_Produtoindividual_adCarrinho(), 
				data_2.getPrecoMaisBarato_Produtoindividual_adCarrinho(),
				data_2.getModaPreco_PrecoMaisBarato_Produtoindividual_adCarrinho(), 
				data_2.getProdutoSelecionado_categoria_adCarrinho_comprei(),
				data_2.getTipoProduto_PreferenciaPessoal(), 
				data_2.getPreferenciaPessoal(),
				data_2.getGrau_preferencia());}


}
