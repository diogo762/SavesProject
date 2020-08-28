package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;

/**
 * Classe com os locators necessários para realizar os cenários de teste da tela
 * Transferência
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Transferenciapage extends Basepage {

	public void entrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void clicarCaixa() {

		dsl.clicarLink("Atendimento");

	}

	public void clicarTransferencia() {

		dsl.clicarLink("Transferências");

	}

	public void entrarTelaTransferencia() {
		dsl.entrarModulo();

	}

	public void numeroDaConta(String conta) {

		dsl.escrever("numeroConta", conta);
	}

	public void checkConta() {

		dsl.clicarBotaoname("btnokcodigoCooperativaContanumeroConta");

	}

	public void mesmoDocumento() {

		dsl.clicarcss("td:nth-child(2) > #tipoTransferencia");

	}

	public void documentosDiferentes() {

		dsl.clicarcss("td:nth-child(3) > #tipoTransferencia");

	}

	public void mesmoDocPoupancaXCorrente() {

		dsl.clicarcss("tr:nth-child(9) #tipoOperacao");

	}

	public void mesmoDocPoupancaXPoupanca() {

		dsl.clicarcss("tr:nth-child(10) #tipoOperacao");

	}

	public void mesmoDocCorrenteXPoupanca() {

		dsl.clicarcss("tr:nth-child(8) #tipoOperacao");

	}

	public void docDiferenteCorrenteXPoupanca() {

		dsl.clicarcss("tr:nth-child(6) #tipoOperacao");

	}

	public void docDiferentePoupancaXCorrente() {

		dsl.clicarcss("tr:nth-child(7) #tipoOperacao");

	}

	public void docDiferentePoupancaXPoupanca() {

		dsl.clicarcss("tr:nth-child(8) #tipoOperacao");

	}

	public void clicarContaDestino() {

		dsl.clicarBotaoname("contaDestino");

	}

	public void selecionarContaDestino(String conta) {

		dsl.selecionarComboname("contaDestino", conta);

	}

	public void valorOperacao(String valor) {
		dsl.clicarBotaoname("valorOperacao");

		dsl.escreverbyname("valorOperacao", valor);

	}

	public void identifacao(String texto) {
		dsl.clicarBotaoname("identificacaoExtratos");
		dsl.escreverbyname("identificacaoExtratos", texto);

	}

	public void senhaTransacao(String senha) {

		dsl.clicarBotaoname("senhaTransacao");

		dsl.escreverbyname("senhaTransacao", senha);

	}

	public void verificarComprovanteCorrentexPoupanca() {

		dsl.verificarComprovanteTransferencia("     DE CONTA CORRENTE PARA CONTA POUPANÇA      ");

	}

	public void verificarComprovantePoupancaxCorrente() {

		dsl.verificarComprovanteTransferencia("     DE CONTA POUPANÇA PARA CONTA CORRENTE      ");

	}

	public void verificarComprovantePoupancaxPoupanca() {

		dsl.verificarComprovanteTransferencia("     DE CONTA POUPANÇA PARA CONTA POUPANÇA     ");

	}

	public void clicarConfirmar() {

		dsl.clicar("Confirmar");
		dsl.clicarcss("tr:nth-child(8) tt");
	}

	public void contaDestino(String contadestino) {

		dsl.clicar("numeroContaDestino");
		dsl.escrever("numeroContaDestino", contadestino);

	}

	public void confirmarContaDestino() {

		dsl.clicarBotaoname("btnokcodigoCooperativaContaDestinonumeroContaDestino");

	}

	public void printMesmoDocumentoPoupancaXCorrente() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/transferencia_mesmo_doc_poupanca_corrente.png");

	}

	public void printMesmoDocumentoCorrenteXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/transferencia_mesmo_doc_corrente_poupanca.png");

	}

	public void printMesmoDocumentoPoupancaXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/transferencia_mesmo_doc_poupanca_poupanca.png");

	}

	public void printDocumentoDiferenteCorrenteXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/transferencia_doc_diferentes_corrente_poupanca.png");

	}

	public void printdocumentodiferentepoupancaxcorrente() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/transferencia_doc_diferentes_poupanca_corrente.png");

	}

	public void printDocumentoDiferentePoupancaXPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/transferencia_doc_diferentes_poupanca_poupanca.png");

	}

	public void printMesmoDocumentoPoupancaXCorrenteErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/transferencia_mesmo_doc_poupanca_corrente_Erro.png");

	}

	public void printMesmoDocumentoCorrenteXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/transferencia_mesmo_doc_corrente_poupanca_Erro.png");

	}

	public void printMesmoDocumentoPoupancaXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/transferencia_mesmo_doc_poupanca_poupanca_Erro.png");

	}

	public void printDocumentoDiferenteCorrenteXPoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/transferencia_doc_diferente_corrente_poupanca_Erro.png");

	}

	public void printdocumentodiferentepoupancaxcorrenteErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/transferencia_doc_diferente_poupanca_corrente_Erro.png");

	}

	public void printdocumentodiferentepoupancaxpoupancaErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/transferencia_doc_diferente_poupanca_poupanca_Erro.png");

	}

	public void relatorioMesmoDocumentoPoupancaXCorrente() {
		dsl.relatorio("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXCorrente com o mesmo documento",
				"C:\\Screenshotscresol/transferencia_mesmo_doc_poupanca_corrente.png",
				"Validar transferencia com o mesmo documento PoupancaXCorrente");

	}

	public void relatorioMesmoDocumentoPoupancaXCorrenteErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXCorrente com o mesmo documento",
				"C:\\ScreenShotsCresolErros/transferencia_mesmo_doc_poupanca_corrente_Erro.png",
				"Validar transferencia com o mesmo documento PoupancaXCorrente", "Log:" + e);

	}

	public void relatorioMesmoDocumentoCorrenteXPoupanca() {
		dsl.relatorio("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia CorrenteXPoupanca com o mesmo documento",
				"C:\\Screenshotscresol/transferencia_mesmo_doc_corrente_poupanca.png",
				"Validar transferencia com o mesmo documento CorrenteXPoupanca");

	}

	public void relatorioMesmoDocumentoCorrenteXPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia CorrenteXPoupanca com o mesmo documento",
				"C:\\ScreenShotsCresolErros/transferencia_mesmo_doc_corrente_poupanca_Erro.png",
				"Validar transferencia com o mesmo documento CorrenteXPoupanca", "Log:" + e);

	}

	public void relatorioMesmoDocumentoPoupancaXPoupanca() {
		dsl.relatorio("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXPoupanca com o mesmo documento",
				"C:\\Screenshotscresol/transferencia_mesmo_doc_poupanca_poupanca.png",
				"Validar transferencia com o mesmo documento PoupancaXPoupanca");

	}

	public void relatorioMesmoDocumentoPoupancaXPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXPoupanca com o mesmo documento",
				"C:\\ScreenShotsCresolErros/transferencia_mesmo_doc_poupanca_poupanca_Erro.png",
				"Validar transferencia com o mesmo documento PoupancaXPoupanca", "Log:" + e);

	}

	public void relatorioDocumentoDiferenteCorrenteXPoupanca() {
		dsl.relatorio("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia CorrenteXPoupanca com documentos diferentes",
				"C:\\Screenshotscresol/transferencia_doc_diferentes_corrente_poupanca.png",
				"Validar transferencia com documentos diferentes CorrenteXPoupanca");

	}

	public void relatorioDocumentoDiferenteCorrenteXPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia CorrenteXPoupanca com documentos diferentes",
				"C:\\ScreenShotsCresolErros/transferencia_doc_diferente_corrente_poupanca_Erro.png",
				"Validar transferencia com documentos diferentes CorrenteXPoupanca", "Log:" + e);

	}

	public void relatorioDocumentoDiferentePoupancaXCorrente() {
		dsl.relatorio("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXCorrente com documentos diferentes",
				"C:\\Screenshotscresol/transferencia_doc_diferentes_poupanca_corrente.png",
				"Validar transferencia com documentos diferentes CorrenteXPoupanca");

	}

	public void relatorioDocumentoDiferentePoupancaXCorrenteErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXCorrente com documentos diferentes",
				"C:\\ScreenShotsCresolErros/transferencia_doc_diferente_poupanca_corrente_Erro.png",
				"Validar transferencia com documentos diferentes CorrenteXPoupanca", "Log:" + e);

	}

	public void relatorioDocumentoDiferentePoupancaXPoupanca() {

		dsl.relatorio("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXPoupanca com documentos diferentes",
				"C:\\Screenshotscresol/transferencia_doc_diferentes_poupanca_poupanca.png",
				"Validar transferencia com documentos diferentes PoupancaXPoupanca");

	}

	public void relatorioDocumentoDiferentePoupancaXPoupancaErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Transferencia.html", "Transferencia",
				"Transferencia PoupancaXPoupanca com documentos diferentes",
				"C:\\ScreenShotsCresolErros/transferencia_doc_diferente_poupanca_poupanca_Erro.png",
				"Validar transferencia com documentos diferentes PoupancaXPoupanca", "Log:"+e);

	}

}
