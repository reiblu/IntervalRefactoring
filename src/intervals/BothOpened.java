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
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpened interval) {
		return this.minimum >= interval.minimum && this.maximum <= interval.maximum;
	}

	@Override
	public boolean isIncluded(RightOpened interval) {
		return this.minimum >= interval.minimum && this.maximum <= interval.maximum;
	}

	@Override
	public boolean isIncluded(LeftOpened interval) {
		return this.minimum >= interval.minimum && this.maximum <= interval.maximum;
	}

	@Override
	public boolean isIncluded(UnOpened interval) {
		return this.minimum >= interval.minimum && this.maximum <= interval.maximum;
	}

}
