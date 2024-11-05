public class LinkedList {
    public Node head;
    public Node tail;
    public int n;

    public LinkedList(){
        head = null;
        tail = null;
        n = 0;
    }

    public boolean isEmpty(){ return n == 0; }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.text);
            current = current.next;
            
        }
    }
    
    public void insert(String s){
        if(s == null){ throw new NullPointerException("Error string is null"); }

        Node newNode = new Node(s, null);
        if (isEmpty() || s.compareTo(head.text) <= 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) tail = newNode;
        } else {
            Node current = head;
            while (current.next != null && s.compareTo(current.next.text) > 0)
                current = current.next;
    
            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == null) tail = newNode; }
        n++;
    }

    public String getFirst(){
        if(!isEmpty()){
            return head.text;
        }
        return "";
    }

    public String getLast(){
        if(!isEmpty()){
            return tail.text;
        }
        return "";
    }

    public int count(){
        return n;
    }

    public String getShortest() {
        if (isEmpty()) {
            return "";
        }

        String shortest = head.text;
        Node current = head.next;

        while (current != null) {
            if (current.text.compareTo(shortest) < 0) {
                shortest = current.text;
            }
            current = current.next;
        }

        return shortest;
    }

    public String getLongest() {
        if (isEmpty()) {
            return "";
        }

        String longest = head.text;
        Node current = head.next;

        while (current != null) {
            if (current.text.compareTo(longest) > 0) {
                longest = current.text;
            }
            current = current.next;
        }

        return longest;
    }

    public boolean contains(String s){
        if(isEmpty()){
            return false;
        }

        Node current = head.next;

        while(current != null){
            if(current.text.compareTo(s) == 0){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String getNth(int nth){
        if(n < nth){
            return "";
        }
        Node current = head;

        for (int i = 0; i <= nth; i++){
            if(i == nth){
                return current.text;
            }
            current = current.next;
        }
        return "balls";
    }

    public void merge(LinkedList other) {
        Node current1 = this.head;
        Node current2 = other.head;
        LinkedList mergedList = new LinkedList();

        while (current1 != null && current2 != null) {
            if (current1.text.compareTo(current2.text) <= 0) {

                mergedList.insert(current1.text);
                current1 = current1.next;

            } else {

                mergedList.insert(current2.text);
                current2 = current2.next;

            }
        }
        while (current1 != null) {

            mergedList.insert(current1.text);
            current1 = current1.next;

        }
        while (current2 != null) {

            mergedList.insert(current2.text);
            current2 = current2.next;

        }
        this.head = mergedList.head;
        this.tail = mergedList.tail;
        this.n = mergedList.n;
    }
}

