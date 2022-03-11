public class Bathroom {

    private String bath;
    private String sink;
    private String washingMachine;
    private String basket;
    private String mirror;

    public Bathroom() {
        setBasket(basket);
        setBath(bath);
        setMirror(mirror);
        setSink(sink);
        setWashingMachine(washingMachine);
    }

    public void washHand(){
        System.out.println("You have washed your hands.");
    }
    public void washClothes(){
        System.out.println("You have done the laundry.");
    }
    public void takeShower(){
        System.out.println("You have took shower.");
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getSink() {
        return sink;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }
}
