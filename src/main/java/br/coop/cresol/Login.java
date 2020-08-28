package br.coop.cresol;


	

import org.junit.Test;

import Core.Basetest;
import br.pages.cresol.Loginpage;

	public class Login extends Basetest {

    Loginpage Page;

	@Test
	public void login() throws InterruptedException {
	

	Page.inicio();
	Page.usuario("VICTOR");
	Page.clicarunidade();
	Page.numerodacooperativa("1075");
	Page.selecionarcooperativa("001075 - CRESOL VALE EUROPEU");
	Page.senha("ferroada");
	Page.clicarconfirmar();
	Page.depois();
	
	
	

	
	}

	}

	
