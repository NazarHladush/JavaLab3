package ua.lviv.iot.athletics.models;

public class Throw extends Athletics {

    private  ThrowType kindOfThrow;

    public Throw() {
    }

    public Throw(final int maxfAthleteCount,
                 final String nameKindOfSports,
                 final boolean availabilityFinishLine,
                 final double averageDuration,
                 final double length,
                 final ThrowType kindOfThrow) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine,
                averageDuration, length);
        this.kindOfThrow = kindOfThrow;
    }

    public ThrowType getKindOfThrow() {
        return kindOfThrow;
    }

    public void setKindOfThrow(final ThrowType kindOfThrow) {
        this.kindOfThrow = kindOfThrow;
    }
}
