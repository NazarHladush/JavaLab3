package ua.lviv.iot.athletics.models;

public abstract class Athletics {

    private int maxfAthleteCount;
    private String nameKindOfSports;
    private boolean availabilityFinishLine;
    private double averageDuration;
    protected double length;


    public  Athletics(){
    }

    public Athletics(int maxfAthleteCount, String nameKindOfSports, boolean availabilityFinishLine, double averageDuration, double length) {
        this.maxfAthleteCount = maxfAthleteCount;
        this.nameKindOfSports = nameKindOfSports;
        this.availabilityFinishLine = availabilityFinishLine;
        this.averageDuration = averageDuration;
        this.length = length;
    }

    public int getMaxfAthleteCount() {
        return maxfAthleteCount;
    }

    public void setMaxfAthleteCount(int maxfAthleteCount) {
        this.maxfAthleteCount = maxfAthleteCount;
    }

    public String getNameKindOfSports() {
        return nameKindOfSports;
    }

    public void setNameKindOfSports(String nameKindOfSports) {
        this.nameKindOfSports = nameKindOfSports;
    }

    public boolean isAvailabilityFinishLine() {
        return availabilityFinishLine;
    }

    public void setAvailabilityFinishLine(boolean availabilityFinishLine) {
        this.availabilityFinishLine = availabilityFinishLine;
    }

    public double getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(double averageDuration) {
        this.averageDuration = averageDuration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
