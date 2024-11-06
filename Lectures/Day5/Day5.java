package Lectures.Day5;
public class Day5 {
    public static int findMinUnsorted(int[] a){
        int smol = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i] < smol) smol = a[i];

        }

        return smol;
    }

    public static int findMaxUnsorted(int[] a){
        int beh = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i] < beh) beh = a[i];

        }

        return beh;
    }

    public static int findMinSorted(int[] a){
        return a[0];
    }
    

    public static int findMaxSorted(int[] a){       
        return a[a.length-1];
    }

    public static void main(String[] args){

    }
}
