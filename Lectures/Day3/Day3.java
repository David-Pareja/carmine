import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class Day3 {
    
    public static void main(String[] args) {
        Move[] things = new Move[3];
        things[0] = new Car();
        things[1] = new Bike();
        things[2] = new Jaguar();

        for (Move m : things) {
            m.move();
        }

        /* 
       Movie m1 = new Movie("Frozen", 120);
       Movie m2 = new Movie("No Country for Old Men", 90);
       Movie m3 = new Movie("Good Will Hunting", 150);
       Movie m4 = new Movie("The Matrix", 130);

       ArrayList<Movie> movies = new ArrayList<Movie>();
       movies.add(m1);
       movies.add(m2);
       movies.add(m3);
       movies.add(m4);

       Collections.sort(movies);

       for (Movie m : movies) {
        System.out.println(m);
       }

       */
        /* 
        ArrayList<String> names = new ArrayList<String>();
        names.add("Carmine");
        names.add("Sylia");
        names.add("Aaron");
        names.add("Chris");
        names.add("Lloyd");

        Collections.sort(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
*/
        /* 
        Horse h = new Horse();
        Pair<String, Integer> room = new Pair<String, Integer>("Room", 1114);
        Pair<Integer, Horse> pony = new Pair<Integer, Horse>(123, h);

        System.out.println(room);
        System.out.println(pony);
*/

        /* 
        Item<Integer> socks = new Item<Integer>();
        socks.set(1234, "Socks");

        Item<String> hats = new Item<String>();
        hats.set("HA5", "Hats");

        System.out.println(socks.get());
        System.out.println(hats.get());
*/
        /* 
        Integer x = 5;
        Character c = 'A';
        String s = "Hello";

        Container[] a = new Container[3];
        a[0] = new Container();
        a[0].set(x);

        a[1] = new Container();
        a[1].set(c);
        
        a[2] = new Container();
        a[2].set(s);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].get());
        }
        */
    }

}
