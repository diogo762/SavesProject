package br.coop.cresol;

import java.io.IOException;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Saquepage;

/**
 * Classe de execução dos cenários de testes do projeto poupança Cresol tela de
 * Saque
 * 
 * Estrutura dos testes:
 * 
 * Entra na tela, Realiza a operação, Verifica a mensagem ou comprovante, Print da evidência
 * (Irá ser salvo no diretório passado como argumento na classe page)
 * 
 * Em caso de falha o teste irá tirar um print da tela (Irá ser salvo no
 * diretório passado como argumento na classe page)
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Saque extends Basetest {

	private Saquepage Page;

	@Test
	public void saquePopupanca() throws InterruptedException, IOException, Exception,AssertionError {

		try {
			Page = new Saquepage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarSaque();
			Page.entrarTelaSaque();
			Page.numeroDaConta("1-9");
			Page.valorSacar("5000");
			Page.opcaoPoupanca();
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovante();
			Page.printSaquePoupanca();
			Page.relatorioSaquePoupanca();
			
		} catch (Exception e) {

			Page.printSaquePoupancaErro();
			Page.relatorioSaquePoupancaErro(e);

			throw e;

		}catch (AssertionError a) {

			Page.printSaquePoupancaErro();
			Page.relatorioSaquePoupancaErro(a);

			throw a;

		}
	}

	@Test
	public void checkDesabilitado() throws Exception,AssertionError {
        try {
		Page = new Saquepage();
		Page.entrarMenuLateral();
		Page.clicarCaixa();
		Page.clicarSaque();
		Page.entrarTelaSaque();
		Page.trocarAgencia("2019/5019 - CRESOL MARCELINO RAMOS");
		Page.verificarCheckPoupanca();
		Page.relatorioCheckDesabilitado();
		
        } catch (Exception e) {
        	
        	Page.relatorioCheckDesabilitado(e);
        	
        	throw e;
        	
        } catch (AssertionError a) {
        	
        	Page.relatorioCheckDesabilitado(a);
        	
        	throw a;
        }
	}

	@Test
	public void saqueAssociadoSemPopupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Saquepage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarSaque();
			Page.entrarTelaSaque();
			Page.numeroDaConta("60518");
			Page.valorSacar("5000");
			Page.opcaoPoupanca();
			Page.senhaTransacao("010219");
			Page.clicarConfirmar();
			Page.verificarMensagemAssociadoSemPoupanca();
			Page.PrintAssociadoSemPoupanca();
			Page.relatorioAssociadoSemPoupanca();
			
		} catch (Exception e) {

			Page.printSaqueAssociadoSemPoupancaErro();
			Page.relatorioSaqueAssociadoSemPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printSaqueAssociadoSemPoupancaErro();
			Page.relatorioSaqueAssociadoSemPoupancaErro(a);

			throw a;
		}
	}

	@Test
	public void saqueContaCorrenteRegressao() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Saquepage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarSaque();
			Page.entrarTelaSaque();
			Page.numeroDaConta("1-9");
			Page.valorSacar("5000");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovanteContaCorrente();
			Page.printSaqueContaCorrente();
			Page.relatorioSaqueContaCorrente();
			
		} catch (Exception e) {

			Page.printSaqueContaCorrenteErro();
			Page.relatorioSaqueContaCorrenteErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printSaqueContaCorrenteErro();
			Page.relatorioSaqueContaCorrenteErro(a);

			throw a;
		
		}


	}
	
	@Test
	public void saquePopupancaEntreCooperativasDiferentes() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Saquepage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarSaque();
			Page.entrarTelaSaque();
			Page.trocarAgencia("2013/2013 - CRESOL CHAPECO");
			Page.numeroDaConta("1-9");
			Page.valorSacar("5000");
			Page.opcaoPoupanca();
			Page.senhaTransacao("010219");
			Page.clicarConfirmar();
			Page.verificarComprovante();
			Page.printSaquePoupancaEntreCooperativasDiferentes();
			Page.relatorioSaquePoupancaEntreCooperativasDiferentes();
			
		} catch (Exception e) {

			Page.printSaquePoupancaEntreCooperativasDiferentesErro();
			Page.relatorioSaquePoupancaEntreCooperativasDiferentesErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printSaquePoupancaEntreCooperativasDiferentesErro();
			Page.relatorioSaquePoupancaEntreCooperativasDiferentesErro(a);

			throw a;
			
		}

	}


}
