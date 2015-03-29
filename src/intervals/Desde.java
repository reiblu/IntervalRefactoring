package intervals;

public class Desde extends Punto {

	public Desde(double valor) {
		super(valor);
	}

	@Override
	public boolean isGreater(Punto punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreater(Desde punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreater(Hasta punto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreater(Exacto punto) {
		// TODO Auto-generated method stub
		return false;
	}

}
