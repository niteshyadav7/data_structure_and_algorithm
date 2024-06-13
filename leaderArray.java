import java.util.ArrayList;

public class leaderArray {
  public static ArrayList<Integer> leader(int A[]) {
    ArrayList<Integer> list = new ArrayList<>();
    int max = -9999999;
    for (int i = 0; i < A.length; i++) {
      if (max < A[i]) {
        list.add(A[i]);
        max = A[i];
      }
    }
    return list;
  }
}
