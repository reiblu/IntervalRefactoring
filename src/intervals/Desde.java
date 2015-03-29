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
		return this.valor > punto.valor;
	}

	@Override
	public boolean isLessThan(Exacto punto) {
		return this.valor == punto.valor;
	}
	
	@Override
	public boolean isLower(Punto punto) {
		return punto.isGreaterThan(this);
	}

	@Override
	public boolean isGreaterThan(Desde punto) {
		return this.valor > punto.valor ;
	}

	@Override
	public boolean isGreaterThan(Hasta punto) {
		return this.valor < punto.valor ;
	}

	@Override
	public boolean isGreaterThan(Exacto punto) {
		return this.valor == punto.valor ;
	}

	@Override
	public boolean lessOrEquals(Punto punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreaterOrEqualsThan(Desde desde) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreaterOrEqualsThan(Hasta desde) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreaterOrEqualsThan(Exacto desde) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterOrEquals(Punto punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessOrEquals(Desde punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessOrEquals(Hasta punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessOrEquals(Exacto punto) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
