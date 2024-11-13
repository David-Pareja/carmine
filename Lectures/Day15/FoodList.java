package Lectures.Day15;
public class FoodList {
    FoodNode head;

    public FoodList(){
        head = null;
    }

    public boolean isEmpty(){
        if (head == null) return true;
        return false;
    }

    public void add(Food food){
        FoodNode n = new FoodNode(food); // in the middle of nowhere there will be a new node
        // n is poiting to the new node Food

        if (head == null){ // if nothing in the list it will just add
            head =  n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void insert(Food food) {
        FoodNode n = new FoodNode(food);

        if (head == null){
            head = n;
            return;
        }
//the new one goes first
        if (food.name.compareTo(head.food.name) < 0) {
            //add(food)
            n.next = head;
            head = n;
            return;
        }

        FoodNode current = head;
        while (current.next != null){
            if (n.food.name.compareTo(current.next.food.name) < 0 ){
                n.next = current.next;
                current.next = n;
            }
            current = current.next;
        }

        current.next = n;
    }
    // O(n)
    public void print() {
        FoodNode current = this.head;

        while ( current != null ){
            System.out.println(current.food);
            current = current.next;
        }
    }

    public Food FindFood(String search){
        if (head == null ) return null;
        FoodNode current = head;
        while (current != null){
            if (current.food.name.equals(search)){
                return current.food;
            }
            current = current.next; // do not forget
        }
        return null;
    }
    public int countIteratively(){
        if (head == null) return 0;
        int total = 0;
        
        FoodNode current = head;
        while (current != null) {
            total++;
            current = current.next;
        }

        return total;
    }

    public int count(FoodNode n) {
        if (n == null) return 0;
        return 1 + count(n.next);
    }
    public int countRecursively(){
        return count(head);
    }

    public void printFood(FoodNode n){
        if (n== null) return;
        System.out.println(n.food);
        printFood(n.next);
    }

    public void printRecursively(){
        printFood(head);
    }


    public void printReversed(FoodNode n){
        if (n == null) return;
        printReversed(n.next);
        System.out.println(n.food);
    }
    public void printReversed(){
        printReversed(head);
    }
}
