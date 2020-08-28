package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;
import Core.Dsl;

/**
 * Classe com os locators necessários para realizar os cenários de teste da tela
 * Saldo
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Saldopage extends Basepage {
	Dsl dsl = new Dsl();

	public void entrarMenuLateral() {

		dsl.entrarMenuLateral();
	}

	public void clicarAtendimento() {

		dsl.clicarLink("Atendimento");

	}

	public void clicarSaldo() {

		dsl.clicarLink("Saldos");

	}

	public void entrarTelaSaldo() {

		dsl.entrarModulo();

	}

	public void numeroDaConta(String conta) {

		dsl.escrever("numeroConta", conta);

	}

	public void verificarComprovante() {

		dsl.verificarSaldoPoupanca();

	}

	public void verificarComprovanteContaCorrente() {

		dsl.verificarSaldoContaCorrente();

	}

	public void checkConta() {

		dsl.clicarBotaoname("btnokcodigoCooperativaContanumeroConta");

	}

	public void saldoPoupanca() {

		dsl.clicarcss("tr:nth-child(5) #tipoSaldo");

	}

	public void saldoContaCorrente() {

		dsl.clicarcss("tr:nth-child(1) #tipoSaldo");

	}

	public void clicarConfirmar() {

		dsl.clicarBotao("Confirmar");
		dsl.clicarcss("tr:nth-child(8) tt");

	}

	public void printSaldoPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/saldo_poupanca.png");

	}

	public void printContaCorrente() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/saldo_Conta_Corrente.png");

	}

	public void printSaldoPoupancaErro() throws IOException, InterruptedException {
		Thread.sleep(5000);
		dsl.print("C:\\ScreenShotsCresolErros/saldo_poupanca_Erro.png");

	}

	public void printSaldoContaCorrenteErro() throws IOException, InterruptedException {

		Thread.sleep(5000);
		dsl.print("C:\\ScreenShotsCresolErros/saldo_conta_corrente_Erro.png");

	}

	public void relatorioSaldoPoupanca() {
		dsl.relatorio("C:\\report/Saldo.html", "Saldo", "Validar Saldo poupanca",
				"C:\\Screenshotscresol/saldo_poupanca.png", "O sistema deve exibir o saldo poupanca do associado");

	}

	public void relatorioSaldoPoupancaErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Saldo.html", "Saldo", "Validar Saldo poupanca",
				"C:\\ScreenShotsCresolErros/saldo_poupanca_Erro.png",
				"O sistema deve exibir o saldo poupanca do associado", "Log:" + e);

	}

	public void relatorioSaldoContaCorrente() {
		dsl.relatorio("C:\\report/Saldo.html", "Saldo", "Validar Saldo da conta corrente",
				"C:\\Screenshotscresol/saldo_Conta_Corrente.png",
				"O sistema deve exibir o saldo conta corrente do associado");

	}

	public void relatorioSaldoContaCorrenteErro(Throwable e) {
		dsl.relatorioErro("C:\\report/Saldo.html", "Saldo", "Validar Saldo conta corrente",
				"C:\\ScreenShotsCresolErros/saldo_conta_corrente_Erro.png",
				"O sistema deve exibir o saldo conta corrente do associado", "Log:" + e);

	}

}
