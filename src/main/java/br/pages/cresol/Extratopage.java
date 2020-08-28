package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;

/**
 * Classe com os locators necessários para realizar os cenários de teste da tela
 * Extrato
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Extratopage extends Basepage {

	public void entrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void clicarAtendimento() {

		dsl.clicarLink("Atendimento");

	}

	public void clicarExtrato() {

		dsl.clicarLink("Extratos");

	}

	public void entrarTelaExtrato() {

		dsl.entrarModulo();

	}

	public void numeroDaConta(String conta) {

		dsl.escrever("numeroConta", conta);

	}

	public void checkConta() {

		dsl.clicarBotaoname("btnokcodigoCooperativaContanumeroConta");

	}

	public void verificarExtrato() {

		dsl.verificarExtratoPoupanca();

	}

	public void extratoSemanal() {

		dsl.clicarcss("tr:nth-child(1) #periodoExtrato");

	}

	public void extratoMensal() {

		dsl.clicarcss("tr:nth-child(2) #periodoExtrato");

	}

	public void extratoPoupanca() {

		dsl.clicarcss("tr:nth-child(10) #tipoExtrato");

	}

	public void clicarConfirmar() {

		dsl.clicar("Confirmar");
		dsl.clicarcss("tr:nth-child(8) tt");

	}

	public void printExtratoSemanal() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/extratosemanal.png");

	}

	public void printExtratoMensal() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/extratomensal.png");

	}

	public void printSaldoExtraMensalErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/extrato_mensal_poupanca_Erro.png");

	}

	public void printSaldoExtraSemanalErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/extrato_semanal_poupanca_Erro.png");

	}

	public void relatorioExtratoSemanal() {
		dsl.relatorio("C:\\report/Extrato.html", "Extrato", "Validar extrato semanal",
				"C:\\Screenshotscresol/extratosemanal.png", "Validar o extrato semanal do associado");

	}

	public void relatorioExtratoSemanalErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Extrato.html", "Extrato", "Validar extrato semanal",
				"C:\\ScreenShotsCresolErros/extrato_semanal_poupanca_Erro.png", "Validar o extrato semanal do associado", "Log:"+e);

	}


	public void relatorioExtratoMensal() {
		dsl.relatorio("C:\\report/Extrato.html", "Extrato", "Validar extrato mensal",
				"C:\\Screenshotscresol/extratomensal.png", "Validar o extrato mensal do associado");

	}

	public void relatorioExtratoMensalErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Extrato.html", "Extrato", "Validar extrato mensal",
				"C:\\ScreenShotsCresolErros/extrato_mensal_poupanca_Erro.png", "Validar o extrato mensal do associado", "Log:"+e);

	}

	
}
