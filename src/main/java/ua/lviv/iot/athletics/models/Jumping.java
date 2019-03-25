package ua.lviv.iot.athletics.models;

public class Jumping extends Athletics {

    private JumpType kindOfJump;
    private double height;

    public Jumping() {
    }

    public Jumping(final int maxfAthleteCount,
                   final String nameKindOfSports,
                   final boolean availabilityFinishLine,
                   final double averageDuration,
                   final double length,
                   final JumpType kindOfJump,
                   final double height) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine,
                averageDuration, length);
        this.kindOfJump = kindOfJump;
        this.height = height;
    }

    public String getHeaders() {
        return super.getHeaders()
                + ", kindOfJump"
                + ", height";
    }

    public String toCSV() {
        return super.toCSV()
                + ", " + kindOfJump
                + ", " + height;
    }

    public JumpType getKindOfJump() {
        return kindOfJump;
    }

    public void setKindOfJump(final JumpType kindOfJump) {
        this.kindOfJump = kindOfJump;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }
}
