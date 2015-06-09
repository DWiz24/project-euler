public class test {
  public static void main(String[] a) {
    int evens=0;
    int prev=1;
    int past2=0;
    while (prev+past2<=4000000) {
      if ((prev+past2)%2==0) evens += prev+past2;
      int t=past2+prev;
      past2=prev;
      prev=t;
    }
    System.out.println(evens);
  }
}
