package Array;

import java.util.Scanner;

class MergeTwoSortedArr {
    
    public static void merge(int nums1[], int m, int nums2[], int n) {
        
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;   // ✔ correct
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of valid elements in nums1:");
        int m = sc.nextInt();
        
        System.out.println("Enter number of elements in nums2:");
        int n = sc.nextInt();

        int nums1[] = new int[m + n];   // nums1 must have extra space
        int nums2[] = new int[n];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}