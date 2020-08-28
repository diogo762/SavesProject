package Core;

import static Core.DriverFactory.getDriver;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Classe com os comandos do selenium utilizados na automa��o dos cen�rios de
 * testes do projeto poupan�a CRESOL, scrpits de integra��o entre as telas do
 * colmeia e valida��es de comprovantes e mensagens
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Dsl {

	/********* Escrever e limpar campo de texto ************/

	public void escrever(String id_campo, String texto) {

		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void limparCampo(String id) {

		getDriver().findElement(By.id(id)).clear();

	}

	public void escreverbyname(String id_campo, String texto) {

		getDriver().findElement(By.name(id_campo)).sendKeys(texto);
	}

	public String obterValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	/********* Radio e Check ************/

	public void clicar(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public boolean isRadioMarcado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	public void clicarCheck(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public boolean isCheckMarcado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	/********* Combo ************/

	public void selecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void selecionarComboname(String nome, String valor) {
		WebElement element = getDriver().findElement(By.name(nome));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void selecionarComboindex(String nome, int index) {
		WebElement element = getDriver().findElement(By.name(nome));
		Select combo = new Select(element);
		combo.selectByIndex(index);
	}

	public void deselecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.deselectByVisibleText(valor);
	}

	public String obterValorCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public List<String> obterValoresCombo(String id) {
		WebElement element = getDriver().findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public int obterQuantidadeOpcoesCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public boolean verificarOpcaoCombo(String id, String opcao) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(opcao)) {
				return true;
			}
		}
		return false;
	}

	/********* Botao ************/

	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	public void clicarcss(String id) {
		getDriver().findElement(By.cssSelector(id)).click();
	}

	public void clicarXpath(String caminho) {

		getDriver().findElement(By.xpath(caminho)).click();

	}

	public void clicarBotaoname(String nome) {
		getDriver().findElement(By.name(nome)).click();
	}

	/********* Link ************/

	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

	/********* Textos ************/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

	/********* Alerts ************/

	public String alertaObterTexto() {
		Alert alert = getDriver().switchTo().alert();
		return alert.getText();
	}

	public String alertaObterTextoEAceita() {
		Alert alert = getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;

	}

	public String alertaObterTextoENega() {
		Alert alert = getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;

	}

	public void alertaEscrever(String valor) {
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}

	/********* Frames e Janelas ************/

	public void entrarFrame(String id) {
		getDriver().switchTo().frame(id);
	}

	public void entrarFrameindex(int index) {
		getDriver().switchTo().frame(index);
	}

	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void trocarJanela(String id) {
		getDriver().switchTo().window(id);
	}

	public void entrarMenuLateral() {
		getDriver().switchTo().frame(1);
	}

	public void entrarModulo() {

		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);

	}

	/********* Print ************/

	public void print(String pasta) throws IOException, InterruptedException {

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) getDriver();

		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File(pasta));

	}

	/**
	 * M�todo com script para pegar a data gea e o NSU do comprovante de
	 * dep�sito para utilizar no cen�rio de teste de estorno
	 * 
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void nsuDeposito() {

		getDriver().switchTo().frame(0);
		WebElement data = getDriver().findElement(By.id("sp_dataAtual"));
		String dia = data.getText();
		String dt = dia;
		String[] textoSeparado2 = dt.split(",");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(1);
		pegar2 = pegar2.replaceAll("[^0-9]", "");
		String datadeposito = (String) pegar2;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Caixa")).click();
		getDriver().findElement(By.linkText("Dep�sito")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("totalDinheiro")).click();
		getDriver().findElement(By.name("totalDinheiro")).sendKeys("500000");
		getDriver().findElement(By.name("isDepositoPoupanca")).click();
		getDriver().findElement(By.cssSelector("#desabilita > #Confirmar")).click();
		getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		getDriver().findElement(By.cssSelector("tr:nth-child(8) tt")).click();
		WebElement nsu = getDriver().findElement(By.cssSelector("tr:nth-child(9) tt"));
		String comprovante = nsu.getAttribute("innerText");
		String ns = comprovante;
		String[] textoSeparado = ns.split(":");
		ArrayList<String> nsu2 = new ArrayList<String>();
		nsu2.add(textoSeparado[0]);
		nsu2.add(textoSeparado[1]);
		String pegar = (String) nsu2.get(1);
		pegar = pegar.replaceAll("[^0-9]", "");
		String nsudeposito = (String) pegar;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Retaguarda Operacional")).click();
		getDriver().findElement(By.linkText("Estornos de Lan�amentos")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.name("nsu")).sendKeys(nsudeposito);
		getDriver().findElement(By.id("dataMovimento")).sendKeys(datadeposito);

	}

	/**
	 * M�todo com script para pegar a data gea e o NSU do comprovante de Saque
	 * para utilizar no cen�rio de teste de estorno
	 * 
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void nsuSaque() {

		getDriver().switchTo().frame(0);
		WebElement data = getDriver().findElement(By.id("sp_dataAtual"));
		String dia = data.getText();
		String dt = dia;
		String[] textoSeparado2 = dt.split(",");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(1);
		pegar2 = pegar2.replaceAll("[^0-9]", "");
		String datasaque = (String) pegar2;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Caixa")).click();
		getDriver().findElement(By.linkText("Cheque-avulso")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("valorsacar")).click();
		getDriver().findElement(By.name("valorsacar")).sendKeys("5000");
		getDriver().findElement(By.name("isSaquePoupanca")).click();
		getDriver().findElement(By.name("senhaTransacao")).click();
		getDriver().findElement(By.name("senhaTransacao")).sendKeys("963214");
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.id("xCloseDiv")).click();
		WebElement nsu = getDriver().findElement(By.cssSelector("tr:nth-child(7) tt"));
		String comprovante = nsu.getAttribute("innerText");
		String ns = comprovante;
		String[] textoSeparado = ns.split(":");
		ArrayList<String> nsu2 = new ArrayList<String>();
		nsu2.add(textoSeparado[0]);
		nsu2.add(textoSeparado[1]);
		String pegar = (String) nsu2.get(1);
		pegar = pegar.replaceAll("[^0-9]", "");
		String nsusaque = (String) pegar;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Retaguarda Operacional")).click();
		getDriver().findElement(By.linkText("Estornos de Lan�amentos")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.name("nsu")).sendKeys(nsusaque);
		getDriver().findElement(By.id("dataMovimento")).sendKeys(datasaque);

	}

	/**
	 * M�todo com script para pegar a data gea e o NSU do comprovante de
	 * Transfer�ncia com o mesmo documento, Para utilizar no cen�rio de teste de
	 * estorno
	 * 
	 * @param operacao
	 *            tipo de opera��o de transfer�ncia que ser� realizada
	 * @param contadestino
	 *            Conta destino da transfer�ncia
	 *
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void nsuTranferenciaMesmoDoc(String operacao, String contadestino) {

		getDriver().switchTo().frame(0);
		WebElement data = getDriver().findElement(By.id("sp_dataAtual"));
		String dia = data.getText();
		String dt = dia;
		String[] textoSeparado2 = dt.split(",");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(1);
		pegar2 = pegar2.replaceAll("[^0-9]", "");
		String datadeposito = (String) pegar2;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Transfer�ncias")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("btnokcodigoCooperativaContanumeroConta")).click();
		getDriver().findElement(By.cssSelector("td:nth-child(2) > #tipoTransferencia")).click();
		getDriver().findElement(By.cssSelector(operacao)).click();
		getDriver().findElement(By.name("contaDestino")).click();
		Select conta = new Select(getDriver().findElement(By.name("contaDestino")));
		conta.selectByVisibleText(contadestino);
		getDriver().findElement(By.name("valorOperacao")).click();
		getDriver().findElement(By.name("valorOperacao")).sendKeys("5000");
		getDriver().findElement(By.name("identificacaoExtratos")).click();
		getDriver().findElement(By.name("identificacaoExtratos")).sendKeys("Automacao");
		getDriver().findElement(By.name("senhaTransacao")).click();
		getDriver().findElement(By.name("senhaTransacao")).sendKeys("963214");
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.cssSelector("tr:nth-child(8) tt")).click();
		WebElement nsu = getDriver().findElement(By.cssSelector("tr:nth-child(8) tt"));
		String comprovante = nsu.getAttribute("innerText");
		String ns = comprovante;
		String[] textoSeparado = ns.split(":");
		ArrayList<String> nsu2 = new ArrayList<String>();
		nsu2.add(textoSeparado[0]);
		nsu2.add(textoSeparado[1]);
		String pegar = (String) nsu2.get(1);
		pegar = pegar.replaceAll("[^0-9]", "");
		String nsutransferencia = (String) pegar;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().findElement(By.id("imgAdicionarAba")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Retaguarda Operacional")).click();
		getDriver().findElement(By.linkText("Estornos de Lan�amentos")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.name("nsu")).sendKeys(nsutransferencia);
		getDriver().findElement(By.id("dataMovimento")).sendKeys(datadeposito);

	}

	/**
	 * M�todo com script para pegar a data gea e o NSU do comprovante de
	 * Transfer�ncia entre documentos diferentes, Para utilizar no cen�rio de
	 * teste de estorno
	 * 
	 * @param operacao
	 *            tipo de opera��o de transfer�ncia que ser� realizada
	 * 
	 *
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void nsuTransferenciaDocDiferentes(String operacao) {

		getDriver().switchTo().frame(0);
		WebElement data = getDriver().findElement(By.id("sp_dataAtual"));
		String dia = data.getText();
		String dt = dia;
		String[] textoSeparado2 = dt.split(",");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(1);
		pegar2 = pegar2.replaceAll("[^0-9]", "");
		String datadeposito = (String) pegar2;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Transfer�ncias")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("btnokcodigoCooperativaContanumeroConta")).click();
		getDriver().findElement(By.cssSelector("td:nth-child(3) > #tipoTransferencia")).click();
		getDriver().findElement(By.cssSelector(operacao)).click();
		getDriver().findElement(By.id("numeroContaDestino")).click();
		getDriver().findElement(By.id("numeroContaDestino")).sendKeys("2-7");
		getDriver().findElement(By.name("btnokcodigoCooperativaContaDestinonumeroContaDestino")).click();
		getDriver().findElement(By.name("valorOperacao")).click();
		getDriver().findElement(By.name("valorOperacao")).sendKeys("5000");
		getDriver().findElement(By.name("identificacaoExtratos")).click();
		getDriver().findElement(By.name("identificacaoExtratos")).sendKeys("Automacao");
		getDriver().findElement(By.name("senhaTransacao")).click();
		getDriver().findElement(By.name("senhaTransacao")).sendKeys("963214");
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.cssSelector("tr:nth-child(8) tt")).click();
		WebElement nsu = getDriver().findElement(By.cssSelector("tr:nth-child(8) tt"));
		String comprovante = nsu.getAttribute("innerText");
		String ns = comprovante;
		String[] textoSeparado = ns.split(":");
		ArrayList<String> nsu2 = new ArrayList<String>();
		nsu2.add(textoSeparado[0]);
		nsu2.add(textoSeparado[1]);
		String pegar = (String) nsu2.get(1);
		pegar = pegar.replaceAll("[^0-9]", "");
		String nsutransferencia = (String) pegar;
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().findElement(By.id("imgAdicionarAba")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Retaguarda Operacional")).click();
		getDriver().findElement(By.linkText("Estornos de Lan�amentos")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.name("nsu")).sendKeys(nsutransferencia);
		getDriver().findElement(By.id("dataMovimento")).sendKeys(datadeposito);

	}

	/********* Refresh da p�gina ************/

	public void refreshPagina() {

		getDriver().navigate().refresh();

	}

	/*********
	 * M�todos para verifica��o de comprovantes, campos e mensagens
	 ************/

	public void verificarCheckPoupanca() {

		WebElement poupanca = getDriver().findElement(By.name("isSaquePoupanca"));

		Assert.assertEquals(false, poupanca.isEnabled());

	}

	public void verificarCheckDeposito() {

		WebElement poupanca = getDriver().findElement(By.name("isDepositoPoupanca"));

		Assert.assertEquals(false, poupanca.isEnabled());

	}

	public void verificarSaldoNaTela() {

		getDriver().findElement(By.id("saldoTotalPoupanca_idLabel")).click();

		WebElement saldopoupanca = getDriver().findElement(By.id("saldoTotalPoupanca_idLabel"));

		Assert.assertEquals(true, saldopoupanca.isDisplayed());

	}

	public void verificarSaldoPoupanca() {

		WebElement saldo = getDriver().findElement(By.className("extrato_desc"));

		String poupanca = saldo.getAttribute("innerText");

		Assert.assertThat(poupanca, StringContains.containsString("SALDO�DE�POUPAN�A�������������������������������"));

	}

	public void verificarSaldoContaCorrente() {

		WebElement saldo = getDriver().findElement(By.className("extrato_desc"));

		String poupanca = saldo.getAttribute("innerText");

		Assert.assertThat(poupanca, StringContains.containsString("SALDO�DE�CONTA�CORRENTE�������������������������"));

	}

	public void verificarExtratoPoupanca() {

		WebElement extrato = getDriver().findElement(By.className("extrato_desc"));

		String poupanca = extrato.getAttribute("innerText");

		Assert.assertThat(poupanca, containsString("EXTRATO�CONSOLIDADO�DE�POUPAN�A�����������������"));

	}

	public void verificarComprovanteDeposito() {

		WebElement verificar = getDriver().findElement(By.cssSelector("tr:nth-child(7) tt"));

		String poupanca = verificar.getAttribute("innerText");

		Assert.assertThat(poupanca, containsString("TIPO�CONTA:�������������������POUPANCA�INTEGRADA"));

	}

	public void verificarComprovanteDepositoContaCorrente() {

		WebElement verificar = getDriver().findElement(By.cssSelector("tr:nth-child(7) tt"));

		String poupanca = verificar.getAttribute("innerText");

		Assert.assertThat(poupanca, StringContains.containsString("CONTA�CORRENTE"));

	}

	public void verificarComprovanteTransferencia(String tipotransferencia) {

		WebElement verificar = getDriver().findElement(By.cssSelector("tr:nth-child(3) tt"));

		String poupanca = verificar.getAttribute("innerText");

		Assert.assertThat(poupanca, containsString(tipotransferencia));

	}

	public void verificarMensagemEstorno() {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement estorno = getDriver().findElement(By.id("tbMsg"));
		String mensagem = estorno.getText();
		Assert.assertThat(mensagem, StringContains.containsString("Estorno efetuado(a) com sucesso!"));

	}

	public void verificarComprovanteSaque() {

		getDriver().findElement(By.id("xCloseDiv")).click();

		WebElement saque = getDriver().findElement(By.cssSelector("tr:nth-child(11) tt"));
		String mensagem = saque.getText();
		Assert.assertThat(mensagem, StringContains.containsString("POUPANCA INTEGRADA"));

	}

	public void verificarComprovanteSaqueContaCorrente() {

		getDriver().findElement(By.id("xCloseDiv")).click();

		WebElement saque = getDriver().findElement(By.cssSelector("tr:nth-child(11) tt"));
		String mensagem = saque.getText();
		Assert.assertThat(mensagem, StringContains.containsString("CONTA CORRENTE"));

	}

	public void verificarMensagemAssociadoSemPoupanca() {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement sempoupanca = getDriver().findElement(By.id("tbMsg"));
		String mensagem = sempoupanca.getText();
		Assert.assertThat(mensagem,
				StringContains.containsString("N�o foi encontrada a poupan�a integrada vinculada a conta corrente"));

	}

	public void verificarMensagemZeradoPoupanca() {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement sempoupanca = getDriver().findElement(By.id("tbMsg"));
		String mensagem = sempoupanca.getText();
		Assert.assertThat(mensagem, StringContains
				.containsString(" Valor inv�lido! O valor do dep�sito n�o poder� ser menor ou igual a zero."));

	}

	public void verificarMensagemZeradoPoupancaSaque() {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement sempoupanca = getDriver().findElement(By.id("tbMsg"));
		String mensagem = sempoupanca.getText();
		Assert.assertThat(mensagem, StringContains
				.containsString(" Valor inv�lido! O valor do saque n�o poder� ser menor ou igual a zero."));

	}

	public void verificarMensagemOperacaoInvalidaPoupanca() {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement sempoupanca = getDriver().findElement(By.id("tbMsg"));
		String mensagem = sempoupanca.getText();
		Assert.assertThat(mensagem, StringContains.containsString(
				"Opera��o Inv�lida! Esta opera��o n�o esta habilitada para o tipo de conta POUPAN�A INTEGRADA."));

	}

	public void verificarMensagemOperacaoInvalidaEstorno() {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement dtinvalida = getDriver().findElement(By.id("tbMsg"));
		String mensagem = dtinvalida.getText();
		Assert.assertThat(mensagem, StringContains.containsString(
				"Data de Registro do Estorno inv�lida! Movimentos de poupan�a s� podem ser estornados na data atual"));

	}

	/**
	 * M�todo com script para validar a atualiza��o do saldo na tela F12 ap�s
	 * ser realizado um dep�sito
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void atualizarSaldoF12() throws InterruptedException {

		getDriver().switchTo().frame(0);
		getDriver().findElement(By.cssSelector("#atendimentoAssociado > .imgIconesCabecalho")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("numeroConta")).sendKeys("19");
		getDriver().findElement(By.name("btnokcodigoCooperativaContanumeroConta")).click();
		getDriver().findElement(By.id("Consultar")).click();
		WebElement saldo = getDriver().findElement(By.id("saldoTotalPoupanca"));
		String saldoantes = saldo.getText();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().findElement(By.id("imgAdicionarAba")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Caixa")).click();
		getDriver().findElement(By.linkText("Dep�sito")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(2);
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("totalDinheiro")).click();
		getDriver().findElement(By.name("totalDinheiro")).sendKeys("500000");
		getDriver().findElement(By.name("isDepositoPoupanca")).click();
		getDriver().findElement(By.cssSelector("#desabilita > #Confirmar")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().findElement(By.xpath("//div[@title ='Consulta de Atendimento ao Associado']")).click();
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("Atualizar")).click();
		WebElement saldo2 = getDriver().findElement(By.id("saldoTotalPoupanca"));
		String saldoatualizado = saldo2.getText();
		Thread.sleep(10000);
		Assert.assertNotEquals(saldoantes, saldoantes, saldoatualizado);

	}

	/**
	 * M�todo com script para criar uma conta poupan�a integrada
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void criarPoupanca() throws InterruptedException {

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Contas")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		WebElement element = getDriver().findElement(By.name("situacao"));
		Select combo = new Select(element);
		combo.selectByVisibleText("BLOQUEADA");
		getDriver().findElement(By.id("Pesquisar")).click();
		WebElement pp = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(3) > .word-wrap"));
		String poup = pp.getText();
		String poupanca = poup;
		String[] textoSeparado2 = poupanca.split("-");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(0);
		String pegar3 = (String) dt2.get(1);
		String poupanca1 = (String) pegar2;
		String poupanca2 = (String) pegar3;
		String poupancas = poupanca1 + poupanca2;
		getDriver().findElement(By.cssSelector("#actionCampoGrid_1_3 .imgGrid")).click();
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("Incluir")).click();
		WebElement element2 = getDriver().findElement(By.name("tipoConta"));
		Select combo2 = new Select(element2);
		combo2.selectByVisibleText("POUPAN�A INTEGRADA");
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("numeroConta")).sendKeys(poupancas);
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).click();
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).sendKeys("AUTOMACAO");
		Thread.sleep(3000);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement integrada = getDriver().findElement(By.id("tbMsg"));
		String mensagem = integrada.getText();
		Assert.assertThat(mensagem, StringContains.containsString(" Poupan�a Integrada Inclu�do(a)(s) com sucesso."));

	}

	/**
	 * M�todo com script para criar uma conta poupan�a integrada com o dia do
	 * debito acima do dia 28
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void criarPoupancaAcimaDoDia28() throws InterruptedException {

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Contas")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		WebElement element = getDriver().findElement(By.name("situacao"));
		Select combo = new Select(element);
		combo.selectByVisibleText("BLOQUEADA");
		getDriver().findElement(By.id("Pesquisar")).click();
		WebElement pp = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(3) > .word-wrap"));
		String poup = pp.getText();
		String poupanca = poup;
		String[] textoSeparado2 = poupanca.split("-");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(0);
		String pegar3 = (String) dt2.get(1);
		String poupanca1 = (String) pegar2;
		String poupanca2 = (String) pegar3;
		String poupancas = poupanca1 + poupanca2;
		getDriver().findElement(By.cssSelector("#actionCampoGrid_1_3 .imgGrid")).click();
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("Incluir")).click();
		WebElement element2 = getDriver().findElement(By.name("tipoConta"));
		Select combo2 = new Select(element2);
		combo2.selectByVisibleText("POUPAN�A INTEGRADA");
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("numeroConta")).sendKeys(poupancas);
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).click();
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).sendKeys("AUTOMACAO");
		getDriver().findElement(By.name("diaDebitoPoupanca")).sendKeys("29");
		getDriver().findElement(By.name("valorDebitoPoupanca")).sendKeys("10,00");
		Thread.sleep(3000);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement integrada = getDriver().findElement(By.id("tbMsg"));
		String mensagem = integrada.getText();
		Assert.assertThat(mensagem, StringContains.containsString(" Dia de d�bito n�o pode ser maior que 28."));

	}

	/**
	 * M�todo com script para v�lidar a obrigatoriedade do preenchimento do
	 * campo Dia debito quando o campo Valor debito est� preenchido
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void diaDebitoPoupancaVazio() throws InterruptedException {

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Contas")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		WebElement element = getDriver().findElement(By.name("situacao"));
		Select combo = new Select(element);
		combo.selectByVisibleText("BLOQUEADA");
		getDriver().findElement(By.id("Pesquisar")).click();
		WebElement pp = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(3) > .word-wrap"));
		String poup = pp.getText();
		String poupanca = poup;
		String[] textoSeparado2 = poupanca.split("-");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(0);
		String pegar3 = (String) dt2.get(1);
		String poupanca1 = (String) pegar2;
		String poupanca2 = (String) pegar3;
		String poupancas = poupanca1 + poupanca2;
		getDriver().findElement(By.cssSelector("#actionCampoGrid_1_3 .imgGrid")).click();
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("Incluir")).click();
		WebElement element2 = getDriver().findElement(By.name("tipoConta"));
		Select combo2 = new Select(element2);
		combo2.selectByVisibleText("POUPAN�A INTEGRADA");
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("numeroConta")).sendKeys(poupancas);
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).click();
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).sendKeys("AUTOMACAO");
		getDriver().findElement(By.name("valorDebitoPoupanca")).sendKeys("10,00");
		Thread.sleep(3000);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement integrada = getDriver().findElement(By.id("tbMsg"));
		String mensagem = integrada.getText();
		Assert.assertThat(mensagem, StringContains.containsString(
				" Opera��o Inv�lida! Quando o campo dia d�bito ou valor d�bito estiver preenchido, o outro torna-se obrigat�rio."));

	}

	/**
	 * M�todo com script para v�lidar a obrigatoriedade do preenchimento do
	 * campo Valor debito quando o campo Dia debito est� preenchido
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void valorDebitoPoupancaVazio() throws InterruptedException {

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Contas")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		WebElement element = getDriver().findElement(By.name("situacao"));
		Select combo = new Select(element);
		combo.selectByVisibleText("BLOQUEADA");
		getDriver().findElement(By.id("Pesquisar")).click();
		WebElement pp = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(3) > .word-wrap"));
		String poup = pp.getText();
		String poupanca = poup;
		String[] textoSeparado2 = poupanca.split("-");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(0);
		String pegar3 = (String) dt2.get(1);
		String poupanca1 = (String) pegar2;
		String poupanca2 = (String) pegar3;
		String poupancas = poupanca1 + poupanca2;
		getDriver().findElement(By.cssSelector("#actionCampoGrid_1_3 .imgGrid")).click();
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("Incluir")).click();
		WebElement element2 = getDriver().findElement(By.name("tipoConta"));
		Select combo2 = new Select(element2);
		combo2.selectByVisibleText("POUPAN�A INTEGRADA");
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("numeroConta")).sendKeys(poupancas);
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).click();
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).sendKeys("AUTOMACAO");
		getDriver().findElement(By.name("diaDebitoPoupanca")).sendKeys("09");
		Thread.sleep(3000);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement integrada = getDriver().findElement(By.id("tbMsg"));
		String mensagem = integrada.getText();
		Assert.assertThat(mensagem, StringContains.containsString(
				" Opera��o Inv�lida! Quando o campo dia d�bito ou valor d�bito estiver preenchido, o outro torna-se obrigat�rio."));

	}

	/**
	 * M�todo com script para v�lidar a obrigatoriedade do preenchimento do
	 * campo Nome Poupanca
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void nomePoupancaVazio() throws InterruptedException {

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Contas")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("Incluir")).click();
		WebElement element2 = getDriver().findElement(By.name("tipoConta"));
		Select combo2 = new Select(element2);
		combo2.selectByVisibleText("POUPAN�A INTEGRADA");
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).click();
		Thread.sleep(3000);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement integrada = getDriver().findElement(By.id("tbMsg"));
		String mensagem = integrada.getText();
		Assert.assertThat(mensagem, StringContains.containsString(" O(s) campo(s) abaixo deve(m) ser preenchido(s):"));
		Assert.assertThat(mensagem, StringContains.containsString(" Nome Poupan�a."));

	}

	/**
	 * M�todo com script para v�lidar que uma conta corrente pode ter apenas uma
	 * poupanca integrada
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void poupancaJaExistente() throws InterruptedException {

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.linkText("Atendimento")).click();
		getDriver().findElement(By.linkText("Contas")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("Incluir")).click();
		WebElement element2 = getDriver().findElement(By.name("tipoConta"));
		Select combo2 = new Select(element2);
		combo2.selectByVisibleText("POUPAN�A INTEGRADA");
		getDriver().findElement(By.id("xCloseDiv")).click();
		getDriver().findElement(By.id("numeroConta")).sendKeys("1-9");
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).click();
		getDriver().findElement(By.name("nomeContaPoupancaIntegrada")).sendKeys("AUTOMACAO");
		Thread.sleep(3000);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("tbMsg")).click();
		WebElement integrada = getDriver().findElement(By.id("tbMsg"));
		String mensagem = integrada.getText();
		Assert.assertThat(mensagem,
				StringContains.containsString(" A conta corrente 1 j� possui uma poupan�a integrada vinculada."));

	}

	/**
	 * M�todo para gerar relat�rios dos testes realizados
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void relatorio(String path, String tela, String teste, String print, String descricao) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		String img = test.addScreenCapture(print);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.PASS, "Success" + img);
		Report.endTest(test);
		Report.flush();

	}

	public void relatorioErro(String path, String tela, String teste, String print, String descricao, String log) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		String img = test.addScreenCapture(print);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.FAIL, "Fail" + img + log);
		Report.endTest(test);
		Report.flush();

	}

	public void relatorioSemPrint(String path, String tela, String teste, String descricao) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.PASS, "Success");
		Report.endTest(test);
		Report.flush();

	}

	public void relatorioErroSemPrint(String path, String tela, String teste, String descricao, String log) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.FAIL, "Fail" + log);
		Report.endTest(test);
		Report.flush();

	}

}
