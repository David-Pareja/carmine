// import java.text.NumberFormat

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }//oops

    public double getPrice(){
        return price;
    }
    public void print() {
        // NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.printf("\n%s $%.2f%", name, price);
    }
}// the getters bro