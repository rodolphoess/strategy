package strategy;

/**
 * @author Rodolpho E.
 * 
 * Implementação baseada no artigo https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia#title-2
 * 
 * Usa-se o padrão de projeto strategy nas seguintes situações:
 * 1) Quando uma classe possui muitos comportamentos que aparecem com diversos IFs
 * 2) Quando muitas classes relacionadas diferetem apenas no seu comportamento
 * 3) Quando necessita-se de variações do algoritmo de classes
 * 4) Quando necessita-se ocultar estruturas de dados complexas 
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
