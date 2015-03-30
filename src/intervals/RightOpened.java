package intervals;

public class RightOpened extends Interval {

	public RightOpened(double minimum, double maximum) {
		super();
		this.minimum = new Cerrado(minimum);
		this.maximum = new Abierto(maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.RIGHT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		Cerrado valor = new Cerrado(value);
		return (this.minimum.lessOrEquals(valor)) && (this.maximum.isGreaterThan(valor));
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimum.greaterOrEquals(interval.minimum) && this.maximum.lessOrEquals(interval.maximum);

	}


}
