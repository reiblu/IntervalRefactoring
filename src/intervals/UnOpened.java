package intervals;

public class UnOpened extends Interval {
	
	public UnOpened(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

}
