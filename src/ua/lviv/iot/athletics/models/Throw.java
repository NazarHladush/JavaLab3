package ua.lviv.iot.athletics.models;

import ua.lviv.iot.athletics.models.ThrowType;

public class Throw extends Athletics {

    private ThrowType kindOfThrow;

    public Throw() {
    }

    public Throw(int maxfAthleteCount, String nameKindOfSports, boolean availabilityFinishLine, double averageDuration, double length, ThrowType kindOfThrow) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine, averageDuration, length);
        this.kindOfThrow = kindOfThrow;
    }
}
