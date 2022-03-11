public class Main {

    public static void main(String[] args) {
	// write your code here
        Bathroom bathroom = new Bathroom();
        Kitchen kitchen = new Kitchen();
        Lamp lamp = new Lamp();
        Bed bed = new Bed();
        Room room = new Room(lamp,bed);
        House house = new House("Izmir", room, bathroom, kitchen);

        house.enterHouse();
        house.getKitchen().enterKitchen();
        house.getBathroom().washHand();
        house.getBathroom().washClothes();
        house.getBathroom().takeShower();
        house.getRoom().enterRoom();
        house.getRoom().getBed().setLocation("corner");
        house.getRoom().getLamp().lampOn();
        house.getRoom().getBed().readBook();
        house.getRoom().getLamp().lampOff();
        house.getRoom().getBed().sleep();


    }
}
