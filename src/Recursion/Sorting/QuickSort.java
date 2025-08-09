package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
//    public static void main(String[] args) {
//        int[] arr = {5, 4, 3, 2, 1, 77, 55, 32};
//        sort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void sort(int[] nums, int low, int hi){
//        if(low >= hi){
//            return;
//        }
//
//        int s = low;
//        int e = hi;
//        int m = s + (e-s)/2;
//        int pivot = nums[m];
//
//        while(s <= e){
//
//            // also a reason why if its already sorted it will not swap
//            while(nums[s] < pivot){
//                s++;
//            }
//            while(nums[e] > pivot){
//                e--;
//            }
//
//            if(s <= e){
//                int temp = nums[s];
//                nums[s] = nums[e];
//                nums[e] = temp;
//                s++;
//                e--;
//            }
//        }
//
//        // now my pivot is at correct index, please sort two halves now
//        sort(nums, low, e);
//        sort(nums, s, hi);
//    }

//    public static void main(String[] args){
//        int[] arr = {5, 4, 3, 2, 1, 77, 55, 32};
//        sort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void sort(int[] arr, int low, int high){
//        if(low >= high){
//            return;
//        }
//
//        int s =low;
//        int e = high;
//        int m = s + ( e - s)/2;
//        int pivot = arr[m];
//
//        while (s <= e){
//            while(arr[s] <= pivot){
//                s++;
//            }
//            while(arr[e] >= pivot){
//                e--;
//            }
//
//            if(s <= e){
//                int temp = arr[s];
//                arr[s] = arr[e];
//                arr[e] = temp;
//                s++;
//                e--;
//            }
//        }
//        sort(arr, s, pivot);
//        sort(arr, pivot, e);
//    }
}
