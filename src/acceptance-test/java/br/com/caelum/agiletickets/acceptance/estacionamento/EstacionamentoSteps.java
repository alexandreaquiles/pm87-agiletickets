package br.com.caelum.agiletickets.acceptance.estacionamento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.agiletickets.acceptance.page.EstabelecimentosPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class EstacionamentoSteps {
	
	public static String BASE_URL = "http://localhost:8080";

	private WebDriver browser;
	private EstabelecimentosPage estabelecimentos;
	
	@Before
	public void inicia(){
		browser = new FirefoxDriver();
		estabelecimentos = new EstabelecimentosPage(browser);
	}
	
	@After
	public void finaliza(){
		browser.close();
	}
	
	@Dado("que o usuário abre a lista de estabelecimentos")
	public void abreListagem(){
		estabelecimentos.abreListagem();
	}
	
	@Quando("o usuário marca que (há|não há) estacionamento")
	public void marcaEstacionamento(String temEstacionamento){
		estabelecimentos.adicioneEstabelecimentoComEstacionamento("há".equals(temEstacionamento)?true:false);
	}
	
	@Quando("clica em \"Adicionar\"")
	public void clicaAdicionar(){
		estabelecimentos.adicionar();
	}

	@Então("a última linha da lista mostra que (há|não há) estacionamento")
	public void ultimaLinhaDeveTerEstacionamento(String temEstacionamento) {
		estabelecimentos.ultimaLinhaDeveTerEstacionamento("há".equals(temEstacionamento)?true:false);
	}

}
