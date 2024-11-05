/*
Your Name: David Pareja
Pace Email: dp91375n@pace.edu
Based on your code, what is the runtime for each method:
insert: o(n)
print: o(n)
contains: o(n)
count: o(1)
getFirst: o(1)
getLast: o(1)
getShortest: o(n)
getLongest: o(n)
getNth: o(n)
merge: o(n^2)
*/

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert("Cat");
        list.insert("Frog");
    

        LinkedList list2 = new LinkedList();
        list2.insert("Charlie");
        list2.insert("Alpha");
        list2.insert("Bravo");
        list2.insert("Dog");

        list.print();
        System.out.println("\n");
        list2.print();
        System.out.println("\n");
        list2.merge(list);
        System.out.println("\n");
        list2.print();
    }
}
