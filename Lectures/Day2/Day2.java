import Course;
import Professor;
import Student;

package Day2;
class Day2
{
    public static void main(String[] args) {

        Student s = new Student("Barth", "May", "bm@pace.edu");
        System.out.println(s);

        Student s2 = new Student("Bob", "The", "bt@pace.edu");
        s2.setMajor("Carpentry");
        System.out.println(s2);

        Professor p = new Professor("Carmine", "Guida", "cguida@pace.edu");
        System.out.println(p);
     
        Course c = new Course("CS", 241, "Data Structures");
        c.professor = p;
        System.out.println(c);

        System.out.println();
        c.addStudent(s);
        c.addStudent(s2);
        c.addStudent(new Student("Unc", "Marble", "um@pace.edu"));
        c.printStudents();

        Student favorite = c.findStudent("Dinspechin");
        if (favorite == null) {
            System.out.println("Didn't find them.");
        } else {
            System.out.println(favorite.email);
        }
    }
}