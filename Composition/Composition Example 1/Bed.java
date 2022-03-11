public class Bed {

    public String bed;
    public String location;

    public Bed(){
        setBed(bed);
        setLocation(location);
    }

    public void readBook(){
        System.out.println("You have read a book.");
    }

    public void sleep(){
        System.out.println("You are sleeping...");
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        System.out.println("You have changed the location of bed to "+location+".");
    }
}
