import java.util.Arrays;

public class MergeSort {

  public static int[] mergeTwoSortedArray(int A[], int B[]) {
    int ans[] = new int[A.length + B.length];
    int p1 = 0, p2 = 0, p3 = 0;
    while (p1 < A.length && p2 < B.length) {
      if (A[p1] > B[p2]) {
        ans[p3] = B[p2];
        p2++;
        p3++;
      } else {
        ans[p3] = A[p1];
        p1++;
        p3++;
      }
    }
    while (p1 < A.length) {
      ans[p3] = A[p1];
      p1++;
      p3++;
    }
    while (p2 < B.length) {
      ans[p3] = B[p2];
      p2++;
      p3++;
    }
    return ans;
  }

  public static void merge(int A[], int start, int mid, int end) {
    int temp[] = new int[end - start + 1];
    int p1 = start, p2 = mid + 1, p3 = 0;

    // Merge two sorted halves into temp
    while (p1 <= mid && p2 <= end) {
      if (A[p1] < A[p2]) {
        temp[p3++] = A[p1++];
      } else {
        temp[p3++] = A[p2++];
      }
    }

    // Add remaining elements of the left half
    while (p1 <= mid) {
      temp[p3++] = A[p1++];
    }

    // Add remaining elements of the right half
    while (p2 <= end) {
      temp[p3++] = A[p2++];
    }

    // Copy sorted elements back into the original array
    for (int i = 0; i < temp.length; i++) {
      A[start + i] = temp[i];
    }
  }

  public static void mergeSort(int A[], int start, int end) {
    if (start >= end)
      return;

    int mid = (start + end) / 2;

    // Recursively divide and sort the array
    mergeSort(A, start, mid);
    mergeSort(A, mid + 1, end);

    // Merge the sorted halves
    merge(A, start, mid, end);
  }

  public static void main(String[] args) {
    // int A[] = { 1, 2, 5, 7, 8 };
    // int B[] = { 6, 7, 8, 9, 10 };
    // System.out.println(Arrays.toString(mergeTwoSortedArray(A, B)));
    int arr[] = { 2, 4, 1, 3, 4, 5, 11, 2, 7 };
    System.out.println(Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
