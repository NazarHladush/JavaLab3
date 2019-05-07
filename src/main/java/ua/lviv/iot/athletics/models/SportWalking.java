package ua.lviv.iot.athletics.models;

public class SportWalking extends Athletics {

    private double time;
    private double speed;

    public SportWalking() {
    }

    public SportWalking(final int maxfAthleteCount,
                        final String nameKindOfSports,
                        final boolean availabilityFinishLine,
                        final double averageDuration,
                        final double length,
                        final double time,
                        final double speed) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine,
                averageDuration, length);
        this.speed = speed;
        this.time = time;
    }

    public String getHeaders() {
        return super.getHeaders()
                + ", time"
                + ", speed";
    }

    public String toCSV() {
        return super.toCSV()
                + ", " + time
                + ", " + speed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(final double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(final double speed) {
        this.speed = speed;
    }
}
