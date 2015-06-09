public class test {
  public static void main(String[] a) {
    int primes=0;
    for (int i=0; primes<=10001; i++) {
      boolean isPrime=true;
      for (int j=2; j<=i/2 && isPrime; j++) {
        if (i%j==0) isPrime=false;
      }
      if (isPrime) primes++;
      if (primes==10001) System.out.println(i);
    }
  }
}
