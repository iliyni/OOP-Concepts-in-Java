public class Room {

    private String wardrobe;
    private String nightstand;
    private Lamp lamp;
    private Bed bed;

    public Room(Lamp lamp, Bed bed) {
        setWardrobe(wardrobe);
        setNightstand(nightstand);
        this.lamp = lamp;
        this.bed = bed;
    }

    public void enterRoom(){
        System.out.println("You have entered your lovely room.");
    }

    public String getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(String wardrobe) {
        this.wardrobe = wardrobe;
    }

    public String getNightstand() {
        return nightstand;
    }

    public void setNightstand(String nightstand) {
        this.nightstand = nightstand;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }
}
