import java.util.ArrayList;

/**
 * Prefix sum and suffix sum
 * Carry Forward method
 * Sliding Window
 * Contribution method
 * Kadanne method
 */

public class SubArray {

  // List of Subarray Coding Problems

  // 1. Find All Subarrays
  // 2. Maximum Sum Subarray (Kadane’s Algorithm)
  // 3. Maximum Product Subarray
  // 4. Subarray Sum Equals K
  // 5. Longest Subarray with Sum K
  // 6. Subarray with Given Sum (Positive Numbers)
  // 7. Count of Subarrays with Given XOR
  // 8. Smallest Subarray with Sum Greater Than or Equal to K
  // 9. Longest Subarray with Equal Number of 0s and 1s
  // 10. Find Subarray with Maximum Average
  // 11. Maximum Length of Repeated Subarray
  // 12. Subarrays with Sum Divisible by K
  // 13. Maximum Sum Circular Subarray
  // 14. Subarray Product Less Than K
  // 15. Sum of All Subarrays

  // List of Substring Coding Problems

  // 1. Find All Substrings
  // 2. Longest Palindromic Substring
  // 3. Longest Substring Without Repeating Characters
  // 4. Longest Common Substring
  // 5. Count and Print All Substrings
  // 6. Count Distinct Substrings of a String
  // 7. Count Substrings with Exactly K Distinct Characters
  // 8. Longest Substring with At Most K Distinct Characters
  // 9. Longest Repeating Substring
  // 10. Smallest Substring Containing All Characters of Another String
  // 11. Longest Substring with Equal Number of 0s, 1s, and 2s
  // 12. Longest Substring with Same Letters after Replacement
  // 13. Longest Substring with K Unique Characters
  // 14. Shortest Substring with All Characters of a Given String
  // 15. Longest Substring with At Most Two Distinct Characters
  // 16. Longest Substring with At Least K Repeating Characters
  // 17. Count Substrings That Differ by One Character
  // 18. Find Substring with Concatenation of All Words
  // 19. Check if a Substring is Present in a String
  // 20. Find All Anagram Substrings

  /**
   * Problem Description
   * You are given an array A of N integers.
   * Return a 2D array consisting of all the subarrays of the array
   * 
   * Note : The order of the subarrays in the resulting 2D array does not matter.
   */
  // Algorithm I:Time Complexity : O(N^3) And Space Complexity : O(N)
  /**
   * generate the subarray from start to end index
   * then find the start and end indexes.
   */
  public static ArrayList<ArrayList<Integer>> allSubArrays(int A[]) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for (int start = 0; start < A.length; start++) {
      for (int end = start; end < A.length; end++) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int k = start; k <= end; k++) {
          ans.add(A[k]);
        }
        list.add(ans);
      }
    }
    return list;
  }

  //
  /**
   * Problem Description
   * You are given an integer array C of size A. Now you need to find a subarray
   * (contiguous elements) so that the sum of contiguous elements is maximum.
   * But the sum must not exceed B.
   */

  // Algorithm I: Approach I:Time Complexity O(N^3) And
  /***
   * first find the start and end then
   * iterate over the the array k=i;k<=j;k++
   * then find the sum of every subarray And check
   * if sum<=B then return max(ans,sum)
   * 
   * @param A
   * @return
   */
  public static int subarraySumBrute(int A[], int B) {
    int ans = 0;
    for (int start = 0; start < A.length; start++) {
      for (int end = start; end < A.length; end++) {
        int sum = 0;
        for (int k = start; k <= end; k++) {
          sum += A[k];
        }
        if (sum <= B) {
          ans = Math.max(ans, sum);
        }
      }
    }
    return ans;
  }

  // Approach II: Time compexity O(N^2)
  /**
   * sum find the using the carry forward
   * 
   */
  public static int subarraySumCF(int A[], int B) {
    int ans = 0;
    for (int i = 0; i < A.length; i++) {
      int sum = 0;
      for (int j = i; j < A.length; j++) {
        sum += A[j];
      }
      if (sum <= B) {
        ans = Math.max(ans, sum);
      }
    }
    return ans;
  }

  /**
   * Problem Description
   * You are given an integer array A of length N.
   * You have to find the sum of all subarray sums of A.
   * More formally, a subarray is defined as a contiguous part of an array which
   * we can obtain by deleting zero or more elements from either end of the array.
   * A subarray sum denotes the sum of all the elements of that subarray.
   * 
   * Note : Be careful of integer overflow issues while calculations. Use
   * appropriate datatypes.
   */
  // Algorithm I: Time complexity O(N) And Space Complexity O(1).
  /**
   * Using contribution technique
   * find how many times an particular elements appear
   * contribution=(i+1)*(n-i)
   */
  public static int allSubArraySum(int A[]) {
    int ans = 0;
    for (int i = 0; i < A.length; i++) {
      int contr = (i + 1) * (A.length - i);
      ans += A[i] * contr;
    }
    return ans;
  }

  /**
   * Problem Description
   * Given an array A of length N. Also given are integers B and C.
   * Return 1 if there exists a subarray with length B having sum C and 0
   * otherwise
   * 
   * A = [4, 3, 2, 6, 1]
   * B = 3
   * C = 11
   */
  // Sliding Window Technique
  public static boolean slidingSubArrayExist(int A[], int B, int C) {
    // A-> for arrays
    // B-> window length
    // C-> sum exist
    int initailSum = 0;
    for (int i = 0; i < B; i++) {
      initailSum += A[i];
    }
    int windowSum = initailSum;
    int l = 1, h = B;
    while (h < A.length) {
      windowSum = windowSum + A[h] - A[l - 1];
      if (windowSum == C)
        return true;
      l++;
      h++;
    }
    return false;
  }
}
