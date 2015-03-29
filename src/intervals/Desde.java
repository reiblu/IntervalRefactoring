package intervals;

public class Desde extends Punto {

	public Desde(double valor) {
		super(valor);
	}

	@Override
	public boolean isGreater(Punto punto) {
		return punto.isLessThan(this);
	}

	@Override
	public boolean isLessThan(Desde punto) {
		return this.valor < punto.valor ;
	}

	@Override
	public boolean isLessThan(Hasta punto) {
		return false;
	}

	@Override
	public boolean isLessThan(Exacto punto) {
		return false;
	}

	@Override
	public boolean lessOrEquals(Punto punto) {
		return punto.isGreaterOrEquals(this);
	}

}
