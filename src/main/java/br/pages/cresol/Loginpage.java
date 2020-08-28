package br.pages.cresol;

import static Core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Core.Basepage;

public class Loginpage extends Basepage {

	

        
        public void usuario (String usuario) {
        	
        dsl.escrever("CHAVE", usuario);
        	
        	
        	
        }
        
        public void clicarunidade () {
        	
        dsl.clicar("UNIDADETextBox");
        	
        }
        
        public void numerodacooperativa (String numerodacooperativa) {
        	
        	dsl.escrever("UNIDADETextBox", numerodacooperativa);
        	
        	
        }
        
        public void selecionarcooperativa (String cooperativa) {
        	
        	dsl.selecionarCombo("UNIDADE", cooperativa);
        	
        }
        
        public void senha (String senha)  {
        	
        	getDriver().findElement(By.id("CHAVE_ENCRIPT")).clear();
        	
        	dsl.escrever("CHAVE_ENCRIPT", senha);
        	
        }

        
        public void clicarconfirmar () {
        	
        	dsl.clicarcss(".login_botao");
        
            
        	
        	
        }
        
        public void inicio () throws InterruptedException {
        	
        	//getDriver().get("http:10.90.2.143:8080/colmeia/login.do");
        	getDriver().get("http://contexto-teste.cresolconfederacao.com.br:8080/colmeia/");
        	getDriver().navigate().refresh();
    		Thread.sleep(5000);
    		for (String handle : getDriver().getWindowHandles()) {
    			getDriver().switchTo().window(handle);
    		}

    		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        	
        }
        
        public void depois () throws InterruptedException {
        	
        	
        	Thread.sleep(5000);
        	getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        	
        	
        }
        
        public void refresh () {
        	dsl.refreshPagina();
        	
        	
        }
        
	}

