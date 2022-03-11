public class Torso {

    private String gasTank;

    public Torso() {
        setGasTank(gasTank);
    }

    public void checkGasTank(){
        System.out.println(getGasTank() + " is checked.");
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

}
