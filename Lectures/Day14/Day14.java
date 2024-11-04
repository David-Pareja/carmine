public class Day14{
    
    public static void main(String[] args){
        DrinkList drinks = new DrinkList();

        drinks.add(new Drink("Cortado", 3.75f));
        drinks.add(new Drink("Water", 1.00f));
        drinks.add(new Drink("Redbull", 4.00f));

        drinks.set(1, new Drink("Americano", 3.00));
        
        System.out.println(drinks.find("Espresso"));

        drinks.print();
        
        drinks.remove(1);

        drinks.add(new Drink("espresso.", 2.50));
    }


}