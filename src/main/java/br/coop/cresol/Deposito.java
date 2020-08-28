package br.coop.cresol;

import java.io.IOException;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Depositopage;

/**
 * Classe de execução dos cenários de testes do projeto poupança Cresol tela de
 * Depósito
 * 
 * Estrutura dos testes:
 * 
 * Entra na tela, Realiza a operação, Verifica a mensagem ou comprovante, Print da evidência
 * (Irá ser salvo no diretório passado como argumento na classe page)
 * 
 * Em caso de falha o teste irá tirar um print da tela (Irá ser salvo no
 * diretório passado como argumento na classe page)
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Deposito extends Basetest {

	private Depositopage Page;

	@Test
	public void depositoDinheiroPoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Depositopage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarDeposito();
			Page.entrarTelaDeposito();
			Page.numeroDaConta("1-9");
			Page.totalDinheiro("50000");
			Page.marcarPoupanca();
			Page.clicarConfirmar();
			Page.verificarComprovante();
			Page.printDinheiro();
			Page.relatorioDepositoDinheiroPoupanca();
			
		} catch (Exception e) {

			Page.printDepositoDinheiroErro();
			Page.relatorioDepositoDinheiroPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDepositoDinheiroErro();
			Page.relatorioDepositoDinheiroPoupancaErro(a);

			throw a;

		}

	}
	
	@Test
	
	
	public void depositoAcimaDe10Mil () throws Exception, AssertionError {
	try {
	Page = new Depositopage();
	Page.entrarMenuLateral();
	Page.clicarCaixa();
	Page.clicarDeposito();
	Page.entrarTelaDeposito();
	Page.numeroDaConta("1-9");
	Page.totalDinheiro("1050000");
	Page.marcarPoupanca();
	Page.clicarConfirmarValorAlto();
	Page.entrar10mil();
	Page.mesmoTitular();
	Page.explicativas();
	Page.confirmarAcimaDe10mil();
	Page.fecharDiv();
	Page.verificarComprovante();
	Page.printDepositoAcimaDe10mil();
	Page.relatorioDepositoAcimaDe10mil();
	
	} catch (Exception e) { 
		
		Page.printDepositoAcimaDe10milErro();
		Page.relatorioDepositoAcimaDe10milErro(e);
		
		throw e;
		
	} catch (AssertionError a) {
		
		
		Page.printDepositoAcimaDe10milErro();
		Page.relatorioDepositoAcimaDe10milErro(a);
		
		throw a;
		
	}
	
	}
	
	
	

	@Test
	public void depositoCheque() throws InterruptedException, IOException, Exception, AssertionError {
		
		try {
			Page = new Depositopage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarDeposito();
			Page.entrarTelaDeposito();
			Page.numeroDaConta("1-9");
			Page.totalCheque("10000");
			Page.entrarTelaCheque();
			Page.cm7("001040160180010925880004096691");
			Page.valorCheque("10000");
			Page.incluirCheque();
			Page.clicarFinalizar();
			Page.voltarTelaDeDeposito();
			Page.opcaoPoupanca();
			Page.clicarConfirmarCheque();
			Page.verificarMensagemOperacaoInvalida();
			Page.printCheque();
			Page.relatorioDepositoCheque();
			
		} catch (Exception e) {

			Page.printDepositoChequeErro();
			Page.relatorioDepositoChequeErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDepositoChequeErro();
			Page.relatorioDepositoChequeErro(a);

			throw a;
			
		}

	}

	@Test
	public void depositoChequeDinheiro() throws InterruptedException, IOException, Exception, AssertionError  {

		try {
			Page = new Depositopage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarDeposito();
			Page.entrarTelaDeposito();
			Page.numeroDaConta("1-9");
			Page.totalDinheiro("50000");
			Page.totalCheque("10000");
			Page.entrarTelaCheque();
			Page.cm7("001040160180010925880004096691");
			Page.valorCheque("10000");
			Page.incluirCheque();
			Page.clicarFinalizar();
			Page.voltarTelaDeDeposito();
			Page.opcaoPoupanca();
			Page.clicarConfirmarChequeDinheiro();
			Page.verificarMensagemOperacaoInvalida();
			Page.printChequeDinheiro();
			Page.relatorioDepositoChequeDinheiro();
			
		} catch (Exception e) {

			Page.printDepositoChequeDinheiroErro();
			Page.relatorioDepositoChequeDinheiroErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDepositoChequeDinheiroErro();
			Page.relatorioDepositoChequeDinheiroErro(a);

			throw a;
			
		}

	}

	@Test
	public void depositoAssociadoSemPoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Depositopage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarDeposito();
			Page.entrarTelaDeposito();
			Page.numeroDaConta("60518");
			Page.totalDinheiro("50000");
			Page.marcarPoupanca();
			Page.clicarConfirmarAssociadoSemPoupanca();
			Page.verificarMensagemAssociadoSemPoupanca();
			Page.printAssociadoSemPoupanca();
			Page.relatorioDepositoAssociadoSemPoupanca();
			
		} catch (Exception e) {

			Page.printDepositoAssociadoSemPoupancaErro();
			Page.relatorioDeposistoAssociadoSemPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDepositoAssociadoSemPoupancaErro();
			Page.relatorioDeposistoAssociadoSemPoupancaErro(a);

			throw a;
			
		}

	}

	@Test
	public void checkDesabilitado() throws Exception, AssertionError {

		try {
		Page = new Depositopage();
		Page.entrarMenuLateral();
		Page.clicarCaixa();
		Page.clicarDeposito();
		Page.entrarTelaDeposito();
		Page.trocarAgencia("2019/5019 - CRESOL MARCELINO RAMOS");
		Page.verificarCheckDeposito();
		Page.relatorioDepositoChekDesabilitado();
		
		}catch (Exception e) {
			
			Page.relatorioDepositoCheckDesabilitadoErro(e);
			
			throw e;
			
		}catch (AssertionError a) {
			
			Page.relatorioDepositoCheckDesabilitadoErro(a);
			
			throw a;
			
		}

	}

	@Test
	public void depositoDinheiroContaCorrenteRegressao() throws InterruptedException, IOException, Exception, AssertionError {
		
		try {
			Page = new Depositopage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarDeposito();
			Page.entrarTelaDeposito();
			Page.numeroDaConta("60518");
			Page.totalDinheiro("50000");
			Page.clicarConfirmar();
			Page.verificarComprovanteContaCorrente();
			Page.printDinheiroContaCorrente();
			Page.relatorioDepositoContaCorrente();
			
		} catch (Exception e) {

			Page.printDepositoDinheiroContaCorrenteErro();
			Page.relatorioDepositoContaCorrenteErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDepositoDinheiroContaCorrenteErro();
			Page.relatorioDepositoContaCorrenteErro(a);

			throw a;
			
		}
	}

	@Test
	public void depositoDinheiroEntreCooperativasDiferentes() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Depositopage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarDeposito();
			Page.entrarTelaDeposito();
			Page.trocarAgencia("2013/2013 - CRESOL CHAPECO");
			Page.numeroDaConta("1-9");
			Page.totalDinheiro("50000");
			Page.marcarPoupanca();
			Page.clicarConfirmar();
			Page.verificarComprovante();
			Page.printDinheiroEntreCooperativasDiferentes();
			Page.relatorioDepositoEntreCooperativasDiferentes();
			
		} catch (Exception e) {

			Page.printDepositoDinheiroEntreCooperativasDiferentesErro();
			Page.relatorioDepositoEntreCooperativasDiferentesErro(e);

			throw e;

		}  catch (AssertionError a) {

			Page.printDepositoDinheiroEntreCooperativasDiferentesErro();
			Page.relatorioDepositoEntreCooperativasDiferentesErro(a);

			throw a;
			
		}


	}

}

