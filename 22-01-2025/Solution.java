import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

  public static void findElm(int A[][], int k) {
    int rows = A.length;
    int cols = A[0].length;
    int temp = A[0][cols - 1];
    int i = 0, j = cols - 1;
    if (temp == k) {
      System.out.println("Exist " + i + ", " + j);
      return;
    }

    while (i < rows && j >= 0) {
      if (temp > k) {
        // left move
        j--;
        temp = A[i][j];
      } else if (temp < k) {
        // move down
        i++;
        temp = A[i][j];
      } else {
        System.out.println("Exist" + i + "," + j);
        return;
      }
    }
  }

  public static void countSort(int A[]) {
    // create array of size N.
    // create the freq array
    // fill the array
    int freq[] = new int[10];
    for (int i = 0; i < A.length; i++) {
      int idx = A[i];
      freq[idx]++;
    }
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      for (int j = 1; j <= freq[i]; j++) {
        list.add(i);
      }
    }
    System.out.println(list);
  }

  public static void negativeCountSort(int A[]) {
    int min = -2;
    int max = 8;
    int range = max - min + 1;
    int freq[] = new int[range + 1];
    for (int i = 0; i < A.length; i++) {
      freq[A[i] - min]++;
    }
    System.out.println(Arrays.toString(freq));
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < range; i++) {
      // System.out.println(freq[i]);
      while (freq[i]>0) {
        System.out.println(i+min);
        freq[i]--;
      }
    }
    System.out.println(list);
  }

  public static void main(String[] args) {
    int arr[] = { -2, 3, 8, 3, -2, 3 };
    negativeCountSort(arr);
    // countSort(arr);
  }
}