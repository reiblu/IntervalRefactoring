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
	public boolean includes(Interval interval) {
		return this.minimum.lessOrEquals(interval.minimum) && this.maximum.greaterOrEquals(interval.maximum);
	}

}
