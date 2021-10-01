/*
Jefford Shau
APCS
HW05 -- Understanding the Summer Pre-work
2021-09-27
*/

// Exercise 3 of Chapter 3

public class TimeConversion{

      public static void main(String[] args){
          int TotalNumberOfSeconds = 9065;
          int seconds = 9065 % 60;
          int minutes = 9065 / 60 % 60;
          int hours = 9065 / 60 / 60 % 24;

          System.out.print(TotalNumberOfSeconds + "seconds = ");
          System.out.print(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
      }
}
