package intervals;

public class UnOpened extends Interval {
	
	public UnOpened(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(double value) {
		return (this.minimum <= value) && (this.maximum >= value);
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

}
