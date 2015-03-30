package intervals;

public class UnOpened extends Interval {
	
	public UnOpened(double minimum, double maximum) {
		super();
		this.minimum = new Cerrado(minimum);
		this.maximum = new Abierto(maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(double value) {
		Cerrado valor = new Cerrado(value);
		return (this.minimum.lessOrEquals(valor)) && (this.maximum.greaterOrEquals(valor));
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimum.isGreaterThan(interval.minimum) && this.maximum.lessOrEquals(interval.maximum);
	}


}
