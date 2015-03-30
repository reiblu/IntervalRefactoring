package intervals;

public class Hasta extends Punto {

	public Hasta(double valor) {
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
	public boolean isGreaterOrEqualsThan(Desde punto) {
		return (this.valor < punto.valor) || (this.valor == punto.valor) ;
	}

	@Override
	public boolean isGreaterOrEqualsThan(Hasta punto) {
		return (this.valor > punto.valor) || (this.valor == punto.valor) ;
	}

	@Override
	public boolean isGreaterOrEqualsThan(Exacto punto) {
		return this.valor == punto.valor;
	}

	@Override
	public boolean greaterOrEquals(Punto punto) {
		return punto.isLessOrEquals(this);
	}

	@Override
	public boolean isLessOrEquals(Desde punto) {
		return (this.valor > punto.valor) || (this.valor == punto.valor) ;
	}

	@Override
	public boolean isLessOrEquals(Hasta punto) {
		return (this.valor < punto.valor) || (this.valor == punto.valor) ;
	}

	@Override
	public boolean isLessOrEquals(Exacto punto) {
		return this.valor == punto.valor;
	}

	

}
