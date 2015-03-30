package intervals;

public class Abierto extends Punto {

	public Abierto(double valor) {
		super(valor);
	}

	@Override
	public boolean isLessThan(Punto punto) {
		return this.valor < punto.valor ;
	}

	@Override
	public boolean isGreaterThan(Punto punto) {
		return this.valor > punto.valor ;
	}

	@Override
	public boolean lessOrEquals(Punto punto) {
		return punto.isGreaterOrEqualsThan(this);
	}

	@Override
	public boolean isGreaterOrEqualsThan(Abierto punto) {
		return (this.valor >= punto.valor);
	}

	@Override
	public boolean isGreaterOrEqualsThan(Cerrado punto) {
		return isGreaterThan(punto) ;
	}

	@Override
	public boolean greaterOrEquals(Punto punto) {
		return punto.isLessOrEquals(this);
	}

	@Override
	public boolean isLessOrEquals(Abierto punto) {
		return (this.valor <= punto.valor);
	}

	@Override
	public boolean isLessOrEquals(Cerrado punto) {
		return isLessThan(punto);
	}

	

	

}
