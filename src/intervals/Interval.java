package intervals;

public abstract class Interval {

    private double minimum;

    private double maximum;

    private Opening opening;

    public Interval(double minimum, double maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
       
    }
    
    public abstract Opening getOpening();
  
    
    public double midPoint() {
        return (minimum + maximum) / 2;
    }

    public boolean includes(double value) {
        boolean resultado = false;
        if (minimum < value && value < maximum) {
            return resultado = true;
        } else if (minimum == value) {
            if (opening == Opening.RIGHT_OPENED || opening == Opening.UNOPENED) {
                return resultado = true;
            }
        } else if (maximum == value) {
            if (opening == Opening.LEFT_OPENED || opening == Opening.UNOPENED) {
                return resultado = true;
            }
        }
        return resultado;
    }

    public boolean includes(Interval interval) {
        boolean resultado = false;
        if (includes(interval.minimum) && includes(interval.maximum)) {
            resultado = true;
        } else if ((minimum == interval.minimum) && this.maximum > interval.maximum) {
            if (opening == Opening.UNOPENED || opening == Opening.RIGHT_OPENED) {
                resultado = true;
            } else if ((opening == Opening.BOTH_OPENED) || (opening == Opening.LEFT_OPENED)) {
                if((interval.opening == Opening.BOTH_OPENED) || (interval.opening == Opening.LEFT_OPENED)){
                    resultado = true;
                }
            }

        } else if ((maximum == interval.maximum)) {
            if (opening == Opening.UNOPENED || opening == Opening.LEFT_OPENED) {
                resultado = true;
            } else if ((opening == Opening.BOTH_OPENED) || (opening == Opening.RIGHT_OPENED)) {
                if((interval.opening == Opening.BOTH_OPENED) || (interval.opening == Opening.RIGHT_OPENED)){
                    resultado = true;
                }
            }
        }
        return resultado;
    }

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
