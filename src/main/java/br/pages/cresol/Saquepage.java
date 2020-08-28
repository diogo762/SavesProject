package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;

/**
 * Classe com os locators necessários para realizar os cenários de teste da tela
 * Saque
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Saquepage extends Basepage {

	public void entrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void clicarCaixa() {

		dsl.clicarLink("Caixa");

	}

	public void clicarSaque() {

		dsl.clicarLink("Cheque-avulso");

	}

	public void entrarTelaSaque() {

		dsl.entrarModulo();

	}

	public void numeroDaConta(String conta) {

		dsl.escrever("numeroConta", conta);

	}

	public void valorSacar(String valor) {

		dsl.clicarBotaoname("valorsacar");
		dsl.escreverbyname("valorsacar", valor);

	}

	public void opcaoPoupanca() {

		dsl.clicarBotaoname("isSaquePoupanca");

	}

	public void senhaTransacao(String senha) {

		dsl.clicarBotaoname("senhaTransacao");
		dsl.escreverbyname("senhaTransacao", senha);

	}

	public void clicarConfirmar() throws InterruptedException, IOException {

		dsl.clicar("Confirmar");

	}

	public void verificarCheckPoupanca() {

		dsl.verificarCheckPoupanca();

	}

	public void trocarAgencia(String agencia) {

		dsl.limparCampo("cooperativaAgencia");
		dsl.escrever("cooperativaAgencia", agencia);
		dsl.clicarBotaoname("valorsacar");

	}

	public void entrarMensagem() {

		dsl.entrarFrameindex(0);
		dsl.clicarcss(".colmeiamensagem");

	}

	public void verificarComprovante() {

		dsl.verificarComprovanteSaque();

	}

	public void verificarComprovanteContaCorrente() {

		dsl.verificarComprovanteSaqueContaCorrente();

	}

	public void verificarMensagemAssociadoSemPoupanca() {

		dsl.verificarMensagemAssociadoSemPoupanca();

	}

	public void printSaquePoupanca() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/saquepoupanca.png");

	}

	public void printSaqueContaCorrente() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/saque_conta_corrente.png");

	}

	public void PrintAssociadoSemPoupanca() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/saqueSempoupanca.png");

	}

	public void printSaquePoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/saque_poupanca_Erro.png");

	}

	public void printSaqueAssociadoSemPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/saque_associado_sem_poupanca_Erro.png");

	}

	public void printSaqueContaCorrenteErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/saque_conta_corrente_Erro.png");

	}

	public void printSaquePoupancaEntreCooperativasDiferentes() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/saque_poupanca_entre_contas_diferentes.png");

	}

	public void printSaquePoupancaEntreCooperativasDiferentesErro() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\ScreenShotsCresolErros/saque_poupanca_entre_contas_diferentes.png");

	}

	public void relatorioSaquePoupanca() {
		dsl.relatorio("C:\\report/Saque.html", "Saque", "Validar saque poupanca",
				"C:\\Screenshotscresol/saquepoupanca.png", "O sistema deve realizar um saque poupanca");

	}

	public void relatorioSaquePoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Saque.html", "Saque", "Validar saque poupanca",
				"C:\\ScreenShotsCresolErros/saque_poupanca_Erro.png", "O sistema deve realizar um saque poupanca",
				"Log:" + e);

	}

	public void relatorioCheckDesabilitado() {
		dsl.relatorioSemPrint("C:\\report/Saque.html", "Saque", "Validar Check desabilitado",
				"O check deve está desabilitado em uma cooperativa sem a funcionalidade poupanca");

	}

	public void relatorioCheckDesabilitado(Throwable e) {
		dsl.relatorioErroSemPrint("C:\\report/Saque.html", "Saque", "Validar Check desabilitado",
				"O check deve está desabilitado em uma cooperativa sem a funcionalidade poupanca", "Log:" + e);

	}

	public void relatorioAssociadoSemPoupanca() {
		dsl.relatorio("C:\\report/Saque.html", "Saque", "Validar o nao saque associado sem poupanca",
				"C:\\Screenshotscresol/saqueSempoupanca.png",
				"O sistema nao deve realizar um saque poupanca se o associado nao tem uma");

	}

	public void relatorioSaqueAssociadoSemPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Saque.html", "Saque", "Validar o nao saque associado sem poupanca",
				"C:\\ScreenShotsCresolErros/saque_associado_sem_poupanca_Erro.png",
				"O sistema nao deve realizar um saque poupanca se o associado nao tem uma", "Log:" + e);

	}

	public void relatorioSaqueContaCorrente() {
		dsl.relatorio("C:\\report/Saque.html", "Saque", "Validar saque conta corrente",
				"C:\\Screenshotscresol/saque_conta_corrente.png", "O sistema deve realizar um saque em conta corrente");

	}

	public void relatorioSaqueContaCorrenteErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Saque.html", "Saque", "Validar saque conta corrente",
				"C:\\ScreenShotsCresolErros/saque_conta_corrente_Erro.png",
				"O sistema deve realizar um saque em conta corrente", "Log:" + e);

	}

	public void relatorioSaquePoupancaEntreCooperativasDiferentes() {
		dsl.relatorio("C:\\report/Saque.html", "Saque", "Validar saque poupanca entre cooperativas diferentes",
				"C:\\Screenshotscresol/saque_poupanca_entre_contas_diferentes.png",
				"O sistema deve realizar saque poupanca entre cooperativas diferentes");

	}

	public void relatorioSaquePoupancaEntreCooperativasDiferentesErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Saque.html", "Saque", "Validar saque poupanca entre cooperativas diferentes",
				"C:\\ScreenShotsCresolErros/saque_poupanca_entre_contas_diferentes.png",
				"O sistema deve realizar saque poupanca entre cooperativas diferentes", "Log:"+e);

	}

}
