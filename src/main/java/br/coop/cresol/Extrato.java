package br.coop.cresol;

import java.io.IOException;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Extratopage;

/**
 * Classe de execução dos cenários de testes do projeto poupança Cresol tela de
 * Extrato
 * 
 * Estrutura dos testes:
 * 
 * Entra na tela, Realiza a operação, Verifica o comprovante, Print da evidência
 * (Irá ser salvo no diretório passado como argumento na classe page)
 * 
 * Em caso de falha o teste irá tirar um print da tela (Irá ser salvo no
 * diretório passado como argumento na classe page)
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Extrato extends Basetest {

	private Extratopage Page;

	@Test
	public void extratoSemanal() throws IOException, InterruptedException, Exception,AssertionError {

		try {
			Page = new Extratopage();
			Page.entrarMenuLateral();
			Page.clicarAtendimento();
			Page.clicarExtrato();
			Page.entrarTelaExtrato();
			Page.numeroDaConta("19");
			Page.checkConta();
			Page.extratoPoupanca();
			Page.clicarConfirmar();
			Page.verificarExtrato();
			Page.printExtratoSemanal();
			Page.relatorioExtratoSemanal();
			
		} catch (Exception e) {

			Page.printSaldoExtraSemanalErro();
			Page.relatorioExtratoSemanalErro(e);

			throw e;

		}catch (AssertionError a) {

			Page.printSaldoExtraSemanalErro();
			Page.relatorioExtratoSemanalErro(a);
            

			throw a;

		}

	}

	@Test
	public void extratoMensal() throws IOException, InterruptedException, Exception,AssertionError {

		try {
			Page = new Extratopage();
			Page.entrarMenuLateral();
			Page.clicarAtendimento();
			Page.clicarExtrato();
			Page.entrarTelaExtrato();
			Page.numeroDaConta("19");
			Page.checkConta();
			Page.extratoMensal();
			Page.extratoPoupanca();
			Page.clicarConfirmar();
			Page.verificarExtrato();
			Page.printExtratoMensal();
			Page.relatorioExtratoMensal();
			
		} catch (Exception e) {

			Page.printSaldoExtraMensalErro();
			Page.relatorioExtratoMensalErro(e);

			throw e;

		}catch (AssertionError a) {

			Page.printSaldoExtraMensalErro();
            Page.relatorioExtratoMensalErro(a);

			throw a;
		}
	}

}
