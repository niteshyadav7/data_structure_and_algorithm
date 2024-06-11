public class countFactors {
  /**
   * Problem Description
   * Given an integer A, you need to find the count of it's factors.
   * 
   * Factor of a number is the number which divides it perfectly leaving no
   * remainder.
   * 
   * Example : 1, 2, 3, 6 are factors of 6
   */
  // Approach I:
  /**
   * Divide the Number from 1 to N if the Number is divisible by then then count
   * ++
   */
  public static int countApp1(int A) {
    int count = 0;
    int start = 1;
    while (start <= A) {
      if (A % start == 0) {
        count++;
      }
      start += 1;
    }
    return count;
  }

  // Approach II:
  /**
   * let A=24 , then 1*24=24,2*12=24,3*8=24,4*6=24
   * After that repeation is started means 8*3=24,and so on. try to find till sqrt
   * of A.
   * Whenever the values are distinct then find add +2 to the counter And if same
   * then +1 to the counter
   * take i and j
   */
  public static int countApp2(int A) {
    int count = 0;
    for (int i = 1; i * i <= A; i++) {
      int j = A / i;
      if (i * j == A) {
        if (i != j) {
          count += 2;
        } else if (i == j) {
          count += 1;
        }
      }
    }
    return count;
  }

  /**
   * Problem Description
   * Given a number A. Return 1 if A is prime and return 0 if not.
   * 
   * Note :
   * The value of A can cross the range of Integer.
   */

  // Approach I:
  /**
   * First of all you have to find the number of factors
   * So by the definetion we know If then number of factors for
   * given number is greater than 2 than the number is not prime
   * 
   * @param A
   * @return
   */
  public static boolean checkPrime(int A) {
    int numFact = countApp2(A);
    return numFact > 2 ? false : true; // this is the ternary operator.
  }

  /**
   * Problem Description
   * You are given an integer A. You have to tell whether it is a perfect number
   * or not.
   * 
   * Perfect number is a positive integer which is equal to the sum of its proper
   * positive divisors.
   * 
   * A proper divisor of a natural number is the divisor that is strictly less
   * than the number.
   * Example Explanation
   * Explanation 1:
   * 
   * For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
   * Explanation 2:
   * 
   * For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
   */
  public static boolean checkProperSum(int A) {
    int sum = 0;
    for (int i = 1; i < A; i++) {
      if (A % i == 0) {
        sum += i;
      }
    }
    return sum == A ? true : false;
  }

  /**
   * Problem Description
   * You will be given an integer n. You need to return the count of prime numbers
   * less than or equal to n.
   */

  public static int countAllPrime(int A) {
    int count = 0;
    for (int i = 2; i <= A; i++) {
      boolean checker = checkPrime(i);
      if (checker)
        count++;
    }
    return count;
  }
}
