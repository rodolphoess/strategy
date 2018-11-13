package strategy;

public class Leao extends Felino {
	
	public Leao() {
		correrStrategy = new CorrerCurtaDist();
		pularStrategy = new PuloAlto();
	}

	@Override
	public void display() {
		System.out.println("Leão a vista!");
	}

	@Override
	public void rugir() {
		System.out.println("Urghhhh!");
	}

}
