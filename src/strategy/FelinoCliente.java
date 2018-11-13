package strategy;

/**
 * @author Rodolpho E.
 * 
 * Implementa��o baseada no artigo https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia#title-2
 * 
 * Usa-se o padr�o de projeto strategy nas seguintes situa��es:
 * 1) Quando uma classe possui muitos comportamentos que aparecem com diversos IFs
 * 2) Quando muitas classes relacionadas diferetem apenas no seu comportamento
 * 3) Quando necessita-se de varia��es do algoritmo de classes
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
		
		//Inje��o de depend�ncia din�mica em tempo de execu��o, sobrepondo o construtor e adicionando um novo comportamento. 
		leopardo.setCorrerStrategy(new CorrerCurtaDist());
		leopardo.performarCorrer();
		
		
		leao.performarPular();
		leopardo.performarPular();
		tigreToy.performarCorrer();
	}

}
