package intervals;

public class UnOpened extends Interval {
	
	public UnOpened(double minimum, double maximum) {
		super();
		this.minimum = new Cerrado(minimum);
		this.maximum = new Cerrado(maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimum.lessOrEquals(interval.minimum) && this.maximum.greaterOrEquals(interval.maximum);
	}


}
