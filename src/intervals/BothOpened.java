package intervals;

public class BothOpened extends Interval {
	
	public BothOpened(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return (this.minimum < value) && (this.maximum > value);
	}

	@Override
	public boolean includes(Interval interval) {
		switch(interval.getOpening()){
		case BOTH_OPENED:
			return this.minimum <= interval.minimum && this.maximum >= interval.maximum;
		case RIGHT_OPENED:
			return this.minimum < interval.minimum && this.maximum >= interval.maximum;
		case LEFT_OPENED:
			return this.minimum <= interval.minimum && this.maximum > interval.maximum;
		case UNOPENED:
			return this.minimum < interval.minimum && this.maximum > interval.maximum;
		
		}
		return false;
	}

}
