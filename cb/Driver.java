public class Driver {
  public static int factorial(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    return n * factorial(n-1);
  }

  public static int bunnyEars(int bunnies) {

    if (bunnies == 0) {
      return 0;
    }
    return 2 + bunnyEars(bunnies - 1);
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    return fibonacci(n - 2) + fibonacci(n - 1);
  }

  public static int bunnyEars2(int bunnies) {
  if (bunnies > 1 && bunnies == )
}


  public static void main(String[] args) {
    System.out.println(factorial(7));
    System.out.println(factorial(0));
    System.out.println(factorial(1));

    System.out.println(bunnyEars(7));
    System.out.println(bunnyEars(0));
    System.out.println(bunnyEars(1));

    System.out.println(fibonacci(4));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(0));


  }

}
