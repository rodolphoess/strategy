package strategy;

public class CorrerToy implements CorrerStrategy {

	@Override
	public void correr() {
		System.out.println("Sou um brinquedo, não corro!");
	}

}
