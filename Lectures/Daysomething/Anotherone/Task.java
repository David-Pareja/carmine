package Lectures.Daysomething.Anotherone;

public class Task {
    int priority;
    String description;

    public Task(String description, int priority){
        this.description = description;
        this.priority = priority;
    }

    public String toString(){
        return "[" + priority + "] " + description;
    }

    public int compareTo(Task other) {
        if (priority> other.priority) return -1;
                return 1;
    }
}
