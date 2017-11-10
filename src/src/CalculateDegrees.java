import static java.lang.Math.abs;

public class CalculateDegrees {
    private int difference;
    private int hour;
    private int minute;

    CalculateDegrees(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        calculateDifference(hour, minute);
    }

    private void calculateDifference(int hour, int minute) {
        int hourDegrees = 360 / 12 * hour;
        int minutesDegrees = 360 / 60 * minute;
        this.difference = abs(hourDegrees - minutesDegrees);
    }

    public int getDifference() {
        return difference;
    }

    @Override
    public String toString() {
        return "The angle between (hours) " + hour + " and (minutes) " + minute + " is: " + difference;
    }
}
