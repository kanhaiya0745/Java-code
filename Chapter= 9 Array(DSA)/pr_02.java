// /*  There is an integer array nums sorted in ascending order (with distinct values) prior to being passed to
// your function, nums is possibly roated at an unknown pivot index k (1<=k<nums.length) such that the resulting 
//  array is [num[k]], nums[k+1],...,num[n-1], nums[0], nums[1], ...nums[k-1]](0-indexed). For example [0,1,2,4,5,6,7]
// might be roated at pivot index 3 and become[4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is nums,
// or -1 if it is not in nums. 

// you must write an algorithm with 0(log n), run time complexity.

//import java.util.*;

// public class pr_02 {
//     public int search(int[] nums, int target) {
//         // min will have index of minimum element of nums
//         int min = minSearch(nums);
//         // find in sorted left
//         if (nums[min] <= target && target <= nums[nums.length - 1]) {
//             return search(nums, min, nums.length - 1, target);
//         } // find in sorted right
//         else {
//             return search(nums, 0, min, target);
//         }

//     // binary search to find target in left to right boundary
//     public int search(int[] nums,int left,int right,int target){ 
//             int l = left;
//             int r  = right;
//             // System.out.println(left+" "+right);
//             while(l <= r){ 
//                 int mid = l + (r - l)/2; 
//                 if(nums[mid] == target){
//                      return mid; 
//                     }
//                      else if(nums[mid] > target){
//                          r = mid-1; 
//                         }
//                          else{ l = mid+1; }}
//                           return -1;
//                         }

//     }return-1;}

//     }

//     public static void main(String args[]) {
//         int nums[] = { 4, 5, 6, 7, 0, 1, 2 };

//     }
// }
