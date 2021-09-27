// Exercise 8 from Chapter 6

public class ack{

  public static void main(String[] args){
    int m = 3;
    int n = 3;
    System.out.println(A(m, n));
  }

  public static int A(int m, int n){
    if (m == 0){
      return (n + 1);
    }
    else if (m > 0 && n > 0){
      return A(m - 1, A(m, n - 1));
    }
    else if (m > 0 && n == 0){
      return A(m - 1, 1);
    }
    else {
      return 0;
    }
  }
}
