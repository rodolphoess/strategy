package strategy;

/**
 * @author Rodolpho E.
 * 
 * Implementação baseada no artigo https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia#title-2
 *
 */
public class FelinoCliente {

	public static void main(String[] args) {
		Felino leao = new Leao();
		Felino leopardo = new Leopardo();
		Felino tigreToy = new TigreToy();
		
		leao.performarCorrer();
		leopardo.performarCorrer();
		tigreToy.performarCorrer();
		
		//Injeção de dependência dinâmica em tempo de execução, sobrepondo o construtor e adicionando um novo comportamento. 
		leopardo.setCorrerStrategy(new CorrerCurtaDist());
		leopardo.performarCorrer();
		
		
		leao.performarPular();
		leopardo.performarPular();
		tigreToy.performarCorrer();
	}

}
