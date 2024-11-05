package Course;
/*
Your Name: [YOUR FULL NAME]
Pace Email: [YOUR PACE EMAIL ADDRESS]
Based on YOUR code.
Bubble Sort:
What is the worst case big O and what kind of input would cause that?
What is the best case big O and what kind of input would cause that?
Insertion Sort:
What is the worst case big O and what kind of input would cause that?
What is the best case big O and what kind of input would cause that?
Selection Sort:
What is the worst case big O and what kind of input would cause that?
What is the best case big O and what kind of input would cause that?
*/

// import java.util.ArrayList;
//import java.util.Collections;

public class Course implements Comparable<Course> {
    public String dep;
    public String CNum;
    public String CName;

    public Course(String dep, String CNum, String CName){
        this.dep = dep;
        this.CNum = CNum;
        this.CName = CName;

    }


    public String toString(){
        return dep + CNum + CName;
    }


   public int compareTo(Course o) {
    int depCompare = this.dep.compareTo(o.dep);
       if (depCompare != 0) {
           return depCompare;
        }
        return this.CNum.compareTo(o.CNum);
    }

   
    // public static void print(ArrayList<Course> a){
    //     if (a == null || a.isEmpty()){
    //         System.out.println("There are no courses");
    //         return;
    //     }
    //     for ( Course course : a ) {
    //         System.out.println(course);
    //     }
    
    // }
    //     public static void main(String[] args) {
    //     ArrayList<Course> a = new ArrayList<>();
    //     a.add(new Course("CS", "241", " Data Structures and Algorithms"));
    //     a.add(new Course("CS", "121", " Introduction to Computer Science"));
    //     a.add(new Course("CIS", "151", " Game Development for Everyone"));
    //     a.sort(null);
    //     print(a);
    // }
}
