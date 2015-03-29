package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum) {
		return new Interval(minimum, maximum);
	}
}
