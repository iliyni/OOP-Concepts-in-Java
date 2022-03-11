public class CommunityMember extends Participant{

    public CommunityMember(String fullName, boolean wantLunch, boolean wantProceeding) {
        super(fullName, wantLunch, wantProceeding);
    }

    @Override
    public double fees() {
        double fee = getParticipantCost()*0.5;
        if(isWantLunch()){
            fee += getLunchCost();
        }
        return fee;
    }
}
