package intervals;

public abstract class Punto {
	
	protected double valor;
	
	public Punto (double valor){
		this.valor = valor;
	}
	
	public abstract boolean isLessThan(Punto punto);
	
	public abstract boolean isGreaterThan(Punto punto);
	
	public abstract boolean lessOrEquals(Punto punto);

	public abstract boolean isGreaterOrEqualsThan(Abierto punto);
	
	public abstract boolean isGreaterOrEqualsThan(Exacto punto);

	public abstract boolean greaterOrEquals(Punto punto);
	
	public abstract boolean isLessOrEquals(Abierto punto);
	
	public abstract boolean isLessOrEquals(Exacto punto);

}
