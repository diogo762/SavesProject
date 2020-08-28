package br.coop.cresol;

import java.io.IOException;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Saldopage;

/**
 * Classe de execu��o dos cen�rios de testes do projeto poupan�a Cresol tela de
 * Saldo
 * 
 * Estrutura dos testes:
 * 
 * Entra na tela, Realiza a opera��o, Verifica o comprovante, Print da evid�ncia
 * (Ir� ser salvo no diret�rio passado como argumento na classe page)
 * 
 * Em caso de falha o teste ir� tirar um print da tela (Ir� ser salvo no
 * diret�rio passado como argumento na classe page)
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Saldo extends Basetest {

	private Saldopage Page;

	@Test
	public void saldoPoupanca() throws InterruptedException, IOException, Exception,AssertionError {

		try {
			Page = new Saldopage();
			Page.entrarMenuLateral();
			Page.clicarAtendimento();
			Page.clicarSaldo();
			Page.entrarTelaSaldo();
			Page.numeroDaConta("19");
			Page.checkConta();
			Page.saldoPoupanca();
			Page.clicarConfirmar();
			Page.verificarComprovante();
			Page.printSaldoPoupanca();
			Page.relatorioSaldoPoupanca();

		} catch (Exception e) {

			Page.printSaldoPoupancaErro();
			Page.relatorioSaldoPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printSaldoPoupancaErro();
			Page.relatorioSaldoPoupancaErro(a);

			throw a;

		}

	}

	@Test
	public void saldoContaCorrente() throws InterruptedException, IOException, Exception,AssertionError {

		try {
			Page = new Saldopage();
			Page.entrarMenuLateral();
			Page.clicarAtendimento();
			Page.clicarSaldo();
			Page.entrarTelaSaldo();
			Page.numeroDaConta("19");
			Page.checkConta();
			Page.saldoContaCorrente();
			Page.clicarConfirmar();
			Page.verificarComprovanteContaCorrente();
			Page.printContaCorrente();
			Page.relatorioSaldoContaCorrente();

		} catch (Exception e) {

			Page.printSaldoContaCorrenteErro();
			Page.relatorioSaldoContaCorrenteErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printSaldoContaCorrenteErro();
			Page.relatorioSaldoContaCorrenteErro(a);

			throw a;

		}

	}

}
