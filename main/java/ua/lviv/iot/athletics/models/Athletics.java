package ua.lviv.iot.athletics.models;

public abstract class Athletics {

    private int maxfAthleteCount;
    private String nameKindOfSports;
    private boolean availabilityFinishLine;
    private double averageDuration;
    private double length;


    public  Athletics() {
    }

    public Athletics(final int maxfAthleteCount, final String nameKindOfSports,
                    final boolean availabilityFinishLine,
                     final double averageDuration, final double length) {
        this.maxfAthleteCount = maxfAthleteCount;
        this.nameKindOfSports = nameKindOfSports;
        this.availabilityFinishLine = availabilityFinishLine;
        this.averageDuration = averageDuration;
        this.length = length;
    }

    public int getMaxfAthleteCount() {
        return maxfAthleteCount;
    }

    public void setMaxfAthleteCount(final int maxfAthleteCount) {
        this.maxfAthleteCount = maxfAthleteCount;
    }

    public String getNameKindOfSports() {
        return nameKindOfSports;
    }

    public void setNameKindOfSports(final String nameKindOfSports) {
        this.nameKindOfSports = nameKindOfSports;
    }

    public boolean isAvailabilityFinishLine() {
        return availabilityFinishLine;
    }

    public void setAvailabilityFinishLine(
            final boolean availabilityFinishLine) {
        this.availabilityFinishLine = availabilityFinishLine;
    }

    public double getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(final double averageDuration) {
        this.averageDuration = averageDuration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
        this.length = length;
    }

}
