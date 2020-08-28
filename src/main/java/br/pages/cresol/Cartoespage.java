package br.pages.cresol;

import static Core.DriverFactory.getDriver;

import Core.Basepage;



public class Cartoespage extends Basepage {
	
	
	public void entrarFrame () {
		
		dsl.entrarFrameindex(0);
		
		
	}
	
	public void clicarNoF12 () {
		
		dsl.clicarcss("#atendimentoAssociado > .imgIconesCabecalho");
		
		
	}
	
	public void entrarNoF12 () {
		
		 getDriver().switchTo().defaultContent();
		 dsl.entrarFrameindex(2);
		 dsl.entrarFrameindex(1);
		 
	}

	public void numeroConta (String conta) {
		
		dsl.escrever("numeroConta", conta);
		
		
	}
	
	public void atualizarSaldo () throws InterruptedException {
		
		dsl.atualizarSaldoF12();
		
		
	}
	
	public void checkConta ()  {
		
		dsl.clicarBotaoname("btnokcodigoCooperativaContanumeroConta");
		
	}
	
	public void consultar () {
		
		dsl.clicar("Consultar");
		
	}
	
	public void verificarSaldo () { 
		
		dsl.verificarSaldoNaTela();
		
		
	}

	public void relatorioSaldoNaTelaF12() {
		dsl.relatorioSemPrint("C:\\report/F12.html", "F12", "Saldo Poupanca na tela F12", "O sistema deve exibir o saldo poupanca do associado na tela F12");
		
	}

	public void relatorioSaldoNaTelaF12Erro(Throwable e) {
		dsl.relatorioErroSemPrint("C:\\report/F12.html", "F12",  "Saldo Poupanca na tela F12", "O sistema deve exibir o saldo poupanca do associado na tela F12", "Log;"+e);
		
	}

	public void relatorioAtualizarSaldoF12() {
		dsl.relatorioSemPrint("C:\\report/F12.html", "F12", "Atualizar Saldo Poupanca na tela F12", "Ao realizar um deposito o sistema deve Atualizar o saldo poupanca do associado na tela F12");
		
	}

	public void relatorioAtualizarSaldoF12Erro(Throwable e) {
		dsl.relatorioErroSemPrint("C:\\report/F12.html", "F12", "Atualizar Saldo Poupanca na tela F12", "Ao realizar um deposito o sistema deve Atualizar o saldo poupanca do associado na tela F12","Log;"+e);
		
	}
	
	
}
