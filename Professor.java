public class Professor extends User {
    public String position;
    public double rating;

    public Professor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = "Adjunct";
        this.rating = 0;
    }

    public String toString() {
        return position + " " + firstName + " " + lastName;
    }
}
