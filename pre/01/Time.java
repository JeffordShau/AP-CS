/*
Jefford Shau
APCS
HW05 -- Understanding the Summer Pre-work
2021-09-27
*/

// Exercise 2 of Chapter 2

public class Time{

      public static void main(String[] args){
          int hour = 22;
          int minute = 54;
          int second = 03;
          int TotalSecInDay = 86400;
          int SecPassedInDay = (hour * 60 + minute) * 60 + second;

          System.out.print("Number of seconds since midnight: ");
          System.out.print(SecPassedInDay + "\n");
          System.out.print(TotalSecInDay - SecPassedInDay + "\n");
          System.out.print((float) SecPassedInDay / (float) TotalSecInDay + "\n");

          hour = 23;
          minute = 01;
          second = 41;
          int SecPassedInDay2 = (hour * 60 + minute) * 60 + second;

          System.out.print("Number of seconds passed: ");
          System.out.print(SecPassedInDay2 - SecPassedInDay);

      }
}
