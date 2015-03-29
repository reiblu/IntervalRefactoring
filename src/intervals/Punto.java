package intervals;

public abstract class Punto {
	
	private double valor;
	
	public Punto (double valor){
		this.valor = valor;
	}
	
	public abstract boolean isGreater(Punto punto);
	
	public abstract boolean isGreater(Desde punto);
	
	public abstract boolean isGreater(Hasta punto);
	
	public abstract boolean isGreater(Exacto punto);

}
