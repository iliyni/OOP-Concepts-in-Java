import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(new Regular("Vito Corleone",true,false));
        participants.add(new Student("Michael Corleone",false,true));
        participants.add(new CommunityMember("Sonny Corleone",true,true));

        System.out.println("Total Participant  : "+ Application.totalParticipant(participants));
        System.out.println("Total Money        : "+ Application.totalMoney(participants));
        System.out.println("Total Proceeding   : "+ Application.totalProceeding(participants));
        System.out.println("Total Lunch Serving: "+ Application.totalLunchServing(participants));


    }
}
