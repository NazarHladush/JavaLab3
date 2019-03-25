package ua.lviv.iot.athletics.models;

public class Run extends Athletics {

    private RunType kindOfRun;
    private double time;
    private double speed;

    public Run() {
    }

    public Run(final int maxfAthleteCount,
               final String nameKindOfSports,
               final boolean availabilityFinishLine,
               final double averageDuration,
               final double length,
               final RunType kindOfRun,
               final double time,
               final double speed) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine,
                averageDuration, length);
        this.kindOfRun = kindOfRun;
        this.time = time;
        this.speed = speed;
    }

    public RunType getKindOfRun() {
        return kindOfRun;
    }

    public void setKindOfRun(final RunType kindOfRun) {
        this.kindOfRun = kindOfRun;
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
