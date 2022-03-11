public abstract class Participant {

    private String fullName;
    private boolean wantLunch;
    private boolean wantProceeding;

    private int participantCost=500;
    private int proceedingCost=200;
    private int lunchCost=20;

    public Participant(String fullName, boolean wantLunch, boolean wantProceeding) {
        this.fullName = fullName;
        this.wantLunch = wantLunch;
        this.wantProceeding = wantProceeding;
    }

    public abstract double fees();

    public int getParticipantCost() {
        return participantCost;
    }

    public int getProceedingCost() {
        return proceedingCost;
    }

    public int getLunchCost() {
        return lunchCost;
    }

    public boolean isWantLunch() {
        return wantLunch;
    }

    public boolean isWantProceeding() {
        return wantProceeding;
    }
}
