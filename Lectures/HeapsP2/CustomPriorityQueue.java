

public class CustomPriorityQueue {

    private int[] list;
    private int size = 0;
    private int capacity;

    public CustomPriorityQueue(int capacity) {
        this.capacity = capacity;
        list = new int[capacity + 1];
    }

    public boolean empty() { return this.size == 0; }
    public int size() { return this.size; }
    public boolean full() { return this.size == this.capacity; }
    
    public void insert(int value) {
        if (full()) throw new StackOverflowError("Queue is full");
        int hole = ++this.size;
        while (true) {
            if (hole == 1) break;
            int parent = hole / 2; 
            if (value < this.list[parent]) break;
            this.list[hole] = this.list[parent];
            hole = parent;
        }
        this.list[hole] = value;
    }
    
    public int delete() {
        if (this.size == 0) return -1; // null 
        int result = this.list[1];
        int temp = this.list[this.size]; 
        this.size--;
        int hole = 1;
        while (true) {
            int child = hole*2;
            if (child > this.size) break;
            // pick which of the 2 children to use
            if (child != this.size && this.list[child+1] > this.list[child]) child++;
            
            // if left over one is smaller, promote the hcild
            if (temp < this.list[child]) {
                this.list[hole] = this.list[child];
            } else {
                break;
            }

            hole = child;
        }

        this.list[hole] = temp;

        return result;
    }

    public void print() {
        for (int i = 1; i <= this.size; i++) {
            System.out.print(this.list[i] + " ");
        }
        System.out.println();
    }

    public void printOrdered() {
        while (!empty()) {
            int x = delete();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

