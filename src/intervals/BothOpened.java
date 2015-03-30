package intervals;

public class BothOpened extends Interval {
	
	public BothOpened(double minimum, double maximum) {
		super();
		this.minimum = new Abierto(minimum);
		this.maximum = new Abierto(maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		Cerrado valor = new Cerrado(value);
		return (this.minimum.isLessThan(valor)) && (this.maximum.isGreaterThan(valor));
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimum.greaterOrEquals(interval.minimum) && this.maximum.lessOrEquals(interval.maximum);
	}

}
