package br.pages.cresol;

import java.io.IOException;

import Core.Basepage;

public class Contaspage extends Basepage {

	public void criarPoupanca() throws InterruptedException {

		dsl.criarPoupanca();

	}

	public void criarPoupancaAcimaDia28() throws InterruptedException {

		dsl.criarPoupancaAcimaDoDia28();

	}

	public void diaDebitoPoupancaVazio() throws InterruptedException {

		dsl.diaDebitoPoupancaVazio();

	}

	public void valorDebitoPoupancaVazio() throws InterruptedException {

		dsl.valorDebitoPoupancaVazio();

	}

	public void nomePoupancaVazio() throws InterruptedException {

		dsl.nomePoupancaVazio();

	}

	public void poupancaJaExiste() throws InterruptedException {

		dsl.poupancaJaExistente();

	}

	public void printCriarPoupanca() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/criar_poupanca.png");

	}

	public void relatorioCriarPoupanca() {
		dsl.relatorio("C:\\report/Contas.html", "Contas", "Deve criar uma conta poupanca",
				"C:\\Screenshotscresol/criar_poupanca.png", "O sistema deve criar uma conta poupanca");

	}

	public void printCriarPoupancaErro() throws IOException, InterruptedException {

		dsl.print("C:\\ScreenShotsCresolErros/criar_poupanca_Erro.png");

	}

	public void relatorioCriarPoupancaErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Contas.html", "Contas", "Deve criar uma conta poupanca",
				"C:\\ScreenShotsCresolErros/criar_poupanca_Erro.png", "O sistema deve criar uma conta poupanca",
				"Log:" + e);

	}

	public void printCriarPoupancaAcimaDia28() throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/criar_poupanca_acima_28.png");

	}

	public void relatorioCriarPoupancaAcimaDia28() {
		dsl.relatorio("C:\\report/Contas.html", "Contas", "Nao deve criar uma conta poupanca em data invalida",
				"C:\\Screenshotscresol/criar_poupanca_acima_28.png",
				"O sistema nao deve criar uma conta poupanca em data invalida");

	}

	public void printCriarPoupancaAcimaDia28Erro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/criar_poupanca_acima_28Erro.png");

	}

	public void relatorioCriarPoupancaAcimaDia28Erro(Throwable e) {
		dsl.relatorioErro("C:\\report/Contas.html", "Contas", "Nao deve criar uma conta poupanca em data invalida",
				"C:\\ScreenShotsCresolErros/criar_poupanca_acima_28Erro.png",
				"O sistema nao deve criar uma conta poupanca em data invalida", "Log:" + e);

	}

	public void printDiaDebitoPoupancaVazio() throws IOException, InterruptedException {

		dsl.print("C:\\Screenshotscresol/dia_debito_vazio.png");

	}

	public void relatorioDiaDebitoPoupancaVazio() {

		dsl.relatorio("C:\\report/Contas.html", "Contas",
				"Nao deve criar uma conta poupanca sem o preenchimento do campo requerido",
				"C:\\Screenshotscresol/dia_debito_vazio.png",
				"O sistema nao deve criar uma conta poupanca sem o preenchimento do campo requerido");

	}

	public void printDiaDebitoPoupancaVazioErro() throws IOException, InterruptedException {
		dsl.print("C:\\ScreenShotsCresolErros/dia_debito_vazio_Erro.png");

	}

	public void relatorioDiaDebitoPoupancaVazioErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Contas.html", "Contas",
				"Nao deve criar uma conta poupanca sem o preenchimento do campo requerido",
				"C:\\ScreenShotsCresolErros/dia_debito_vazio_Erro.png",
				"O sistema nao deve criar uma conta poupanca sem o preenchimento do campo requerido", "Log:" + e);

	}

	public void printValorDebitoPoupancaVazio() throws IOException, InterruptedException {
		dsl.print("C:\\Screenshotscresol/valor_debito_vazio.png");

	}

	public void relatorioValorDebitoPoupancaVazio() {

		dsl.relatorio("C:\\report/Contas.html", "Contas",
				"Nao deve criar uma conta poupanca sem o preenchimento do campo requerido",
				"C:\\Screenshotscresol/valor_debito_vazio.png",
				"O sistema nao deve criar uma conta poupanca sem o preenchimento do campo requerido");

	}

	public void printValorDebitoPoupancaVazioErro() throws IOException, InterruptedException {

		dsl.print("C:\\ScreenShotsCresolErros/valor_debito_vazio_Erro.png");

	}

	public void relatorioValorDebitoPoupancaVazioErro(Throwable e) {

		dsl.relatorioErro("C:\\report/Contas.html", "Contas",
				"Nao deve criar uma conta poupanca sem o preenchimento do campo requerido",
				"C:\\ScreenShotsCresolErros/valor_debito_vazio_Erro.png",
				"O sistema nao deve criar uma conta poupanca sem o preenchimento do campo requerido", "Log:" + e);

	}

	public void printNomePoupancaVazio() throws IOException, InterruptedException {
		
		dsl.print("C:\\Screenshotscresol/nome_poupanca_vazio.png");
		
	}

	public void relatorioNomePoupancaVazio() {
		
		dsl.relatorio("C:\\report/Contas.html", "Contas",
				"Nao deve criar uma conta poupanca sem o preenchimento do campo requerido",
				"C:\\Screenshotscresol/nome_poupanca_vazio.png",
				"O sistema nao deve criar uma conta poupanca sem o preenchimento do campo requerido");
		
	}

	public void printNomePoupancaVazioErro() throws IOException, InterruptedException {
		
		dsl.print("C:\\ScreenShotsCresolErros/nome_poupanca_vazio_Erro.png");
		
	}

	public void relatorioNomePoupancaVazioErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Contas.html", "Contas",
				"Nao deve criar uma conta poupanca sem o preenchimento do campo requerido",
				"C:\\ScreenShotsCresolErros/nome_poupanca_vazio_Erro.png",
				"O sistema nao deve criar uma conta poupanca sem o preenchimento do campo requerido", "Log:" + e);
		
	}

	public void printPoupancaJaExiste() throws IOException, InterruptedException {
		
		dsl.print("C:\\Screenshotscresol/poupanca_existente.png");
		
	}

	public void relatorioPoupancaJaExiste() {
		
		dsl.relatorio("C:\\report/Contas.html", "Contas",
				"Nao se deve criar uma conta poupanca se o associado ja possui uma",
				"C:\\Screenshotscresol/poupanca_existente.png",
				"O sistema nao deve criar uma conta poupanca se o o associado ja possui uma");
		
	}

	public void printPoupancaJaExisteErro() throws IOException, InterruptedException {
		
		dsl.print("C:\\ScreenShotsCresolErros/poupanca_existente_Erro.png");
		
	}

	public void relatorioPoupancaJaExisteErro(Throwable e) {
		
		dsl.relatorioErro("C:\\report/Contas.html", "Contas",
				"Nao se deve criar uma conta poupanca se o associado ja possui uma",
				"C:\\ScreenShotsCresolErros/poupanca_existente_Erro.png",
				"O sistema nao deve criar uma conta poupanca se o o associado ja possui uma", "Log:"+e);
		
	}

}
