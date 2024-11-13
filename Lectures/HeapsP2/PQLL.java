
public class PQLL {

    private Node head = null;

    public boolean empty() {
        return this.head == null;
    }

    public void insert(String task, int priority) {
        Node n = new Node(task, priority);
        // if empty insert as head
        if (empty()) {
            this.head = n;
            return;
        }

        // if before head, insert before head
        if (priority > this.head.getPriority()) {
            n.setNext(this.head);
            this.head = n;
            return;
        }

        // Insert in first position where priority isn't greater than the the next node
        // priority
        Node current = this.head;
        while (current.getNext() != null) {
            if (priority > current.getNext().getPriority()) {
                n.setNext(current.getNext());
                current.setNext(n);
                return;
            }
            current = current.getNext();
        }
        current.setNext(n);
    }
    
    // Returns the task of the node that was deleted (if needed)
    public String deleteMax() {
        if (empty()) return null;
        String task = this.head.getTask();
        this.head = this.head.getNext();
        return task;
    }
    
    // Returns the task of the node that was deleted (if needed)
    public String deleteMin() {
        if (empty()) return null;
        String task = this.head.getTask();
        Node current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        this.head = current;
        return task;
    }

}
