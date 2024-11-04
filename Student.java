public class Student extends User {
    public String major;
    public double gpa;
    
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = "undecided";
        this.gpa = 0;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + email + ") major: " + major;
    }
}
