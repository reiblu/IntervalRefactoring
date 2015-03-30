package intervals;

public abstract class Interval {

	protected Punto minimum;

	protected Punto maximum;

	public Interval() {
	
	}

	public abstract Opening getOpening();

	public double midPoint() {
		return (minimum.valor + maximum.valor) / 2;
	}

	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);

	public boolean intersectsWith(Interval interval) {
		return false;
	}

	public Interval intersection(Interval interval) {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public boolean equals(Object object) {
		return false;
	}
}
