import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void print(ArrayList<Course> a) {
        if (a == null || a.isEmpty()) {
            System.out.println("There are no courses");
            return;
        }
        for (Course course : a) {
            System.out.println(course);
        }
    }

    // bubble sort
    public static void bubbleSort(ArrayList<Course> a) {
        int n = a.size();
        for (int out = n - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a.get(in).compareTo(a.get(in + 1)) > 0) {
                    Collections.swap(a, in, in + 1);
                }
            }
        }
    }

    // insertion sort
    public static void insertionSort(ArrayList<Course> a) {
        for (int out = 1; out < a.size(); out++) {
            Course temp = a.get(out);
            int in = out;

            while (in > 0 && a.get(in - 1).compareTo(temp) > 0) {
                a.set(in, a.get(in - 1));
                --in;
            }
            a.set(in, temp);
        }
    }

    // selection sort
    public static void selectionSort(ArrayList<Course> a) {
        for (int out = 0; out < a.size() - 1; out++) {
            int min = out;
            for (int in = out + 1; in < a.size(); in++) {
                if (a.get(in).compareTo(a.get(min)) < 0) {
                    min = in;
                }
            }
            Collections.swap(a, out, min);
        }
    }

    public static void main(String[] args) {
        ArrayList<Course> a = new ArrayList<Course>();
        a.add(new Course("CS", "241", "Data Structures and Algorithms"));
        a.add(new Course("CS", "121", "Introduction to Computer Science"));
        a.add(new Course("CIS", "151", "Game Development for Everyone"));
        a.add(new Course("MAT", "100", "Fundamental Mathematics"));
        Collections.shuffle(a);

        System.out.println("Before any sorting");
        print(a);

        System.out.println("\n #After Bubble");
        bubbleSort(a);
        print(a);

        Collections.shuffle(a);

        System.out.println("\n #After Insertion");
        insertionSort(a);
        print(a);

        Collections.shuffle(a);
        System.out.println("\n #After selection sort");
        selectionSort(a);
        print(a);
    }
}
