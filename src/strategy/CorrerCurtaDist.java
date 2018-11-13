package strategy;

public class CorrerCurtaDist implements CorrerStrategy {

	@Override
	public void correr() {
		System.out.println("Correr curta distância, porém com o objetivo próximo.");
	}

}
