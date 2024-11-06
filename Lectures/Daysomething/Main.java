package Lectures.Daysomething;

public class Main {
    public static void main(String[] args) {
        PQLL pq = new PQLL();
        pq.insert("Nap", 5);
        pq.insert("Laundry", 1);
        pq.insert("Lunch", 10);
        pq.insert("Project 15", 15);
        pq.insert("Bday Party", 7);

        while (!pq.isEmpty()){
            Node n = pq.deleteMax();
            System.out.println(n.task);
        }
    }
}
