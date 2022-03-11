public class Main {

    public static void main(String[] args) {

        Arms arms = new Arms();
        Legs legs = new Legs();
        Torso torso = new Torso();
        Head head = new Head();
        Voltran voltran = new Voltran(arms,legs,torso,head);
        voltran.startVoltran();
        voltran.getHead().sendWarning();
        voltran.getTorso().checkGasTank();
        voltran.getArms().turnRightArm();
        voltran.getLegs().turnLeftLeg();
        voltran.stopVoltran();

    }
}
