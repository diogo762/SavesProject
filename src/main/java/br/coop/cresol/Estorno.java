 package br.coop.cresol;

import java.io.IOException;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Estornopage;

/**
 * Classe de execução dos cenários de testes do projeto poupança Cresol tela de
 * Estorno
 * 
 * Estrutura dos testes:
 * 
 * Entra na tela, Realiza a operação, Verifica a mensagem, Print da evidência
 * (Irá ser salvo no diretório passado como argumento na classe page)
 * 
 * Em caso de falha o teste irá tirar um print da tela (Irá ser salvo no
 * diretório passado como argumento na classe page)
 * 
 * E Gerado um relatório no final do teste (Salvo no diretório passado como
 * argumento na classe page)
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Estorno extends Basetest {

	private Estornopage Page;
	
	/**
	 * Método que realiza o estorno de um depósito em conta poupança 
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoDeposito() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerDeposito();
			Page.selecionarTipoMovimento("MOVIMENTO DE CAIXA");
			Page.clicarOpcaoMovimentoCaixa();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoDeposito();
			Page.relatorioEstornoDeposito();

		} catch (Exception e) {

			Page.printEstornoDepositoErro();
			Page.relatorioEstornoDepositoErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoDepositoErro();
			Page.relatorioEstornoDepositoErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de um depósito em conta poupança em uma data inválida,
	 * o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoDepositoDataInvalida() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerDeposito();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoDepositoDataInvalida();
			Page.relatorioEstornoDepositoDataInvalida();
		} catch (Exception e) {

			Page.printEstornoDepositoDataInvalidaErro();
			Page.relatorioEstornoDepositoDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoDepositoDataInvalidaErro();
			Page.relatorioEstornoDepositoDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de um saque em conta poupança 
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoSaque() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerSaque();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoSaque();
			Page.relatorioEstornoSaque();
		} catch (Exception e) {

			Page.printEstornoSaqueErro();
			Page.relatorioEstornoSaqueErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoSaqueErro();
			Page.relatorioEstornoSaqueErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de um saque em conta poupança em uma data inválida,
	 * o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoSaqueDataInvalida() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerSaque();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoSaqueDataInvalida();
			Page.relatorioEstornoSaqueDataInvalida();
		} catch (Exception e) {

			Page.printEstornoSaqueDataInvalidaErro();
			Page.relatorioEstornoSaqueDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoSaqueDataInvalidaErro();
			Page.relatorioEstornoSaqueDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de uma transferência entre conta poupança e conta corrente
	 * com o mesmo documento
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaMesmoDocPoupancaXcorrente() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaMesmoDocPoupancaXCorrente();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoTransferenciaMesmoDocPoupancaXCorrente();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXCorrente();
		} catch (Exception e) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXCorrenteErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXCorrenteErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteErro(a);

			throw a;

		}

	}
	
	
	/**
	 * Método que tenta realizar o estorno de uma transferência entre conta poupança e conta corrente (mesmo documento)
	 * em uma data inválida, o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaMesmoDocPoupancaXcorrenteDataInvalida()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaMesmoDocPoupancaXCorrente();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalida();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalida();

		} catch (Exception e) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalidaErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalidaErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXCorrenteDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de uma transferência entre conta corrente e conta poupança
	 * com o mesmo documento
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaMesmoDocCorrenteXPoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaMesmoDocCorrentexPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoTransferenciaMesmoDocCorrenteXPoupanca();
			Page.relatorioEstornoTransferenciaMesmoDocCorrenteXPoupanca();

		} catch (Exception e) {

			Page.printEstornoTransferenciaMesmoDocCorrenteXPoupancaErro();
			Page.relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaMesmoDocCorrenteXPoupancaErro();
			Page.relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de uma transferência entre conta corrente e conta poupança (mesmo documento) 
	 * em uma data inválida, o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalida()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaMesmoDocCorrentexPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalida();
			Page.relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalida();

		} catch (Exception e) {

			Page.printEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaMesmoDocCorrenteXPoupancaDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de uma transferência entre conta poupança e conta poupança
	 * com o mesmo documento
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaMesmoDocPoupancaXPoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaMesmoDocPoupancaXPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoTransferenciaMesmoDocPoupancaXPoupanca();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXPoupanca();

		} catch (Exception e) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXPoupancaErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXPoupancaErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de uma transferência entre conta poupança e conta poupança (mesmo documento) 
	 * em uma data inválida, o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalida()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaMesmoDocPoupancaXPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalida();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalida();

		} catch (Exception e) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaMesmoDocPoupancaXPoupancaDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de uma transferência entre conta poupança e conta corrente
	 * entre documentos diferentes
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaDocDiferentesPoupancaXcorrente()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaDocDiferentesPoupancaxCorrente();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoTransferenciaDocDiferentesPoupancaXCorrente();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrente();

		} catch (Exception e) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXCorrenteErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXCorrenteErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de uma transferência entre conta poupança e conta corrente (documentos diferentes)
	 * em uma data inválida, o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaDocDiferentesPoupancaXcorrenteDataInvalida()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaDocDiferentesPoupancaxCorrente();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalida();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalida();
		} catch (Exception e) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalidaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalidaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXCorrenteDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de uma transferência entre conta corrente e conta poupança
	 * entre documentos diferentes
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaDocDiferentesCorrenteXPoupanca()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaDocDiferentesCorrenteXPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoTransferenciaDocDiferentesCorrenteXPoupanca();
			Page.relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupanca();

		} catch (Exception e) {

			Page.printEstornoTransferenciaDocDiferentesCorrenteXPoupancaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaDocDiferentesCorrenteXPoupancaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de uma transferência entre conta corrente e conta poupança (documentos diferentes)
	 * em uma data inválida, o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */
	

	@Test
	public void estornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalida()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaDocDiferentesCorrenteXPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalida();
			Page.relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalida();

		} catch (Exception e) {

			Page.printEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesCorrenteXPoupancaDataInvalidaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que realiza o estorno de uma transferência entre conta poupança e conta poupança
	 * entre documentos diferentes
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaDocDiferentesPoupancaXPoupanca()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaDocDiferentesPoupancaXPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.clicarConfirmar();
			Page.verificarMensagemEstorno();
			Page.printEstornoTransferenciaDocDiferentesPoupancaXPoupanca();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupanca();

		} catch (Exception e) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXPoupancaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXPoupancaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaErro(a);

			throw a;

		}

	}
	
	/**
	 * Método que tenta realizar o estorno de uma transferência entre conta poupança e conta poupança (documentos diferentes)
	 * em uma data inválida, o sistema deve emitir uma mensagem de operação inválida
	 * 
	 * @param selecionarTipoMovimento    Tipo de movimento
	 *          
	 */

	@Test
	public void estornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalida()
			throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Estornopage();
			Page.fazerTransferenciaDocDiferentesPoupancaXPoupanca();
			Page.selecionarTipoMovimento("MOVIMENTO EM CONTA-CORRENTE");
			Page.clicarOpcaoMovimentoContaCorrente();
			Page.clicarPesquisar();
			Page.selecionarMovimento();
			Page.dataInvalidaEstorno();
			Page.clicarConfirmar();
			Page.verificarMensagemDataInvalida();
			Page.printEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalida();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalida();

		} catch (Exception e) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalidaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalidaErro();
			Page.relatorioEstornoTransferenciaDocDiferentesPoupancaXPoupancaDataInvalidaErro(a);

			throw a;

		}

	}
}