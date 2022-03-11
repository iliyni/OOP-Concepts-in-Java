public class Kitchen {

    private String stove;
    private String refrigerator;
    private String table;
    private String oven;
    private String sink;
    private String dishwasher;

    public Kitchen() {
        setStove(stove);
        setRefrigerator(refrigerator);
        setTable(table);
        setOven(oven);
        setSink(sink);
        setDishwasher(dishwasher);
    }

    public void enterKitchen(){
        System.out.println("You have entered kitchen");
    }

    public String getStove() {
        return stove;
    }

    public void setStove(String stove) {
        this.stove = stove;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(String refrigerator) {
        this.refrigerator = refrigerator;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getOven() {
        return oven;
    }

    public void setOven(String oven) {
        this.oven = oven;
    }

    public String getSink() {
        return sink;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public String getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(String dishwasher) {
        this.dishwasher = dishwasher;
    }
}
