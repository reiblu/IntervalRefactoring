package intervals;

public abstract class Interval {

	protected double minimum;

	protected double maximum;

	public Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;

	}

	public abstract Opening getOpening();

	public double midPoint() {
		return (minimum + maximum) / 2;
	}

	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);
	
	public abstract boolean includes(BothOpened interval);
	
	public abstract boolean includes(RightOpened interval);
	
	public abstract boolean includes(LeftOpened interval);
	
	public abstract boolean includes(UnOpened interval);

	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		// TODO
		return null;
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}
}
