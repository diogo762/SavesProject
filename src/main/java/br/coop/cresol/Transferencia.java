package br.coop.cresol;

import java.io.IOException;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Transferenciapage;

/**
 * Classe de execução dos cenários de testes do projeto poupança Cresol tela de
 * Transferência
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

public class Transferencia extends Basetest {

	private Transferenciapage Page;

	@Test
	public void transferenciaMesmoDocumentoPoupancaCorrente() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Transferenciapage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarTransferencia();
			Page.entrarTelaTransferencia();
			Page.numeroDaConta("1-9");
			Page.checkConta();
			Page.mesmoDocumento();
			Page.mesmoDocPoupancaXCorrente();
			Page.selecionarContaDestino("1-9 - 1075/1602 - CRESOL PA SANTA C DA FIGUEIRA");
			Page.valorOperacao("50000");
			Page.identifacao("Automacao");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovantePoupancaxCorrente();
			Page.printMesmoDocumentoPoupancaXCorrente();
			Page.relatorioMesmoDocumentoPoupancaXCorrente();
			
		} catch (Exception e) {

			Page.printMesmoDocumentoPoupancaXCorrenteErro();
			Page.relatorioMesmoDocumentoPoupancaXCorrenteErro(e);

			throw e;

		}catch (AssertionError a) {

			Page.printMesmoDocumentoPoupancaXCorrenteErro();
			Page.relatorioMesmoDocumentoPoupancaXCorrenteErro(a);

			throw a;
			
		}

	}

	@Test
	public void transferenciaMesmoDocumentoCorrentePoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Transferenciapage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarTransferencia();
			Page.entrarTelaTransferencia();
			Page.numeroDaConta("1-9");
			Page.checkConta();
			Page.mesmoDocumento();
			Page.mesmoDocCorrenteXPoupanca();
			Page.selecionarContaDestino("1-9 - 1075/1602 - CRESOL PA SANTA C DA FIGUEIRA");
			Page.valorOperacao("50000");
			Page.identifacao("Automacao");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovanteCorrentexPoupanca();
			Page.printMesmoDocumentoCorrenteXPoupanca();
			Page.relatorioMesmoDocumentoCorrenteXPoupanca();
			
		} catch (Exception e) {

			Page.printMesmoDocumentoCorrenteXPoupancaErro();
			Page.relatorioMesmoDocumentoCorrenteXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printMesmoDocumentoCorrenteXPoupancaErro();
			Page.relatorioMesmoDocumentoCorrenteXPoupancaErro(a);

			throw a;
			
		}

	}

	@Test
	public void transferenciaMesmoDocumentoPoupancaPoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Transferenciapage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarTransferencia();
			Page.entrarTelaTransferencia();
			Page.numeroDaConta("1-9");
			Page.checkConta();
			Page.mesmoDocumento();
			Page.mesmoDocPoupancaXPoupanca();
			Page.selecionarContaDestino("2503-8 - 1075/1602 - CRESOL PA SANTA C DA FIGUEIRA");
			Page.valorOperacao("50000");
			Page.identifacao("Automacao");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovantePoupancaxPoupanca();
			Page.printMesmoDocumentoPoupancaXPoupanca();
			Page.relatorioMesmoDocumentoPoupancaXPoupanca();
			
		} catch (Exception e) {

			Page.printMesmoDocumentoPoupancaXPoupancaErro();
			Page.relatorioMesmoDocumentoPoupancaXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printMesmoDocumentoPoupancaXPoupancaErro();
			Page.relatorioMesmoDocumentoPoupancaXPoupancaErro(a);

			throw a;
			
		}

	}

	@Test
	public void transferenciaDocumentoDiferentesCorrentePoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Transferenciapage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarTransferencia();
			Page.entrarTelaTransferencia();
			Page.numeroDaConta("1-9");
			Page.checkConta();
			Page.documentosDiferentes();
			Page.docDiferenteCorrenteXPoupanca();
			Page.contaDestino("2-7");
			Page.confirmarContaDestino();
			Page.valorOperacao("50000");
			Page.identifacao("Automacao");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovanteCorrentexPoupanca();
			Page.printDocumentoDiferenteCorrenteXPoupanca();
			Page.relatorioDocumentoDiferenteCorrenteXPoupanca();
			
		} catch (Exception e) {

			Page.printDocumentoDiferenteCorrenteXPoupancaErro();
			Page.relatorioDocumentoDiferenteCorrenteXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDocumentoDiferenteCorrenteXPoupancaErro();
			Page.relatorioDocumentoDiferenteCorrenteXPoupancaErro(a);

			throw a;
			
		}

	}

	@Test
	public void transferenciaDocumentoDiferentesPoupancaCorrente() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Transferenciapage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarTransferencia();
			Page.entrarTelaTransferencia();
			Page.numeroDaConta("1-9");
			Page.checkConta();
			Page.documentosDiferentes();
			Page.docDiferentePoupancaXCorrente();
			Page.contaDestino("2-7");
			Page.confirmarContaDestino();
			Page.valorOperacao("50000");
			Page.identifacao("Automacao");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovantePoupancaxCorrente();
			Page.printdocumentodiferentepoupancaxcorrente();
			Page.relatorioDocumentoDiferentePoupancaXCorrente();
			
		} catch (Exception e) {

			Page.printdocumentodiferentepoupancaxcorrenteErro();
			Page.relatorioDocumentoDiferentePoupancaXCorrenteErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printdocumentodiferentepoupancaxcorrenteErro();
			Page.relatorioDocumentoDiferentePoupancaXCorrenteErro(a);

			throw a;
			
		}

	}

	@Test
	public void transferenciaDocumentoDiferentesPoupancaPoupanca() throws InterruptedException, IOException, Exception, AssertionError {

		try {
			Page = new Transferenciapage();
			Page.entrarMenuLateral();
			Page.clicarCaixa();
			Page.clicarTransferencia();
			Page.entrarTelaTransferencia();
			Page.numeroDaConta("1-9");
			Page.checkConta();
			Page.documentosDiferentes();
			Page.docDiferentePoupancaXPoupanca();
			Page.contaDestino("2-7");
			Page.confirmarContaDestino();
			Page.valorOperacao("50000");
			Page.identifacao("Automacao");
			Page.senhaTransacao("963214");
			Page.clicarConfirmar();
			Page.verificarComprovantePoupancaxPoupanca();
			Page.printDocumentoDiferentePoupancaXPoupanca();
			Page.relatorioDocumentoDiferentePoupancaXPoupanca();
			
		} catch (Exception e) {

			Page.printdocumentodiferentepoupancaxpoupancaErro();
			Page.relatorioDocumentoDiferentePoupancaXPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printdocumentodiferentepoupancaxpoupancaErro();
			Page.relatorioDocumentoDiferentePoupancaXPoupancaErro(a);

			throw a;
			
		}

	}

}

