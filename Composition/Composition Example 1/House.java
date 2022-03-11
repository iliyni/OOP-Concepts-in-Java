public class House {

    private String address;
    private Room room;
    private Bathroom bathroom;
    private Kitchen kitchen;

    public House(String address, Room room, Bathroom bathroom, Kitchen kitchen) {
        this.address = address;
        this.room = room;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
    }

    public void enterHouse(){
        System.out.println("You have entered the house.");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
