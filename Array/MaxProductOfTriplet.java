// package Array;
// Time Complexity: O(n3)
// Auxiliary Space: O(1)
// public class MaxProductOfTriplet {

//     public static int maxProduct(int nums[]){
//         int n=nums.length;
//         int maxProduct=Integer.MIN_VALUE;

//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     maxProduct=Math.max(maxProduct,nums[i]*nums[j]*nums[k]);
//                 }
//             }
//         }
//         return maxProduct;
//     }
//     public static void main(String[] args) {
//         int nums[]={1, -4, 3, -6, 7, 0};
//         System.out.println(maxProduct(nums));
//     }
// }



// Time O(n*log(n))  
// Space O(1)
// package Array;

// import java.util.Arrays;

// public class MaxProductOfTriplet {

//     public static int maxProduct(int nums[]){
//         int n=nums.length;
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             System.out.print(nums[i]+",");
//         }
//         System.out.println();

//         return Math.max(nums[0] * nums[1] * nums[n - 1],
//                         nums[n - 1] * nums[n - 2] * nums[n - 3]);

//     }
//     public static void main(String[] args) {
//         int nums[]={-10, -3, -5, -6, -20};
//         System.out.println(maxProduct(nums));
//     }
// }



// [Expected Approach] By Using Greedy approach - Time O(n) and Space O(1)
package Array;

import java.util.Arrays;

public class MaxProductOfTriplet {

    public static int maxProduct(int nums[]){
        int n=nums.length;
        int maxA=Integer.MIN_VALUE;
        int maxB=Integer.MIN_VALUE;
        int maxC=Integer.MIN_VALUE;

        int minA=Integer.MAX_VALUE;
        int minB=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>maxA){
                maxC=maxB;
                maxB=maxA;
                maxA=nums[i];
            }else if (nums[i]>maxB) {
                maxC=maxB;
                maxB=nums[i];
            }else if (nums[i]>maxC) {
                maxC=nums[i];                
            }

            if(nums[i]<minA){
                minB=minA;
                minA=nums[i];
            }else if (nums[i]<minB) {
                minB=nums[i];
            }
        }

        return Math.max(minA*minB*maxA,maxA*maxB*maxC);

    }
    public static void main(String[] args) {
        int nums[]={-10, -3, 5, 6, -20};
        System.out.println(maxProduct(nums));
    }
}
