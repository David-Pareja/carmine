public class Movie implements Comparable<Movie> {
    String name;
    int minutes;

    public Movie(String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
    }
    
    public String toString() {
        return this.name + ": " + this.minutes;
    }

    public int compareTo(Movie other) {
        if (this.minutes < other.minutes) return -1;
        if (this.minutes > other.minutes) return 1;
        return 0;
    }
}
