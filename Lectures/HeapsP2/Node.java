
public class Node {

   private Node next;
   private int priority;
   private String task;

    public Node(String task, int priority) { 
        this.task = task;
        this.priority = priority;
    }

   // getters and setters
   public   Node getNext() { return next; }
   public String getTask() { return task; }
   public    int getPriority() { return priority; }

   public void setPriority(int priority) { this.priority = priority; }
   public void setNext(Node next) { this.next = next; }


}
