package ua.lviv.iot.athletics.models;

public class SportWalking extends Athletics {

    private double time;
    private double speed;

    public SportWalking() {
    }



    public SportWalking(int maxfAthleteCount, String nameKindOfSports, boolean availabilityFinishLine, double averageDuration, double length, double time, double speed) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine, averageDuration, length);
        this.speed = speed;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
