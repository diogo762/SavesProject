package Core;

import static Core.DriverFactory.killDriver;

import java.io.IOException;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.pages.cresol.Loginpage;

/**
 * Classe com os pré requisitos para iniciar e finalizar os cenários de teste,
 * Essa classe precisa ser extendida por todas as classes que executam os testes
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */



public class Basetest {

	public WebDriver driver;
	public Map<String, Object> vars;
	JavascriptExecutor js;
	
	protected Dsl dsl;
	Loginpage Page2;
	
	/**
	 * Método que realiza o login no colmeia
	 * 
	 * @param usuario                 Login do usuário
	 * 
	 * @param numerodacooperativa     Número da cooperativa a ser logada
	 * 
	 * @param selecionarcooperativa   Nome da cooperativa a ser logada
	 * 
	 * @param senha                   Senha para a realização do login
	 *            
	 */

	@Before
	public void inicializa() throws InterruptedException, Exception {
		
		Page2 = new Loginpage();
		try {
			Page2.inicio();
			Page2.usuario("VICTOR");
			Page2.clicarunidade();
			Page2.numerodacooperativa("1075");
			Page2.selecionarcooperativa("001075 - CRESOL VALE EUROPEU");
			Page2.senha("ferroada");
			Page2.clicarconfirmar();
			Page2.depois();

		} catch (Exception e) {

			Page2.refresh();
			Page2.inicio();
			Page2.usuario("ALINELOFI");
			Page2.clicarunidade();
			Page2.numerodacooperativa("1075");
			Page2.selecionarcooperativa("001075 - CRESOL VALE EUROPEU");
			Page2.senha("ferroada");
			Page2.clicarconfirmar();
			Page2.depois();
			
			throw e;

		}
	}

	public Basetest() {
		dsl = new Dsl();
	}
	


	@After
	public void tearDown() throws InterruptedException, IOException {

		killDriver();

	}

}
