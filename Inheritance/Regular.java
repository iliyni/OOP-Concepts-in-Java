public class Regular extends Participant {

    public Regular(String fullName, boolean wantLunch, boolean wantProceeding) {
        super(fullName, wantLunch, wantProceeding);
    }

    @Override
    public double fees() {
        double fee = getParticipantCost();
        if(isWantLunch()){
            fee += getLunchCost();
        }
        return fee;
    }
}
