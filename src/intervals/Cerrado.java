package intervals;

public class Cerrado extends Punto {

	public Cerrado(double valor) {
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
		return (this.valor > punto.valor) || (this.valor == punto.valor) ;
	}

	@Override
	public boolean isGreaterOrEqualsThan(Cerrado punto) {
		return this.valor == punto.valor;
	}

	@Override
	public boolean greaterOrEquals(Punto punto) {
		return punto.isLessOrEquals(this);
	}

	@Override
	public boolean isLessOrEquals(Abierto punto) {
		return (this.valor < punto.valor) || (this.valor == punto.valor) ;
	}

	@Override
	public boolean isLessOrEquals(Cerrado punto) {
		return this.valor == punto.valor;
	}

	

}
