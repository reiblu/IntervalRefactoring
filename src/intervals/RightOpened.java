package intervals;

public class RightOpened extends Interval{

	public RightOpened(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.RIGHT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return (this.minimum <= value) && (this.maximum > value);
	}

	@Override
	public boolean includes(Interval interval) {
		return false;
	}
	
	

}
