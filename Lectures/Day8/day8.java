package Lectures.Day8;
import java.util.Random;

public class day8 {

    public static void merge(int [] a, int l, int m, int r){
        int n = r - l + 1;
        int[] temp = new int[n];

        int k = 0; //target

        int p1 = l; // left array
        int p2 = m + 1; //right arary

        while (p1 <= m && p2 <= r){
            if (a[p1] < a[p2]){
                temp[k++] = a[p1++];
            } else {
                temp[k++] = a[p2++];
            }
        }
        while (p1 <= m){
            temp[k++] = a[p1++];
        }

        while (p2 <= r){
            temp[k++] = a[p2++];
        }

        for (int i = 0; i < n; i++){
            a[l + i] = temp[i];
        }
    }


    public static void mergesort(int[] a , int l, int r){
        if (l >= r) return;

        int m = (l + r) / 2;
        mergesort(a, l, m);
        mergesort(a, m + 1, r);
        merge(a, l, m, r);
    }
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++){
            System.err.println(a[i]);
        }
    }
    public static void main(String[] args){
        Random rand = new Random();

        int n = 100;
        int [] a = new int[n];
        
        for (int i = 0; i < n; i++){
            a[i] = rand.nextInt(1000);
        }

        print(a);
        System.err.println("~~~~~~~~~~~~~~~~~~~~~~~");
        mergesort(a,0,n-1);
        print(a);
    }
}
