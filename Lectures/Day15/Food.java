package Lectures.Day15;
public class Food implements Comparable<Food>{
    public String name;
    public String taste;

    public Food (String name, String taste) {
        this.name = name;
        this.taste = taste;
    }
    public final String getName(){return name;}
    public final String getTaste(){return taste;}

    public String toString(){
        return this.taste + " " + this.name;
    }

    public int compareTo(Food other){
        return this.name.compareTo(other.getName());
    }
}
