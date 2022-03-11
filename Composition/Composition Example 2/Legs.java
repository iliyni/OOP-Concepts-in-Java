public class Legs {
    private String rightLeg;
    private String leftLeg;

    public Legs() {
        setLeftLeg(leftLeg);
        setRightLeg(rightLeg);
    }

    public void turnRightLeg(){
        System.out.println("Check power supply.");
    }
    public void turnLeftLeg(){
        System.out.println("Activate hodo shield.");
    }

    public String getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(String rightLeg) {
        this.rightLeg = rightLeg;
    }

    public String getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(String leftLeg) {
        this.leftLeg = leftLeg;
    }

}
