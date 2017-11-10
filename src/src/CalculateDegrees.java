import java.io.IOException;

import static java.lang.Math.abs;

public class CalculateDegrees {
    private double difference;
    private int hour;
    private int minute;

    CalculateDegrees(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void calculateDifference() throws IOException {
        if (hour < 0 || hour > 12 || minute < 0 || minute > 60) {
            throw new IOException("Tunnid või minutid on valed.");
        } else {
            double hourDegrees = 360 / 12 * hour;
            double minutesDegrees = 360 / 60 * minute;
            // The minute hand moves if minute hand moves.
            // Maximum movement for hour is 30 degrees and minimum 0.
            double hourDegreesMovement = minutesDegrees / 12;
            this.difference = abs(abs(hourDegrees - minutesDegrees) - hourDegreesMovement);
        }

    }

    double getDifference() {
        return difference;
    }

    @Override
    public String toString() {
        return "Nurk " + hour + " (tunnid) ja " + minute + " (minutid) vahel on " + difference + " kraadi.";
    }
}
