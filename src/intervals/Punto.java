package intervals;

public abstract class Punto {
	
	protected double valor;
	
	public Punto (double valor){
		this.valor = valor;
	}
	
	public boolean isLessThan(Punto punto){
		return this.valor < punto.valor ;
	}
	
	public boolean isGreaterThan(Punto punto){
		return this.valor > punto.valor ;
	}
	
	public abstract boolean lessOrEquals(Punto punto);

	public abstract boolean isGreaterOrEqualsThan(Abierto punto);
	
	public abstract boolean isGreaterOrEqualsThan(Cerrado punto);

	public abstract boolean greaterOrEquals(Punto punto);
	
	public abstract boolean isLessOrEquals(Abierto punto);
	
	public abstract boolean isLessOrEquals(Cerrado punto);

}
