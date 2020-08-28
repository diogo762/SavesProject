package Core;

/**
 * Classe que instancia a classe Dsl para as classes Pages, todas as classes
 * page precisam extender essa classe
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Basepage {

	protected Dsl dsl;

	public Basepage() {
		dsl = new Dsl();
	}
}
