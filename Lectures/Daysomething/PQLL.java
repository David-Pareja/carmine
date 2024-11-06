package Lectures.Daysomething;

public class PQLL {
    Node head;

    public PQLL(){
        head = null;
    }

    public boolean isEmpty(){
        if (head == null) return true;
        return false;
    }

    public void insert(String task, int priority) {
        Node n = new Node(task, priority);

        if (head == null){
            head = n;
            return;
        }

        if (n.priority > head.priority) {
            n.next = head;
            head = n;
            return;
        }
    }


}
