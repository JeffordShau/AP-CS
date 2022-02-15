/*
TNPG: LJ (Lawrence Joa, Jefford Shau)
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr + class time
*/

public class Driver {

  /*
  Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
  */
  public static int factorial(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  /*
  We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  */
  public static int bunnyEars(int bunnies) {

    if (bunnies == 0) {
      return 0;
    }
    return 2 + bunnyEars(bunnies - 1);
  }

  /*
  The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
  */
  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    return fibonacci(n - 2) + fibonacci(n - 1);
  }

  /*
  We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
  */
  public static int bunnyEars2(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    else if (bunnies % 2 == 1) {
      return 2 + bunnyEars2(bunnies - 1);
    }
    else if (bunnies % 2 == 0) {
      return 3 + bunnyEars2(bunnies - 1);
    }
    return bunnyEars2(bunnies);
  }

  /*
  We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
  */
  public static int triangle(int rows) {
    if (rows == 0) {
      return 0;
    }
    return rows + triangle(rows - 1);
  }

  /*
  Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
  */
  public static int sumDigits(int n) {
    if (n < 10) {
      return n;
    }
    return (n % 10) + sumDigits(n / 10);
  }

  /*
  Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
  */
  public static int count7(int n) {
    if (n == 0) {
    return 0;
    }
    else if(n % 10 == 7) {
      return 1 + count7(n / 10);
    }
    return count7(n / 10);
  }

  /*
  Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
  */
  public static int count8(int n) {
    if (n == 0){
      return 0;
    }
    else if (n % 10 == 8){
      if (n / 10 % 10 == 8){
        return 2 + count8(n / 10);
      }
      return 1 + count8(n / 10);
    }
    return count8(n / 10);
  }

  /*
  Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  */
  public static int powerN(int base, int n) {
    if (n == 0) {
      return 1;
    }
    return base * powerN(base, n - 1);
  }

  /*
  Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
  */
  public static int countX(String str) {
    if (str.length() == 0) {
      return 0;
    }
    else if (str.substring(0, 1).equals("x")) {
      return 1 + countX(str.substring(1));
    }
    return countX(str.substring(1));
  }

  /*
  Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
  */
  public static int countHi(String str) {
    if (str.length() < 2) {
      return 0;
    }
    else if (str.substring(0, 2).equals("hi")) {
      return 1 + countHi(str.substring(2));
    }
    return countHi(str.substring(1));
  }

  /*
  Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
  */
  public static String changeXY(String str) {
    if (str.length() == 0) {
      return "";
    }
    else if (str.substring(0, 1).equals("x")) {
      return "y" + changeXY(str.substring(1));
    }
    return str.substring(0, 1) + changeXY(str.substring(1));
  }


  public static void main(String[] args) {
    System.out.println("factorial");
    System.out.println(factorial(0));
    System.out.println(factorial(1));
    System.out.println(factorial(2));
    System.out.println(factorial(3));
    System.out.println(factorial(4));
    System.out.println("\n");

    System.out.println("bunnyEars");
    System.out.println(bunnyEars(0));
    System.out.println(bunnyEars(1));
    System.out.println(bunnyEars(2));
    System.out.println(bunnyEars(3));
    System.out.println("\n");

    System.out.println("fibonacci");
    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(2));
    System.out.println(fibonacci(3));
    System.out.println(fibonacci(4));
    System.out.println(fibonacci(5));
    System.out.println("\n");

    System.out.println("bunnyEars2");
    System.out.println(bunnyEars2(0));
    System.out.println(bunnyEars2(1));
    System.out.println(bunnyEars2(2));
    System.out.println(bunnyEars2(3));
    System.out.println(bunnyEars2(4));
    System.out.println("\n");

    System.out.println("triangle");
    System.out.println(triangle(0));
    System.out.println(triangle(1));
    System.out.println(triangle(2));
    System.out.println(triangle(3));
    System.out.println(triangle(4));
    System.out.println("\n");

    System.out.println("sumDigits");
    System.out.println(sumDigits(0));
    System.out.println(sumDigits(9));
    System.out.println(sumDigits(12));
    System.out.println(sumDigits(46));
    System.out.println(sumDigits(129));
    System.out.println("\n");

    System.out.println("count7");
    System.out.println(count7(123));
    System.out.println(count7(717));
    System.out.println(count7(77124));
    System.out.println(count7(7));
    System.out.println(count7(99999));
    System.out.println("\n");

    System.out.println("count8");
    System.out.println(count8(0));
    System.out.println(count8(8));
    System.out.println(count8(818));
    System.out.println(count8(8818));
    System.out.println(count8(23884));
    System.out.println("\n");

    System.out.println("powerN");
    System.out.println(powerN(3, 1));
    System.out.println(powerN(3, 2));
    System.out.println(powerN(3, 3));
    System.out.println(powerN(10, 4));
    System.out.println(powerN(5, 6));
    System.out.println("\n");

    System.out.println("countX");
    System.out.println(countX("xxhuxx"));
    System.out.println(countX("xhixhix"));
    System.out.println(countX("hi"));
    System.out.println(countX("x"));
    System.out.println(countX(""));
    System.out.println("\n");

    System.out.println("changeXY");
    System.out.println(changeXY("codey"));
    System.out.println(changeXY("yyhiyy"));
    System.out.println(changeXY("hyiyhiy"));
    System.out.println(changeXY("yyhxyihx"));
    System.out.println(changeXY(""));
    System.out.println("\n");
  }

}
