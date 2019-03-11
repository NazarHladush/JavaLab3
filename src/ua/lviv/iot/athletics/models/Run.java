package ua.lviv.iot.athletics.models;

public class Run extends Athletics {

    private RunType kindOfRun;
    private double time;
    private double speed;

    public Run() {
    }

    public Run(int maxfAthleteCount, String nameKindOfSports, boolean availabilityFinishLine, double averageDuration, double length, RunType kindOfRun, double time, double speed) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine, averageDuration, length);
        this.kindOfRun = kindOfRun;
        this.time = time;
        this.speed = speed;
    }

    public RunType getKindOfRun() {
        return kindOfRun;
    }

    public void setKindOfRun(RunType kindOfRun) {
        this.kindOfRun = kindOfRun;
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
