public class Lamp {
    private String lamp;

    public Lamp() {
        setLamp(lamp);
    }

    public void lampOn(){
        System.out.println("You have turned the lamp ON.");
    }

    public void lampOff(){
        System.out.println("You have turned the lamp OFF.");
    }

    public String getLamp() {
        return lamp;
    }
    public void setLamp(String lamp) {
        this.lamp = lamp;
    }

}
