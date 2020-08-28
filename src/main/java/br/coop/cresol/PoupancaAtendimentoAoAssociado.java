package br.coop.cresol;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.PoupancaAtendimentoAoAssociadopage;

/**
 * Classe de execução dos cenários de testes do projeto poupança Cresol tela F12
 * 
 * Estrutura dos testes:
 * 
 * Entra na tela, Realiza a operação, Realiza a verificação
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class PoupancaAtendimentoAoAssociado extends Basetest {

	private PoupancaAtendimentoAoAssociadopage Page;

	@Test
	public void saldoNaTelaF12() throws Exception, AssertionError {

		try {
			Page = new PoupancaAtendimentoAoAssociadopage();
			Page.entrarFrame();
			Page.clicarNoF12();
			Page.entrarNoF12();
			Page.numeroConta("1-9");
			Page.checkConta();
			Page.consultar();
			Page.verificarSaldo();
			Page.relatorioSaldoNaTelaF12();

		} catch (Exception e) {

			Page.relatorioSaldoNaTelaF12Erro(e);

			throw e;

		} catch (AssertionError a) {

			Page.relatorioSaldoNaTelaF12Erro(a);

			throw a;
		}

	}

	@Test
	public void atualizarSaldoNaTelaF12() throws Exception, AssertionError {
		try {
			Page = new PoupancaAtendimentoAoAssociadopage();
			Page.atualizarSaldo();
			Page.relatorioAtualizarSaldo();

		} catch (Exception e) {

			Page.relatorioAtualizarSaldoErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.relatorioAtualizarSaldoErro(a);

			throw a;

		}

	}
}
