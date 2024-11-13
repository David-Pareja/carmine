
import java.util.Random;
import java.util.PriorityQueue;

class Main {

    public static void main(String[] args) {
        // usePQLL();
        // useJQLL();
        useCPQ();
    }

    public static void useCPQ() {
        int size = 20;
        Random r = new Random();
        CustomPriorityQueue cpq = new CustomPriorityQueue(size);
        for (int i = 0; i < size-1; i++) {
            cpq.insert(r.nextInt(0,100));
        }
        //cpq.print();
        cpq.printOrdered();

    }

    public static void useJQLL() {
        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(new Task("Fix login page", 1));
        pq.add(new Task("Setup database", 2));
        pq.add(new Task("Write tests", 3));
        pq.add(new Task("Implement search", 10));
        pq.add(new Task("Fix bugs", 5));
        pq.add(new Task("Write documentation", 6));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static void usePQLL() {
        PQLL pq = new PQLL();
        pq.insert("School", 1);
        pq.insert("Work", 2);
        pq.insert("Home", 3);
        pq.insert("Shopping", 4);
        pq.insert("Eating", 5);
        pq.insert("Sleeping", 6);

        while (!pq.empty()) {
            System.out.println(pq.deleteMax());
        }
    }

}
