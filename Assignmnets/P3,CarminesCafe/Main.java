import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         ItemManager ItemManager = new ItemManager();
         boolean quit = false;
         String userInput;

         while (!quit){
            System.out.println("# ADD PRINT LOOKUP SORT QUIT #");
            userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("add")){
                System.out.println("Enter item name:    ");
                String name = scanner.nextLine();
                System.out.println("Enter price:    ");
                double price = scanner.nextDouble();
                ItemManager.add(new Item(name, price));
            } else if (userInput.equals("print")) {
                ItemManager.print();
            } else if (userInput.equals("lookup")){
                System.err.println("Enter item name:       ");
                String search = scanner.nextLine();
                ItemManager.lookup(search);
            } else if (userInput.equals("sort")){
                ItemManager.Quicksort();
                System.err.println("SORTED!!");
            } else {
                System.out.println("unknown");
            }
         }
         scanner.close();
         System.out.println("bye bye");
    }
}
