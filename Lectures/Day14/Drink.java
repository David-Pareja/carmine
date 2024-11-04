public class Drink {
    String name;
    private double price;

    public Drink(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " $" + String.format("%.2f", price);
    }
}
