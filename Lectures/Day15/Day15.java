package Lectures.Day15;

public class Day15{
    public static void main(String[] args){
    FoodList list = new FoodList();
    
    list.add(new Food("Cake", "Sweet"));
    list.add(new Food("Baklava", "Chocolate"));
    list.add(new Food("Ice cream", "Churro"));
    
    list.print();
    System.out.println("*******");
    list.printReversed();
    Food f = list.FindFood("Cake");
    if (f != null){
        System.out.println(f);
    } else {
        System.out.println("It's not in there.");
    }
    System.out.println(list.countIteratively());

    }

    //     LinkedList<String> list = new LinkedList<String>();

    //     list.add("Bob");
    //     list.add("Kevin");
    //     list.add("Alex");
    //     list.add("Alvin");

    //     list.remove(list);
    //     System.out.println(list);
    // } bro please
}