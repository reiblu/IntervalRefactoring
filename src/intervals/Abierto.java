package intervals;

public class Abierto extends Punto {

	public Abierto(double valor) {
		super(valor);
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
		return this.valor >= punto.valor ;
	}

	@Override
	public boolean greaterOrEquals(Punto punto) {
		return punto.isLessOrEquals(this);
	}

	@Override
	public boolean isLessOrEquals(Abierto punto) {
		return isLessOrEqualsAux(punto);
	}

	@Override
	public boolean isLessOrEquals(Cerrado punto) {
		return isLessOrEqualsAux(punto);
	}

	public boolean isLessOrEqualsAux(Punto punto) {
		return this.valor <= punto.valor;
	}

}
