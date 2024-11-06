public class Course {
    public String department;
    public int courseNumber;
    public String name;
    public Professor professor;
    public Student[] students;

    public Course(String department, int courseNumber, String name) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.name = name;
        this.professor = null;
        this.students = new Student[5];
    }

    private String getProfName() {
        if (professor == null) return "TBA";

        return professor.firstName + " " + professor.lastName;
    }

    public String toString() {
        return department + courseNumber + ": " + name + " - " + getProfName();
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) continue;

            System.out.println(students[i]);
        }
    }

    public void addStudent(Student s) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = s;
                return;
            }
        }

        System.out.println("Class is Full!");
    }

    public Student findStudent(String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) continue;

            if (students[i].lastName.equalsIgnoreCase(lastName)) {
                return students[i];
            }
        }
        return null;
    }

    public int countStudents() {
        int total  = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                total++;
            }
        }
        return total;
    }
}
