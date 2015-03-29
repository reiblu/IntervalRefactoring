package intervals;

public class Hasta extends Punto {

	public Hasta(double valor) {
		super(valor);
	}

	@Override
	public boolean isGreater(Punto punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Desde punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Hasta punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Exacto punto) {
		// TODO Auto-generated method stub
		return false;
	}

}
