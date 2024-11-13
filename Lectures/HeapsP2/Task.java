
public class Task implements Comparable<Task> {

    private String description;
    private int priority;

    // getters
    public    int getPriority() { return priority; }
    public String getDescription() { return description; }

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return String.format("[%03d] %s", this.priority, this.description);
    }

    @Override
    public int compareTo(Task other) {
        return this.priority > other.getPriority() ? -1 : 1;
    }
}
