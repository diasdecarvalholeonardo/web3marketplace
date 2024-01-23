package br.com.web3market.servico;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.web3market.entidade.web3marketEntidade;
import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosPorCliente;
import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosWebsite;
import br.com.web3market.entidade.cliente.web3marketEntidadeCliente;
import br.com.web3market.entidade.inserirenderecopaginaproduto.web3marketEntidadeInserirEndereco;
import br.com.web3market.repositorio.web3marketRepositorio;
import br.com.web3market.repositorio.BuscaProduto.web3marketRepositorioBuscaProdutoMaisVendidoPorCliente;
import br.com.web3market.repositorio.BuscaProduto.web3marketRepositorioBuscaProdutoMaisVendidoWebsite;
import br.com.web3market.repositorio.cliente.web3marketRepositorioCliente_insert;
import br.com.web3market.repositorio.inserirenderecopaginaproduto.web3marketRepositorioInserirEndereco;

@Service
public class web3marketServico {
	
	@Autowired
	private web3marketRepositorio w3R;
	
	@Autowired
	private web3marketRepositorioBuscaProdutoMaisVendidoPorCliente w3R_2;
	
	@Autowired
	private web3marketRepositorioBuscaProdutoMaisVendidoWebsite w3R_3;
	
	@Autowired
	private web3marketRepositorioInserirEndereco w3R_4;
	
    @Autowired   
    web3marketRepositorioCliente_insert w3R_5;
	
    @Autowired
	public web3marketServico(web3marketRepositorio w3R) {
		this.w3R = w3R;}
    

	public void insertData(web3marketEntidade data) {
		w3R.insertData(
				data.getNumero_funcionario_produto(),data.getNome_cliente(), data.getCpf_cliente(),
                data.getNome_fornecedor(), data.getNumero_fornecedor(), data.getProduto_preco(),
                data.getProduto_warehouseAddress(), data.getProduto_tamanho(), data.getQuantidade_produto(),
                data.getData_entrada_produto(), data.getData_saida_produto(), data.getDetalhes());}
		
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
	            
	public void insertData_BuscaProdutoMaisVendidoWebsite(web3marketEntidadeBuscaProdutoMaisVendidosWebsite data_3) {
		w3R_3.insertData_BuscaProdutoMaisVendidoWebsite(
				data_3.getProdutoSelecionado(), 
				data_3.getProdutoSelecionado_categoria(), 
				data_3.getModaPreco_produtoSelecionado_categoria(), 
				data_3.getProdutoSelecionado_categoria_adCarrinho(), 
				data_3.getModaPreco_ProdutoSelecionado_categoria_adCarrinho(), 
				data_3.getProdutoSelecionado_categoria_adCarrinho_vendido(), 
				data_3.getModaPreco_ProdutoSelecionado_adCarrinho_vendido(), 
				data_3.getPreferenciaGeral(), 
				data_3.getModa_PreferenciaGeral(), 
				data_3.getGrau_preferencia(), 
				data_3.getMediaPreco_Produtoindividual_adCarrinho(), 
				data_3.getModa_mediaPreco_Produtoindividual_adCarrinho(), 
				data_3.getMediaPreco_Produtoindividual_adCarrinho_vendido(), 
				data_3.getModa_mediaPreco_Produtoindividual_adCarrinho_vendido());}
	
	public void insertData_InserirEndereco(web3marketEntidadeInserirEndereco data_4) {
		w3R_4.insertData_InserirEndereco( 
				data_4.getCpf_cliente(), 
				data_4.getEndereco_inserir_produto_por_cliente(),
				data_4.getEndereco_inserir_produto_por_cliente_confirma(), 
				data_4.getEndereco_inserir_produto_por_cliente_salvo(), 
				data_4.getEndereco_inserir_produto_por_vendas_gerais(),
				data_4.getEndereco_inserir_produto_por_vendas_gerais_confirma(), 
				data_4.getEndereco_inserir_produto_por_vendas_gerais_salvo());}
	
	public void insertData_Cliente_insert(web3marketEntidadeCliente data_5) {
		w3R_5.insertData_Cliente_insert(
				data_5.getNome_cliente(), 
				data_5.getCpf_cliente(),
		        data_5.getWhatsapp_cliente(), 
		        data_5.getEmail_cliente(),
		        data_5.getTelefone_cliente(),
		        data_5.getEndereco_residencial_cliente(), 
		        data_5.getEndereco_entrega_cliente(),
		        data_5.getDetalhes());}
	
	public List<web3marketEntidadeCliente> retorna_endereco_entrega_cliente(){ 
		return w3R_5.insertData_Cliente_insert_endereco_entrega_cliente();
	}
						
    public List<web3marketEntidade> getAllProducts() {
        return w3R.findAll();}
	
	public List<web3marketEntidadeBuscaProdutoMaisVendidosPorCliente> getAllProducts_w3E_2(){
		return w3R_2.findAll();}
	
	public List<web3marketEntidadeBuscaProdutoMaisVendidosWebsite> getAllProducts_w3E_3(){
		return w3R_3.findAll();}
	
	public List<web3marketEntidadeInserirEndereco> getAllProducts_w3E_4(){
		return w3R_4.findAll();}
	
	public List<web3marketEntidadeCliente> getAllProducts_w3E_5(){
		return w3R_5.findAll();}
    
    public Iterable<web3marketEntidade> listarTodosProdutos() {
        return w3R.findAll();}
    
    public Iterable<web3marketEntidadeBuscaProdutoMaisVendidosPorCliente> listarTodosProdutos_w3E_2() {
        return w3R_2.findAll();}
    
    public Iterable<web3marketEntidadeBuscaProdutoMaisVendidosWebsite> listarTodosProdutos_w3E_3() {
        return w3R_3.findAll();}
    
    public Iterable<web3marketEntidadeInserirEndereco> listarTodosProdutos_w3E_4() {
        return w3R_4.findAll();}
    
    public Iterable<web3marketEntidadeCliente> listarTodosProdutos_w3E_5() {
        return w3R_5.findAll();}
	
	public web3marketEntidade encontraProdutosPorId(Long id){
		return w3R.findById(id).orElse(null);}
	
	public web3marketEntidadeBuscaProdutoMaisVendidosPorCliente encontraProdutosPorId_2(Long id){
		return w3R_2.findById(id).orElse(null);}
	
	public web3marketEntidadeBuscaProdutoMaisVendidosWebsite encontraProdutosPorId_3(Long id){
		return w3R_3.findById(id).orElse(null);}
	
	public web3marketEntidadeInserirEndereco encontraProdutosPorId_4(Long id){
		return w3R_4.findById(id).orElse(null);}
	
	public web3marketEntidadeCliente encontraProdutosPorId_5(Long id){
		return w3R_5.findById(id).orElse(null);}
	
	public void deleta_Produtos_Id_1(Long id){
		w3R.deleteById(id);}
	
	public void deleta_Produtos_Id_2(Long id){
		w3R_2.deleteById(id);}
	
	public void deleta_Produtos_Id_3(Long id){
		w3R_3.deleteById(id);}
	
	public void deleta_Produtos_Id_4(Long id){
		w3R_4.deleteById(id);}
	
	public void deleta_Produtos_Id_5(Long id){
		w3R_5.deleteById(id);}
	
	public web3marketEntidade salva_produtos(web3marketEntidade w3E_salvo){
		return w3R.save(w3E_salvo);}
	
	public web3marketEntidadeBuscaProdutoMaisVendidosPorCliente salva_produtos_2(web3marketEntidadeBuscaProdutoMaisVendidosPorCliente w3E_salvo_2){
		return w3R_2.save(w3E_salvo_2);}
	
	public web3marketEntidadeBuscaProdutoMaisVendidosWebsite salva_produtos_3(web3marketEntidadeBuscaProdutoMaisVendidosWebsite w3E_salvo){
		return w3R_3.save(w3E_salvo);}
	
	public web3marketEntidadeInserirEndereco salva_produtos_4(web3marketEntidadeInserirEndereco w3E_salvo_4){
		return w3R_4.save(w3E_salvo_4);}
	
	public web3marketEntidadeCliente salva_produtos(web3marketEntidadeCliente w3E_salvo_5){
		return w3R_5.save(w3E_salvo_5);}
	
}
