// Exercise 2 from Chapter 6
public class Methods{

    public static void main(String[] args){
      int n = 28;
      int m = 5;
      Division(n, m);
    }
    public static void Division(int n, int m){
      if (n % m == 0){
        System.out.println(true);
      } else {
        System.out.println(false);
      }
    }
}
