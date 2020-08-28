package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;

/**
 * Classe com os locators necessários para realizar os cenários de teste da tela
 * Estorno
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Estornopage extends Basepage {

	public void entrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void clicarRetaguardaOperacional() {

		dsl.clicarLink("Retaguarda Operacional");

	}

	public void clicarEstorno() {

		dsl.clicarLink("Estornos de Lançamentos");

	}

	public void entrarTelaEstorno() {
		dsl.entrarModulo();

	}

	public void numeroDaConta(String conta) {

		dsl.escrever("numeroConta", conta);

	}

	public void selecionarTipoMovimento(String tipomovimento) {

		dsl.selecionarComboname("tipoMovimento", tipomovimento);

	}

	public void dataMovimento(String data) {
		dsl.escrever("dataMovimento", data);

	}

	public void clicarOpcaoMovimentoContaCorrente() {

		dsl.clicarcss("option:nth-child(5)");

	}

	public void clicarOpcaoMovimentoCaixa() {

		dsl.clicarcss("option:nth-child(3)");

	}

	public void clicarPesquisar() {

		dsl.clicar("Pesquisar");

	}

	public void selecionarMovimento() {

		dsl.clicarcss("#linhaTabela_1 input");

	}

	public void dataInvalidaEstorno() {

		dsl.selecionarComboindex("dataRegistroEstorno", 1);

	}

	public void clicarConfirmar() throws InterruptedException {

		dsl.clicar("Confirmar");
		Thread.sleep(5000);

	}

	public void fazerDeposito() {

		dsl.nsuDeposito();

	}

	public void fazerSaque() {

		dsl.nsuSaque();

	}

	public void verificarMensagemDataInvalida() {

		dsl.verificarMensagemOperacaoInvalidaEstorno();

	}

	public void fazerTransferenciaMesmoDocPoupancaXCorrente() {

		dsl.nsuTranferenciaMesmoDoc("tr:nth-child(9) #tipoOperacao", "1-9 - 1075/1602 - CRESOL PA SANTA C DA FIGUEIRA");

	}

	public void fazerTransferenciaMesmoDocCorrentexPoupanca() {

		dsl.nsuTranferenciaMesmoDoc("tr:nth-child(8) #tipoOperacao",
				"2503-8 - 1075/1602 - CRESOL PA SANTA C DA FIGUEIRA");

	}

	public void fazerTransferenciaMesmoDocPoupancaXPoupanca() {

		dsl.nsuTranferenciaMesmoDoc("tr:nth-child(10) #tipoOperacao",
				"2503-8 - 1075/1602 - CRESOL PA SANTA C DA FIGUEIRA");

	}

	public void fazerTransferenciaDocDiferentesPoupancaxCorrente() {

		dsl.nsuTransferenciaDocDiferentes("tr:nth-child(7) #tipoOperacao");

	}

	public void fazerTransferenciaDocDiferentesPoupancaXPoupanca() {

		dsl.nsuTransferenciaDocDiferentes("tr:nth-child(8) #tipoOperacao");

	}

	public void fazerTransferenciaDocDiferentesCorrenteXPoupanca() {

		dsl.nsuTransferenciaDocDiferentes("tr:nth-child(6) #tipoOperacao");

	}

	public void verificarMensagemEstorno() {

		dsl.verificarMensagemEstorno();

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalida()
			throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/estorno_mesmodoc_poupanca_corrente_Data_invalida.png");

	}

	public void printEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalida()
			throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/estorno_mesmodoc_corrente_poupanca_Data_Invalida.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalida()
			throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/estorno_mesmodoc_poupanca_poupanca_Data_Invalida.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalida()
			throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/estorno_docdiferentes_poupanca_corrente_Data_invalida.png");
	}

	public void printEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalida()
			throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/estorno_docdiferentes_corrente_poupanca_Data_Invalida.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalida()
			throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/estorno_docdiferentes_poupanca_poupanca_Data_Invalida.png");

	}

	public void printEstornoDeposito() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_deposito.png");

	}

	public void printEstornoDepositoDataInvalida() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_deposito_invalida.png");

	}

	public void printEstornoSaque() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_saque.png");

	}

	public void printEstornoSaqueDataInvalida() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_saque_invalida.png");

	}

	public void printEstornoTransferenciaMesmoDocCorrenteXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_mesmodoc_corrente_poupanca.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXCorrente() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_mesmodoc_poupanca_corrente.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_mesmodoc_poupanca_poupanca.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_docdiferentes_poupanca_poupanca.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXCorrente() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_docdiferentes_poupanca_corrente.png");

	}

	public void printEstornoTransferenciaDocDiferentesCorrenteXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/estorno_docdiferentes_corrente_poupanca.png");

	}

	public void printEstornoDepositoErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_deposito_Erro.png");

	}

	public void printEstornoDepositoDataInvalidaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_deposito_data_invalida_Erro.png");

	}

	public void printEstornoSaqueErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_saque_Erro.png");

	}

	public void printEstornoSaqueDataInvalidaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_saque_data_invalida_Erro.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXCorrenteErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_corrente_Erro.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalidaErro()
			throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_corrente_data_invalida_Erro.png");

	}

	public void printEstornoTransferenciaMesmoDocCorrenteXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_mesmodoc_corrente_poupanca_Erro.png");

	}

	public void printEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalidaErro()
			throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_mesmodoc_corrente_poupanca_data_invalida_Erro.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_poupanca_Erro.png");

	}

	public void printEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalidaErro()
			throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_poupanca_data_invalida_Erro.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXCorrenteErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_corrente_Erro.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalidaErro()
			throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_corrente_data_invalida_Erro.png");

	}

	public void printEstornoTransferenciaDocDiferentesCorrenteXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_docdiferente_corrente_poupanca_Erro.png");

	}

	public void printEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalidaErro()
			throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_docdiferente_corrente_poupanca_data_invalida_Erro.png");
	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_poupanca_Erro.png");

	}

	public void printEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalidaErro()
			throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_poupanca_data_invalida_Erro.png");

	}

	public void relatorioEstornoDeposito() {
		dsl.relatorio("C:\\report/Estorno.html", "Estorno", "Deve realizar estorno de um deposito poupanca",
				"C:\\Screenshotscresol/estorno_deposito.png",
				"O sistema deve realizar o estorno de um deposito poupanca");

	}

	public void relatorioEstornoDepositoErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno", "Deve realizar estorno de um deposito poupanca",
				"C:\\ScreenShotsCresolErros/estorno_deposito_Erro.png",
				"O sistema deve realizar o estorno de um deposito poupanca", "Log:" + e);

	}

	public void relatorioEstornoDepositoDataInvalida() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de um deposito poupanca em uma data invalida",
				"C:\\Screenshotscresol/estorno_deposito_invalida.png",
				"O sistema nao deve realizar o estorno de um deposito poupanca em uma data invalida");

	}

	public void relatorioEstornoDepositoDataInvalidaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de um deposito poupanca em uma data invalida",
				"C:\\ScreenShotsCresolErros/estorno_deposito_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de um deposito poupanca em uma data invalida", "Log:" + e);

	}

	public void relatorioEstornoSaque() {
		dsl.relatorio("C:\\report/Estorno.html", "Estorno", "Deve realizar estorno de um saque poupanca",
				"C:\\Screenshotscresol/estorno_saque.png", "O sistema deve realizar o estorno de um saque poupanca");

	}

	public void relatorioEstornoSaqueErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno", "Deve realizar estorno de um saque poupanca",
				"C:\\ScreenShotsCresolErros/estorno_saque_Erro.png",
				"O sistema deve realizar o estorno de um saque poupanca", "Log:" + e);

	}

	public void relatorioEstornoSaqueDataInvalida() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de um saque poupanca em data invalida",
				"C:\\Screenshotscresol/estorno_saque_invalida.png",
				"O sistema nao deve realizar o estorno de um saque poupanca em data invalida");

	}

	public void relatorioEstornoSaqueDataInvalidaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de um saque poupanca em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_saque_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de um saque poupanca em data invalida", "Log:" + e);

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXCorrente() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXCorrente mesmo doc",
				"C:\\Screenshotscresol/estorno_mesmodoc_poupanca_corrente.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXCorrente mesmo doc");

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXCorrente mesmo doc",
				"C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_corrente_Erro.png",
				"O sistema deve realizar o estorno de um saque poupanca", "Log:" + e);

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalida() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXCorrente mesmo doc em data invalida",
				"C:\\Screenshotscresol/estorno_mesmodoc_poupanca_corrente_Data_invalida.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXCorrente mesmo doc em data invalida");

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalidaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXCorrente mesmo doc em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_corrente_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXCorrente mesmo doc em data invalida",
				"Log:" + e);

	}

	public void relatorioEstornoTransferenciaMesmoDocCorrenteXPoupanca() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia CorrenteXPoupanca mesmo doc",
				"C:\\Screenshotscresol/estorno_mesmodoc_corrente_poupanca.png",
				"O sistema deve realizar o estorno de uma transferencia CorrenteXPoupanca mesmo doc");

	}

	public void relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia CorrenteXPoupanca mesmo doc",
				"C:\\ScreenShotsCresolErros/estorno_mesmodoc_corrente_poupanca_Erro.png",
				"O sistema deve realizar o estorno de uma transferencia CorrenteXPoupanca mesmo doc", "Log:" + e);

	}

	public void relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalida() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia CorrenteXPoupanca mesmo doc em data invalida",
				"C:\\Screenshotscresol/estorno_mesmodoc_corrente_poupanca_Data_Invalida.png",
				"O sistema nao deve realizar o estorno de uma transferencia CorrenteXPoupanca mesmo doc em data invalida");

	}

	public void relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalidaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia CorrenteXPoupanca mesmo doc em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_mesmodoc_corrente_poupanca_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de uma transferencia CorrenteXPoupanca mesmo doc em data invalida",
				"Log:" + e);

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXPoupanca() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXPoupanca mesmo doc",
				"C:\\Screenshotscresol/estorno_mesmodoc_poupanca_poupanca.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXPoupanca mesmo doc");

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXPoupanca mesmo doc",
				"C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_poupanca_Erro.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXPoupanca mesmo doc", "Log:" + e);

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalida() {

		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXPoupanca mesmo doc em data invalida",
				"C:\\Screenshotscresol/estorno_mesmodoc_poupanca_poupanca_Data_Invalida.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXPoupanca mesmo doc em data invalida");

	}

	public void relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalidaErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXPoupanca mesmo doc em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_mesmodoc_poupanca_poupanca_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXPoupanca mesmo doc em data invalida", "Log:"+e);

	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrente() {
		
		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXCorrente docs diferentes",
				"C:\\Screenshotscresol/estorno_docdiferentes_poupanca_corrente.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXCorrente docs diferentes");
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteErro(Throwable e) {
		
		dsl.relatorioErro( "C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXCorrente docs diferentes",
				"C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_corrente_Erro.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXCorrente docs diferentes", "Log:"+e);
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalida() {
		
		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXCorrente docs diferentes em data invalida",
				"C:\\Screenshotscresol/estorno_docdiferentes_poupanca_corrente_Data_invalida.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXCorrente docs diferentes em data invalida");
		
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalidaErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXCorrente docs diferentes em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_corrente_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXCorrente docs diferentes em data invalida" , "Log:"+e);
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupanca() {
		
		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia CorrenteXPoupanca docs diferentes",
				"C:\\Screenshotscresol/estorno_docdiferentes_corrente_poupanca.png",
				"O sistema deve realizar o estorno de uma transferencia CorrenteXPoupanca docs diferentes");
	}

	public void relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia CorrenteXPoupanca docs diferentes",
				"C:\\ScreenShotsCresolErros/estorno_docdiferente_corrente_poupanca_Erro.png",
				"O sistema deve realizar o estorno de uma transferencia CorrenteXPoupanca docs diferentes", "Log:"+e);
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalida() {
		
		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia CorrenteXPoupanca docs diferentes em data invalida",
				"C:\\Screenshotscresol/estorno_docdiferentes_corrente_poupanca_Data_Invalida.png",
				"O sistema nao deve realizar o estorno de uma transferencia CorrenteXPoupanca docs diferentes em data invalida");

		
	}

	public void relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalidaErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia CorrenteXPoupanca docs diferentes em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_docdiferente_corrente_poupanca_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de uma transferencia CorrenteXPoupanca docs diferentes em data invalida", "Log:"+e);
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupanca() {
		
		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXPoupanca docs diferentes",
				"C:\\Screenshotscresol/estorno_docdiferentes_poupanca_poupanca.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXPoupanca docs diferentes");
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Estorno.html", "Estorno",
				"Deve realizar estorno de uma Transferencia PoupancaXPoupanca docs diferentes",
				"C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_poupanca_Erro.png",
				"O sistema deve realizar o estorno de uma transferencia PoupancaXPoupanca docs diferentes", "Log:"+e);
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalida() {
	    
		dsl.relatorio("C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXPoupanca docs diferentes em data invalida",
				"C:\\Screenshotscresol/estorno_docdiferentes_poupanca_poupanca_Data_Invalida.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXPoupanca docs diferentes em data invalida");
		
	}

	public void relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalidaErro(Throwable e) {
		
		dsl.relatorioErro( "C:\\report/Estorno.html", "Estorno",
				"Nao deve realizar estorno de uma Transferencia PoupancaXPoupanca docs diferentes em data invalida",
				"C:\\ScreenShotsCresolErros/estorno_docdiferente_poupanca_poupanca_data_invalida_Erro.png",
				"O sistema nao deve realizar o estorno de uma transferencia PoupancaXPoupanca docs diferentes em data invalida" , "Log:"+e);
		
		
	}

}
