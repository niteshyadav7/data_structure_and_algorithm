public class Main {

  public static int countFactors(int A) {
    // brute force :iterate till A if(A%i) then cnt++;O(N)
    // optimize:iterate till sqrt(A) then if(i!=A/i)cnt+=2 else if(i!=A/i)cnt+=1
    int counter = 0;
    int i = 1;
    while (i * i <= A) {
      if (A % i == 0) {
        // System.out.println(i+"*"+A/i);
        if (i != A / i) {
          counter += 2;
        } else {
          counter++;
        }
      }
      i++;
    }
    return counter;
  }

  public static int factorsSum(int A) {
    int sum = 0;
    int i = 1;
    while (i * i <= A) {
      if (A % i == 0) {
        // System.out.println(i + " " + A / i);
        int j=A/i;
        if(i!=j){
          sum+=i+j;
        }else{
          sum+=i;
        }
      }
      i++;
    }
    return sum-A;
  }

  public static boolean isPrimeChecker(int A) {
    // prime means if(factors are !more than 2).
    int factors = countFactors(A);
    return factors == 2 ? true : false;
  }

  public static void main(String[] args) {
    // System.out.println(countFactors(24));
    // System.out.println(isPrimeChecker(14));
    System.out.println(factorsSum(4));
  }
}