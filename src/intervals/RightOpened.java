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
	public boolean includes(Interval interval) {
		return this.minimum.lessOrEquals(interval.minimum) && this.maximum.greaterOrEquals(interval.maximum);

	}


}
