import java.util.ArrayList;

public class Application {

    public static int totalParticipant(ArrayList<Participant> participants) {
        int total=0;
        for (int i = 0; i < participants.size(); i++) {
            total ++;
        }
        return total;
    }

    public static double totalMoney(ArrayList<Participant> participants) {
        double total=0;
        for (int i = 0; i < participants.size(); i++) {
            total +=participants.get(i).fees();
        }
        return total;
    }

    public static int totalProceeding(ArrayList<Participant> participants) {
        int total=0;
        for (int i = 0; i < participants.size(); i++) {
            if(participants.get(i).isWantProceeding()){
                total ++;
            }
        }
        return total;
    }

    public static int totalLunchServing(ArrayList<Participant> participants) {
        int total=0;
        for (int i = 0; i < participants.size(); i++) {
            if(participants.get(i).isWantLunch()){
                total ++;
            }
        }
        return total;
    }

}
