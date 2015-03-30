package intervals;

public class LeftOpened extends Interval {
	
	public LeftOpened(double minimum, double maximum) {
		super();
		this.minimum = new Cerrado(minimum);
		this.maximum = new Abierto(maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimum.greaterOrEquals(interval.minimum) && this.maximum.lessOrEquals(interval.maximum);
	}


}
