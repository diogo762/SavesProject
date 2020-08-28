package br.coop.cresol;

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Contaspage;

public class Contas extends Basetest {

	private Contaspage Page;

	@Test
	public void criarPoupanca() throws Exception, AssertionError {

		try {
			Page = new Contaspage();
			Page.criarPoupanca();
			Page.printCriarPoupanca();
			Page.relatorioCriarPoupanca();

		} catch (Exception e) {

			Page.printCriarPoupancaErro();
			Page.relatorioCriarPoupancaErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printCriarPoupancaErro();
			Page.relatorioCriarPoupancaErro(a);

			throw a;

		}

	}

	@Test
	public void criarPoupancaAcimaDoDia28() throws Exception, AssertionError {

		try {
			Page = new Contaspage();
			Page.criarPoupancaAcimaDia28();
			Page.printCriarPoupancaAcimaDia28();
			Page.relatorioCriarPoupancaAcimaDia28();

		} catch (Exception e) {

			Page.printCriarPoupancaAcimaDia28Erro();
			Page.relatorioCriarPoupancaAcimaDia28Erro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printCriarPoupancaAcimaDia28Erro();
			Page.relatorioCriarPoupancaAcimaDia28Erro(a);

			throw a;
		}

	}

	@Test
	public void diaDebitoPoupancaVazio() throws Exception, AssertionError {

		try {
			Page = new Contaspage();
			Page.diaDebitoPoupancaVazio();
			Page.printDiaDebitoPoupancaVazio();
			Page.relatorioDiaDebitoPoupancaVazio();

		} catch (Exception e) {

			Page.printDiaDebitoPoupancaVazioErro();
			Page.relatorioDiaDebitoPoupancaVazioErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printDiaDebitoPoupancaVazioErro();
			Page.relatorioDiaDebitoPoupancaVazioErro(a);

			throw a;
		}

	}

	@Test
	public void valorDebitoPoupancaVazio() throws Exception {

		try {
			Page = new Contaspage();
			Page.valorDebitoPoupancaVazio();
			Page.printValorDebitoPoupancaVazio();
			Page.relatorioValorDebitoPoupancaVazio();

		} catch (Exception e) {

			Page.printValorDebitoPoupancaVazioErro();
			Page.relatorioValorDebitoPoupancaVazioErro(e);

			throw e;

		} catch (AssertionError a) {

			Page.printValorDebitoPoupancaVazioErro();
			Page.relatorioValorDebitoPoupancaVazioErro(a);

			throw a;
		}

	}

	@Test
	public void nomePoupancaVazio() throws Exception, AssertionError {

		try {
		Page = new Contaspage();
		Page.nomePoupancaVazio();
		Page.printNomePoupancaVazio();
		Page.relatorioNomePoupancaVazio();
		
		}catch (Exception e) {
			
			Page.printNomePoupancaVazioErro();
			Page.relatorioNomePoupancaVazioErro(e);
			
			throw e;
			
		}catch (AssertionError a) {
			
			Page.printNomePoupancaVazioErro();
			Page.relatorioNomePoupancaVazioErro(a);
			
			throw a;
		}

	}

	@Test
	public void poupancaJaExiste() throws Exception {

		try {
		Page = new Contaspage();
		Page.poupancaJaExiste();
		Page.printPoupancaJaExiste();
		Page.relatorioPoupancaJaExiste();
		
		}catch (Exception e) {
			
			Page.printPoupancaJaExisteErro();
			Page.relatorioPoupancaJaExisteErro(e);
			
			throw e;
			
		}catch (AssertionError a) {
			
			Page.printPoupancaJaExisteErro();
			Page.relatorioPoupancaJaExisteErro(a);
			
			throw a;
		}

	}

}
