package intervals;

public class LeftOpened extends Interval {
	
	public LeftOpened(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return (this.minimum < value) && (this.maximum >= value);
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

}
