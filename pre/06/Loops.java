/*
Jefford Shau
APCS
HW05 -- Understanding the Summer Pre-work
2021-09-27
*/

// Exercises 3, 4, 5 from Chapter 7

public class Loops{

  public static void main(String[] args){
    System.out.println(Power(1.5, 4));
    System.out.println(Factorial(7));
    System.out.println(myexp(3, 1));
    double checkValue = 0.1;
    int checkTerms = 1;
    while (checkTerms != 5){
      System.out.println(check(checkValue));
      checkValue = checkValue * 10;
      checkTerms ++;
    }
    checkValue = -0.1;
    checkTerms = 1;
    while (checkTerms != 5){
      System.out.println(check(checkValue));
      checkValue = checkValue * 10;
      checkTerms ++;
      // Not accurate at all, myexp returns a negative value while Math.pow returns a positive value
    }
  }

// Exercise 3
  public static double Power(double x, int n){
    double product = x;
    while (n > 0){
      product = product * x;
      n --;
    }
    return product;
  }

// Exercise 4
  public static double Factorial(int num){
    double product = 1;
    while (num > 1){
      product = product * num;
      num --;
    }
    return product;
  }

// Exercise 5
  public static double myexp(double x, int n){
    double sum = 1;
    double record = 1;
    double counting = 1;
    while (counting != n){
      record = record * (x/counting);
      sum += record;
      counting ++;
    }
    return sum;
  }

  public static String check(double x){
    return (x + "\t" + myexp(x, 18) + "\t" + Math.exp(x));
  }
}
