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
	
	public abstract boolean isLower(Punto punto);
	
	public abstract boolean isGreaterThan(Desde punto);
	
	public abstract boolean isGreaterThan(Hasta punto);
	
	public abstract boolean isGreaterThan(Exacto punto);
	
	public abstract boolean lessOrEquals(Punto punto);

	public abstract boolean isGreaterOrEqualsThan(Desde punto);
	
	public abstract boolean isGreaterOrEqualsThan(Hasta punto);
	
	public abstract boolean isGreaterOrEqualsThan(Exacto punto);

	public abstract boolean greaterOrEquals(Punto punto);
	
	public abstract boolean isLessOrEquals(Desde punto);
	
	public abstract boolean isLessOrEquals(Hasta punto);
	
	public abstract boolean isLessOrEquals(Exacto punto);

}
