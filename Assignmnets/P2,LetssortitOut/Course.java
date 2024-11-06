
/*
Your Name: David Pareja
Pace Email: dp91375n@pace.edu
Based on YOUR code.
Bubble Sort:

What is the worst case big O and what kind of input would cause that?
O(n^2) when the list is reverse it'll serarch the max
What is the best case big O and what kind of input would cause that
O(n) is the best case if everything is already sorted 

Insertion Sort:
What is the worst case big O and what kind of input would cause that?
O(n^2) if its in reverse everything will be shifted in front
What is the best case big O and what kind of input would cause that?
O(n) if the array is already sorted no sorting is needed

Selection Sort:

What is the worst case big O and what kind of input would cause that?
O(n^2) scans any array regardless of order
What is the best case big O and what kind of input would cause that?
O(n^2) it'll still scan the whole array if sorted
*/

// import java.util.ArrayList;
//import java.util.Collections;

public class Course implements Comparable<Course> {
    public String dep;
    public String CNum;
    public String CName;

    public Course(String dep, String CNum, String CName) {
        this.dep = dep;
        this.CNum = CNum;
        this.CName = CName;

    }

    @Override
    public String toString() {
        return "\n" + dep + " " + CNum + " " + CName;
    }

    public int compareTo(Course o) {
        int depCompare = this.dep.compareTo(o.dep);
        if (depCompare != 0) {
            return depCompare;
        }
        return this.CNum.compareTo(o.CNum);
    }

    // public static void print(ArrayList<Course> a){
    // if (a == null || a.isEmpty()){
    // System.out.println("There are no courses");
    // return;
    // }
    // for ( Course course : a ) {
    // System.out.println(course);
    // }

    // }
    // public static void main(String[] args) {
    // ArrayList<Course> a = new ArrayList<>();
    // a.add(new Course("CS", "241", " Data Structures and Algorithms"));
    // a.add(new Course("CS", "121", " Introduction to Computer Science"));
    // a.add(new Course("CIS", "151", " Game Development for Everyone"));
    // a.sort(null);
    // print(a);
    // }
}



//FEEDBACK

// In your report you say your bubblesort best case is O(n) but yours is always N^2

// I didn't take off points for it, but you should have written your own swap (instead of using Collections.swap)