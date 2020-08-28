package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;

/**
 * Classe com os locators necessários para realizar os cenários de teste da tela
 * depósito
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Depositopage extends Basepage {

	public void entrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void entrar10mil() {

		dsl.entrarFrameindex(0);

	}

	public void mesmoTitular() {

		dsl.clicarBotaoname("mesmoTitularConta");

	}

	public void explicativas() {

		dsl.escreverbyname("explicativasOrigemDestinoRecursos", "automacao");

	}

	public void confirmarAcimaDe10mil() {

		dsl.clicar("Confirmar");

	}

	public void clicarConfirmarValorAlto() {

		dsl.clicarcss("#desabilita > #Confirmar");

	}

	/*public void sairFrame() throws InterruptedException {

		dsl.sairFrame();

	} */

	public void fecharDiv() throws InterruptedException {

		
		dsl.sairFrame();
        dsl.entrarFrameindex(0);
        dsl.clicar("dvBg");
        //dsl.clicarcss("#dvLogo > img");
        dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(1);
		dsl.clicar("xCloseDiv");

	}

	public void clicarCaixa() {

		dsl.clicarLink("Caixa");

	}

	public void clicarDeposito() {
		dsl.clicarLink("Depósito");

	}

	public void entrarTelaDeposito() {

		dsl.entrarModulo();

	}

	public void numeroDaConta(String conta) {

		dsl.escrever("numeroConta", conta);

	}

	public void totalDinheiro(String valor) {
		dsl.clicarBotaoname("totalDinheiro");

		dsl.escreverbyname("totalDinheiro", valor);

	}

	public void marcarPoupanca() {

		dsl.clicarBotaoname("isDepositoPoupanca");

	}

	public void trocarAgencia(String agencia) {

		dsl.limparCampo("codigoCooperativa");
		dsl.escrever("codigoCooperativa", agencia);
		dsl.clicarBotaoname("totalDinheiro");
	}

	public void verificarCheckDeposito() {

		dsl.verificarCheckDeposito();

	}

	public void verificarComprovante() {

		dsl.verificarComprovanteDeposito();

	}

	public void clicarConfirmar() {

		dsl.clicarcss("#desabilita > #Confirmar");
		dsl.clicarcss("tr:nth-child(8) tt");

	}

	public void clicarConfirmarAssociadoSemPoupanca() throws InterruptedException {

		dsl.clicarcss("#desabilita > #Confirmar");

	}

	public void printDinheiro() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/deposito_dinheiro.png");

	}

	public void printAssociadoSemPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/deposito_associado_sem_poupanca.png");

	}

	public void totalCheque(String valor) {

		dsl.clicarBotaoname("totalCheque");
		dsl.escreverbyname("totalCheque", valor);
		dsl.clicar("numeroConta");

	}

	public void entrarTelaCheque() {

		dsl.entrarFrameindex(0);

	}

	public void cm7(String cm7) {

		dsl.clicar("foco");

		dsl.escrever("foco", cm7);
		dsl.clicar("foco");

	}

	public void verificarComprovanteContaCorrente() {

		dsl.verificarComprovanteDepositoContaCorrente();

	}

	public void valorCheque(String valorcheque) {
		dsl.clicarBotaoname("valorCheque");
		dsl.escreverbyname("valorCheque", valorcheque);

	}

	public void incluirCheque() throws InterruptedException {
		Thread.sleep(5000);
		dsl.clicarcss(".imgTela");

	}

	public void clicarFinalizar() {

		dsl.clicarcss(".form_botao");

	}

	public void voltarTelaDeDeposito() {

		dsl.entrarModulo();

	}

	public void opcaoPoupanca() {

		dsl.clicarBotaoname("isDepositoPoupanca");

	}

	public void clicarConfirmarCheque() throws InterruptedException {

		dsl.clicar("Confirmar");

	}

	public void clicarConfirmarChequeDinheiro() throws InterruptedException {

		dsl.clicar("Confirmar");

	}

	public void verificarMensagemAssociadoSemPoupanca() {

		dsl.verificarMensagemAssociadoSemPoupanca();

	}

	public void verificarMensagemOperacaoInvalida() {

		dsl.verificarMensagemOperacaoInvalidaPoupanca();

	}

	public void printCheque() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/deposito_cheque.png");

	}

	public void printChequeDinheiro() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/deposito_cheque_dinheiro.png");

	}

	public void printDinheiroContaCorrente() throws InterruptedException, IOException {
		Thread.sleep(5000);
		dsl.print("C:\\Screenshotscresol/deposito_dinheiro_Conta_Corrente.png");

	}

	public void printDepositoDinheiroErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_dinheiro_poupanca_Erro.png");

	}

	public void printDepositoChequeErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_cheque_poupanca_Erro.png");

	}

	public void printDepositoChequeDinheiroErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_cheque_dinheiro_poupanca_Erro.png");

	}

	public void printDepositoAssociadoSemPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_associado_sem_poupanca_Erro.png");

	}

	public void printDepositoDinheiroContaCorrenteErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_dinheiro_conta_corrente_Erro.png");

	}

	public void printDinheiroEntreCooperativasDiferentes() throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/deposito_dinheiro_cooperativas_diferentes.png");

	}

	public void printDepositoDinheiroEntreCooperativasDiferentesErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_dinheiro_cooperativas_diferentes_Erro.png");

	}

	public void relatorioDepositoDinheiroPoupanca() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Deposito conta poupanca",
				"C:\\Screenshotscresol/deposito_dinheiro.png", "Validar deposito em conta poupanca");

	}

	public void relatorioDepositoDinheiroPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito", "Nao depositar cheque em conta poupanca",
				"C:\\ScreenShotsCresolErros/deposito_dinheiro_poupanca_Erro.png", "Validar deposito conta poupanca",
				"Log:" + e);

	}

	public void relatorioDepositoCheque() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Nao pode depositar cheque em conta poupanca",
				"C:\\Screenshotscresol/deposito_cheque.png", "Validar o nao deposito de cheque em conta poupanca");

	}

	public void relatorioDepositoChequeErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito", "Nao pode depositar cheque em conta poupanca",
				"C:\\ScreenShotsCresolErros/deposito_cheque_poupanca_Erro.png",
				"Validar o nao deposito de cheque em conta poupanca", "Log:" + e);

	}

	public void relatorioDepositoChequeDinheiro() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Nao pode depositar cheque e dinheiro em conta poupanca",
				"C:\\Screenshotscresol/deposito_cheque_dinheiro.png",
				"Validar o nao deposito de cheque e dinheiro em conta poupanca");

	}

	public void relatorioDepositoChequeDinheiroErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito",
				"Nao pode depositar cheque e dinheiro em conta poupanca",
				"C:\\ScreenShotsCresolErros/deposito_cheque_dinheiro_poupanca_Erro.png",
				"Validar o nao deposito de cheque e dinheiro em conta poupanca", "log:" + e);

	}

	public void relatorioDepositoAssociadoSemPoupanca() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Nao pode depositar associado sem conta poupanca",
				"C:\\Screenshotscresol/deposito_associado_sem_poupanca.png",
				"Validar o nao deposito associado sem conta poupanca");

	}

	public void relatorioDeposistoAssociadoSemPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito", "Nao pode depositar associado sem conta poupanca",
				"C:\\ScreenShotsCresolErros/deposito_associado_sem_poupanca_Erro.png",
				"Validar o nao deposito associado sem conta poupanca", "Log:" + e);

	}

	public void relatorioDepositoChekDesabilitado() {

		dsl.relatorioSemPrint("C:\\report/Deposito.html", "Deposito",
				"Validar check desabilitado em cooperativa sem poupanca",
				"O check tem que esta desabilitado em uma cooperativa sem poupanca");

	}

	public void relatorioDepositoCheckDesabilitadoErro(Throwable e) {
		dsl.relatorioErroSemPrint("C:\\report/Deposito.html", "Deposito",
				"Validar check desabilitado em cooperativa sem poupanca",
				"O check tem que esta desabilitado em uma cooperativa sem poupanca", "Log:" + e);

	}

	public void relatorioDepositoContaCorrente() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Deposito conta corrente",
				"C:\\Screenshotscresol/deposito_dinheiro_Conta_Corrente.png", "Validar deposito em conta corrente");

	}

	public void relatorioDepositoContaCorrenteErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito", "Deposito conta corrente",
				"C:\\ScreenShotsCresolErros/deposito_dinheiro_conta_corrente_Erro.png",
				"Validar deposito em conta corrente", "Log:" + e);

	}

	public void relatorioDepositoEntreCooperativasDiferentes() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Deposito conta poupanca entre cooperativas",
				"C:\\Screenshotscresol/deposito_dinheiro_cooperativas_diferentes.png",
				"Validar deposito em conta poupanca entre cooperativas");

	}

	public void relatorioDepositoEntreCooperativasDiferentesErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito", "Deposito conta poupanca entre cooperativas",
				"C:\\ScreenShotsCresolErros/deposito_dinheiro_cooperativas_diferentes_Erro.png",
				"Validar deposito em conta poupanca entre cooperativas", "Log:" + e);

	}

	public void printDepositoAcimaDe10mil() throws IOException, InterruptedException {
		
		dsl.print("C:\\Screenshotscresol/deposito_dinheiro_acima_10mil.png");
		
	}

	public void relatorioDepositoAcimaDe10mil() {
		dsl.relatorio("C:\\report/Deposito.html", "Deposito", "Deposito conta poupanca",
				"C:\\Screenshotscresol/deposito_dinheiro_acima_10mil.png", "Validar deposito acima de 10mil em conta poupanca");
		
	}

	public void printDepositoAcimaDe10milErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/deposito_dinheiro_acima_10mil_Erro.png");
		
	}

	public void relatorioDepositoAcimaDe10milErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Deposito.html", "Deposito", "Deposito conta poupanca",
				"C:\\ScreenShotsCresolErros/deposito_dinheiro_acima_10mil_Erro.png", "Validar deposito acima de 10mil em conta poupanca", "Log:"+e);
		
	}

}