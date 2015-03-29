package intervals;

public abstract class Punto {
	
	protected double valor;
	
	public Punto (double valor){
		this.valor = valor;
	}
	
	public abstract boolean isGreater(Punto punto);
	
	public abstract boolean isLessThan(Desde punto);
	
	public abstract boolean isLessThan(Hasta punto);
	
	public abstract boolean isLessThan(Exacto punto);
	
	public abstract boolean lessOrEquals(Punto punto);

}
