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

        Node current = head;
        //o(n)
        while (current.next != null){
            if (n.priority > current.next.priority){
                n.next = current.next;
                current.next =n;
                return;
            }
            current = current.next;
        }

        current.next = n;
    }

    //o(1)
    public Node deleteMax(){
        if (head == null) return null;

        Node n = head;
        head = head.next;
        return n;

    }

}
