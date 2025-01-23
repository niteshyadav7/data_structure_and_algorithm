import java.util.Arrays;

public class Maths {

  public static int countFact(int A) {
    int cnt = 0;
    for (int i = 1; i * i <= A; i++) {
      if (A % i == 0) {
        if (i == A / i) {
          cnt += 1;
        } else
          cnt += 2;
      }
    }
    return cnt;
  }

  public static boolean checkPrime(int A) {
    int cnt = countFact(A);
    return cnt == 2 ? true : false;
  }

  public static int perfectNum(int A) {
    int num = 0;
    for (int i = 1; i * i <= A; i++) {
      if (A % i == 0) {
        if (i != A / i) {
          num += i + A / i;
        } else {
          num += i;
        }
      }
    }
    return num - A;
  }

  public static int cntPair(int A[], int M) {
    int ans = 0;
    int[] freq = new int[M];
    for (int i = 0; i < A.length; i++) {
      int mod = A[i] % M;
      freq[mod]++;
    }
    // handle zer0 reminder
    ans += freq[0] * (freq[0] - 1) / 2;
    if (M % 2 == 0)
      ans += freq[M / 2] * (freq[M / 2] - 1) / 2;

    for (int i = 1; i < M / 2; i++) {
      ans += freq[i] * freq[M - i];
    }

    return ans;
  }

  public static int gcd(int A, int B) {
    if (A == 0)
      return B;
    if (B == 0)
      return A;
    return gcd(B, A % B);
  }

  public static int gdcDelete(int A[]) {
    int maxGCD = 0;
    for (int i = 0; i < A.length; i++) {
      int currGCD = 0;
      for (int j = 0; j < A.length; j++) {
        if (i != j) {
          currGCD = gcd(currGCD, A[j]);
        }
        // System.out.println(currGCD);
      }
      maxGCD = Math.max(maxGCD, currGCD);
    }
    return maxGCD;
  }

  public static void main(String[] args) {
    // int arr[] = { 2, 3, 4, 8, 6, 15, 5, 12, 17, 7, 18, 10, 9 };
    // int m = 6;
    // System.out.println(cntPair(arr, m));
    int arr[] = { 24, 16, 18, 30, 15 };
    System.out.println(gdcDelete(arr));
  }
}
