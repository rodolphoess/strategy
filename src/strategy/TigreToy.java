package strategy;

public class TigreToy extends Felino {
	
	public TigreToy() {
		correrStrategy = new CorrerToy();
		pularStrategy = new PuloToy();
	}

	@Override
	public void display() {
		System.out.println("Tigre de borracha na banheira.");
	}

	@Override
	public void rugir() {
		System.out.println("Uen! Uen!");
	}

}
