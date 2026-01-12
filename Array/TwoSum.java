package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] index(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==target-arr[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] index1(int arr[],int target){
        Map<Integer,Integer>map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target=7;
        System.out.println(Arrays.toString(index1(arr, target)));
    }
}
