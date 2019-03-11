package ua.lviv.iot.athletics.models;

public class Jumping extends Athletics {

    private JumpType kindOfJump;
    private double height;

    public Jumping() {
    }

    public Jumping(int maxfAthleteCount, String nameKindOfSports, boolean availabilityFinishLine, double averageDuration, double length, JumpType kindOfJump, double height) {
        super(maxfAthleteCount, nameKindOfSports, availabilityFinishLine, averageDuration, length);
        this.kindOfJump = kindOfJump;
        this.height = height;
    }

    public JumpType getKindOfJump() {
        return kindOfJump;
    }

    public void setKindOfJump(JumpType kindOfJump) {
        this.kindOfJump = kindOfJump;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
