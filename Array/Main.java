package Array;


import java.util.*;
import java.lang.*;

public class Main {

    public static int sl(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        
        System.out.println(sl(arr));

        // System.out.println(secondLargest);
    }
}
