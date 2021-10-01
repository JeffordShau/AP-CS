/*
Jefford Shau
APCS
HW05 -- Understanding the Summer Pre-work
2021-09-27
*/

// Exercise 3 from Chapter 6

public class isTriangle{

  public static void main(String[] args){
    int stick1 = 2;
    int stick2 = 3;
    int stick3 = 2;
    triangleCalculator(stick1, stick2, stick3);
  }
  public static void triangleCalculator(int stick1, int stick2, int stick3){
    if ((stick1 + stick2 > stick3) && (stick1 + stick3 > stick2) && (stick2 + stick3 > stick1)){
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
