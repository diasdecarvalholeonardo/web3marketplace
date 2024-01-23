package br.com.web3market.construtor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.web3market.entidade.web3marketEntidade;
import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosPorCliente;
import br.com.web3market.entidade.BuscaProduto.web3marketEntidadeBuscaProdutoMaisVendidosWebsite;
import br.com.web3market.entidade.cliente.web3marketEntidadeCliente;
import br.com.web3market.entidade.inserirenderecopaginaproduto.web3marketEntidadeInserirEndereco;
import br.com.web3market.servico.web3marketServico;

@Controller
public class web3marketConstrutor {
		
	private final web3marketServico w3S;
	
	@Autowired
	public web3marketConstrutor(web3marketServico w3S) {
		this.w3S = w3S;}
	
	  @GetMapping("/inicio/index") 
	  public String index(@ModelAttribute web3marketEntidade w3E, Model model) {
		  model.addAttribute("w3E", w3E);
		  Iterable<web3marketEntidade> produtos = w3S.listarTodosProdutos();
		  model.addAttribute("produtos", produtos); 
		  return "/inicio/index";}	  	  
	
	  @GetMapping("/inicio/formulario") 
	  public String formulario(@ModelAttribute web3marketEntidade w3E, Model model) {
		  model.addAttribute("w3E", w3E);
		  return "/inicio/formulario";}	  

	  @PostMapping("/inicio/formulario_preenchido") 
	  public String processarFormulario(@ModelAttribute web3marketEntidade w3E, Model model) { 		 
		  model.addAttribute("w3E", w3E);
		  return "/inicio/formulario_preenchido";}
	  
	  @Transactional
	  @PostMapping("/inicio/formulario_preenchido_salvo") 
	  public String processarFormularioSalvo(@ModelAttribute web3marketEntidade w3E, Model model){ 	
		  w3S.insertData(w3E);		   
		  model.addAttribute("w3E", w3E); 
		  return "/inicio/formulario_preenchido_salvo";}
		
	  @GetMapping("/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_especificas_cliente/inserir_produto_informacoes_vendas_especificas_cliente")
	  public String formulario_BuscaProdutosMaisProcuradosPorCliente(
			  @ModelAttribute web3marketEntidadeBuscaProdutoMaisVendidosPorCliente w3E_2, Model model) {
		  model.addAttribute("w3E_2", w3E_2);
		  return "/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_especificas_cliente/inserir_produto_informacoes_vendas_especificas_cliente";}	  
		
	  @PostMapping("/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_especificas_cliente/inserir_produto_informacoes_vendas_especificas_cliente_confirmar")
	  public String formulario_BuscaProdutosMaisProcuradosPorCliente_Confirmar(
			  @ModelAttribute web3marketEntidadeBuscaProdutoMaisVendidosPorCliente w3E_2, Model model) {
		  model.addAttribute("w3E_2", w3E_2);
		  return "/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_especificas_cliente/inserir_produto_informacoes_vendas_especificas_cliente_confirmar";}	  
	  
	  @Transactional
	  @PostMapping("/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_especificas_cliente/inserir_produto_informacoes_vendas_especificas_cliente_salvo") 
	  public String formulario_BuscaProdutosMaisProcuradosPorCliente_Salvo(
			  @ModelAttribute web3marketEntidadeBuscaProdutoMaisVendidosPorCliente w3E_2, Model model) {
		  w3S.insertData_BuscaProdutoMaisVendidoPorCliente(w3E_2);		   
		  model.addAttribute("w3E_2", w3E_2); 
		  return "/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_especificas_cliente/inserir_produto_informacoes_vendas_especificas_cliente_salvo";}	  
	  	
	  @GetMapping("/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_gerais/inserir_produto_informacoes_vendas_gerais")
	  public String formulario_BuscaProdutoMaisBuscados(
			  @ModelAttribute web3marketEntidadeBuscaProdutoMaisVendidosWebsite w3E_3, Model model) {
		  model.addAttribute("w3E_3", w3E_3);
		  return "/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_gerais/inserir_produto_informacoes_vendas_gerais";}	  
	  
	  @PostMapping("/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_gerais/inserir_produto_informacoes_vendas_gerais_confirmar")
	  public String formulario_BuscaProdutoMaisBuscados_Confirmar(
			  @ModelAttribute web3marketEntidadeBuscaProdutoMaisVendidosWebsite w3E_3, Model model) {
		  model.addAttribute("w3E_3", w3E_3);
		  return "/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_gerais/inserir_produto_informacoes_vendas_gerais_confirmar";}	  
	  
	  @Transactional
	  @PostMapping("/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_gerais/inserir_produto_informacoes_vendas_gerais_salvo") 
	  public String formulario_BuscaProdutoMaisBuscados_Salvo(
			  @ModelAttribute web3marketEntidadeBuscaProdutoMaisVendidosWebsite w3E_3, Model model) {
		  w3S.insertData_BuscaProdutoMaisVendidoWebsite(w3E_3);		   
		  model.addAttribute("w3E_3", w3E_3); 
		  return "/inicio/produto/inserir_produto/inserir_produto_informacoes/inserir_produto_informacoes_vendas_gerais/inserir_produto_informacoes_vendas_gerais_salvo";}	  
	  	
	  @GetMapping("/inicio/painel_de_controle_gerencia/painel_de_controle_gerencia")
	  public String painel_de_controle_gerencia(
			  @ModelAttribute web3marketEntidadeInserirEndereco w3E_4, Model model) {
		  model.addAttribute("w3E_4", w3E_4);
		  return "/inicio/painel_de_controle_gerencia/painel_de_controle_gerencia";}	
	  	
	  @GetMapping("/inicio/painel_de_controle_gerencia/gerencia_controle_informacao")
	  public String formulario_gerencia_controle_informacao(
			  @ModelAttribute web3marketEntidadeInserirEndereco w3E_4, Model model) {
		  model.addAttribute("w3E_4", w3E_4);
		  return "/inicio/painel_de_controle_gerencia/gerencia_controle_informacao";}	
	  
	  @PostMapping("/inicio/painel_de_controle_gerencia/gerencia_controle_informacao_confirmar")
	  public String formulario_gerencia_controle_informacao_confirmar(
			  @ModelAttribute web3marketEntidadeInserirEndereco w3E_4, Model model) {
		  model.addAttribute("w3E_4", w3E_4);
		  return "/inicio/painel_de_controle_gerencia/gerencia_controle_informacao_confirmar";}
	  
	  @Transactional
	  @PostMapping("/inicio/painel_de_controle_gerencia/gerencia_controle_informacao_confirmar_salvo") 
	  public String formulario_gerencia_controle_informacao_Salvo(
			  @ModelAttribute web3marketEntidadeInserirEndereco w3E_4, Model model) {
		  w3S.insertData_InserirEndereco(w3E_4);		   
		  model.addAttribute("w3E_4", w3E_4); 
		  return "/inicio/painel_de_controle_gerencia/gerencia_controle_informacao_confirmar_salvo";}	  

	  @GetMapping("/inicio/acesso/login")
	  public String tela_login(@ModelAttribute web3marketEntidade w3E, Model model) {
		  model.addAttribute("w3E", w3E);
		  return "/inicio/acesso/login";}	 
	  
	  }
