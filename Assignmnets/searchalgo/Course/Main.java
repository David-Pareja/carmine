package Course;

import java.util.ArrayList;

public class Main {
    public static void print(ArrayList<Course> a){
        if (a == null || a.isEmpty()){
            System.out.println("There are no courses");
            return;
        }
        for ( Course course : a ) {
            System.out.println(course);
        }
    }

    // bubble sort
    public static void bubbleSort(ArrayList<Course> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a.get(j).compareTo(a.get(j + 1)) > 0) {
                    Course test = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, test);
                }
            }
        }
    }

    // insertion sort
    public static void insertionSort(ArrayList<Course> a) {
        for (int i = 1; i < a.size(); i++) {
            Course key = a.get(i);
            int j = i - 1;

            while (j >= 0 && a.get(j).compareTo(key) > 0) {
                a.set(j + 1, a.get(j));
                j--;
            }
            a.set(j + 1, key);
        }
    }
    
    // Selection Sort method
    public static void selectionSort(ArrayList<Course> a) {
        if (a == null || a.size() < 2) {
            return;
        }

        for (int i = 0; i < a.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).compareTo(a.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap a[i] and a[minIndex]
            Course temp = a.get(minIndex);
            a.set(minIndex, a.get(i));
            a.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Course> a = new ArrayList<>();
        a.add(new Course("CS", "241", "Data Structures and Algorithms"));
        a.add(new Course("CS", "121", "Introduction to Computer Science"));
        a.add(new Course("CIS", "151", "Game Development for Everyone"));

        // Test bubble sort
        System.out.println("Before Bubble Sort:");
        print(a);
        bubbleSort(a);
        System.out.println("After Bubble Sort:");
        print(a);

        // Test insertion sort
        System.out.println("Before Insertion Sort:");
        print(a);
        insertionSort(a);
        System.out.println("After Insertion Sort:");
        print(a);

        // Test selection sort
        System.out.println("Before Selection Sort:");
        print(a);
        selectionSort(a);
        System.out.println("After Selection Sort:");
        print(a);
    }
}
