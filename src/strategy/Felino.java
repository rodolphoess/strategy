package strategy;

public abstract class Felino {
	protected CorrerStrategy correrStrategy;
	protected PularStrategy pularStrategy;
	
	abstract public void display();
	abstract public void rugir();
	
	/*
	 * Para utilizar injeção de dependência. Isso torna o código dinâmico em tempo de execução, pois pode ser chamada uma
	 * das classes strategy de acordo com a necessidade por injeção nesse método. Isso torna a mudança de comportamento
	 * do felino por composição no lugar de herança.
	 */
	public void setCorrerStrategy(CorrerStrategy correrStrategy) {
		this.correrStrategy = correrStrategy;
	}
	
	/*
	 * Após definida a strategy que será utilizada dinamicamente, poderá ser utilizado o comportamento esperado para o
	 * tipo de felino.
	 */
	public void performarCorrer() {
		correrStrategy.correr();
	}
	
	/*
	 * Mesma intenção do setCorrerStrategy.
	 */
	public void setPularStrategy(PularStrategy pularStrategy) {
		this.pularStrategy = pularStrategy;
	}
	
	/*
	 * Mesma intenção do performarCorrer.
	 */
	public void performarPular() {
		pularStrategy.pular();
	}
}
