public class Student extends Participant{

    public Student(String fullName, boolean wantLunch, boolean wantProceeding) {
        super(fullName, wantLunch, wantProceeding);
    }

    @Override
    public double fees() {
        double fee = getParticipantCost()*0.6;
        if(isWantProceeding()){
            fee += getProceedingCost();
        }
        if(isWantLunch()){
            fee += getLunchCost();
        }
        return fee;
    }
}
