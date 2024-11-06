package Lectures.Daysomething.Anotherone;
import java.util.PriorityQueue;
public class JSPQ {
    public static void main(String[] carmine){
        PriorityQueue<Task> pq  = new PriorityQueue<Task>();

        Task a = new Task("Fix login page", 100);
        Task b = new Task("New server", 1);
        Task c = new Task("Replace Graphics card", 5);
        Task d = new Task("Fix falling Panel", 10);

        pq.add(a);
        pq.add(b);
        pq.add(c);
        pq.add(d);

        while (!pq.isEmpty()){
            Task temp = pq.poll();
            System.out.println(temp);
        }
    }

}
