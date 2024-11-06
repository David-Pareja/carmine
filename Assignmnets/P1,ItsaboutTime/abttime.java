/*
Your Name: David Pareja
Pace Email: dp91375n@pace.edu
Record the time for the following search:
Linear Search:
0: 9057900
100: 7644300
2,500: 9316200
50,000: 8545100
100,000: 11695600
1,000,000: n/a, 6497400
Binary Search:
0: 270700
100: 370000w
2,500: 394100
50,000: 310800
100,000: 427500
1,000,000: n/a, 407700
Write a couple sentences about what you observed: Well to be fair Binary all comes down to luck but since linear just searches left to right. 
Also the chances to find 1m are slim since you asked for a range of 0 - 999,999 but i still included a search time.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class abttime {
    public int search;

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(1000000);
        Random rnd = new Random(1);

        for (int i = 0; i < 1000000; i++) {
            numbers.add(rnd.nextInt(1000000));
        }
        Collections.sort(numbers);
        //edit this for num 
        int search = 5322;

        int index = linearSearch(numbers, search); 
        int index2 = binarySearch(numbers, search); 

        long startTimeLS = System.nanoTime();
        if (index != -1) {
            System.err.println("\nLINEAR SEARCH\nFound " + search + " at index: " + index);
        } else {
            System.err.println(search + " not found in list.");
        }
        long endTimeLS = System.nanoTime();

        System.err.println("\nLinear Search Time: " + (endTimeLS - startTimeLS) + " nanosecs\n" );
        
        long startTimeBS = System.nanoTime();
        if (index2 != -1) {
            System.err.println("BINARY SEARCH\nFound " + search + " at index: " + index2);  // Corrected to index2
        } else {
            System.err.println(search + " not found in list.");
        }
        long endTimeBS = System.nanoTime();

        System.err.println("\nBinary Search Time: " + (endTimeBS - startTimeBS) + " nanos\n");

    }

    public static int linearSearch(ArrayList<Integer> a, int search) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == search) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Integer> a, int search) {
        int left = 0;
        int right = a.size() - 1;  
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a.get(mid) == search) {
                return mid;
            }
            if (a.get(mid) < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

// Your code for getting the times is not correct. You wrote this:

//  long startTimeLS = System.nanoTime();
//         if (index != -1) {
//             System.err.println("\nLINEAR SEARCH\nFound " + search + " at index: " + index);
//         } else {
//             System.err.println(search + " not found in list.");
//         }
//         long endTimeLS = System.nanoTime();

// All this is doing is calculating the time it took to write the print statement. You want to do this:

//         long startTimeLS = System.nanoTime();
//       int index = linearSearch(numbers, search); 
//       long endTimeLS = System.nanoTime();

// Your report is not correct. Binary search is not "luck" it is always log(n) time. It is really important to know. 

// You are correct the 1m should not show up. That was there to show what happens when you try to search for a not found number