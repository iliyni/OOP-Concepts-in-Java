public class Voltran {

    private Arms arms;
    private Legs legs;
    private Torso torso;
    private Head head;

    public Voltran(Arms arms, Legs legs, Torso torso, Head head) {
        this.arms = arms;
        this.legs = legs;
        this.torso = torso;
        this.head = head;
    }

    public void startVoltran(){
        System.out.println("Enemy identification system has been activated. ");
    }

    public void stopVoltran(){
        System.out.println("Enemy identification system has been disactivated.");
    }


    public Arms getArms() {
        return arms;
    }

    public void setArms(Arms arms) {
        this.arms = arms;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Torso getTorso() {
        return torso;
    }

    public void setTorso(Torso torso) {
        this.torso = torso;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

}
