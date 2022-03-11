public class Arms {
    private String rightArm;
    private String leftArm;

    public Arms() {

        setLeftArm(leftArm);
        setRightArm(rightArm);
    }

    public void turnRightArm(){
        System.out.println("The red laser gun was fired.");
    }

    public void turnLeftArm(){
        System.out.println("The blue laser gun was fired.");
    }

    public String getRightArm() {
        return rightArm;
    }

    public void setRightArm(String rightArm) {
        this.rightArm = rightArm;
    }

    public String getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(String leftArm) {
        this.leftArm = leftArm;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
