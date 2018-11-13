package strategy;

public abstract class Felino {
	protected CorrerStrategy correrStrategy;
	protected PularStrategy pularStrategy;
	
	abstract public void display();
	abstract public void rugir();
	
	/*
	 * Para utilizar inje��o de depend�ncia. Isso torna o c�digo din�mico em tempo de execu��o, pois pode ser chamada uma
	 * das classes strategy de acordo com a necessidade por inje��o nesse m�todo. Isso torna a mudan�a de comportamento
	 * do felino por composi��o no lugar de heran�a.
	 */
	public void setCorrerStrategy(CorrerStrategy correrStrategy) {
		this.correrStrategy = correrStrategy;
	}
	
	/*
	 * Ap�s definida a strategy que ser� utilizada dinamicamente, poder� ser utilizado o comportamento esperado para o
	 * tipo de felino.
	 */
	public void performarCorrer() {
		correrStrategy.correr();
	}
	
	/*
	 * Mesma inten��o do setCorrerStrategy.
	 */
	public void setPularStrategy(PularStrategy pularStrategy) {
		this.pularStrategy = pularStrategy;
	}
	
	/*
	 * Mesma inten��o do performarCorrer.
	 */
	public void performarPular() {
		pularStrategy.pular();
	}
}
