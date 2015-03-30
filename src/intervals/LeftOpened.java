package intervals;

public class LeftOpened extends Interval {
	
	public LeftOpened(double minimum, double maximum) {
		super();
		this.minimum = new Abierto(minimum);
		this.maximum = new Cerrado(maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(Interval interval) {
		return this.minimum.lessOrEquals(interval.minimum) && this.maximum.greaterOrEquals(interval.maximum);
	}


}
