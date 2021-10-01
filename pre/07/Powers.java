/*
Jefford Shau
APCS
HW05 -- Understanding the Summer Pre-work
2021-09-27
*/

// Exercises 1, 4, 5 from Chapter 8

import java.util.Arrays;
import java.util.Random;

public class Powers{

  public static void main(String[] args){
    double[] values = new double[] {3, 4, 5, 6};
    double[] newArray = Arrays.copyOf(values, 4);
    System.out.println(powArray(newArray, 2));
    System.out.println(histogram(100));
  }

// Exercise 1
  public static String powArray(double[] a, int power){
    for (int i = 0; i < a.length; i++){
      a[i] = Math.pow(a[i], power);
    }
    return Arrays.toString(a);
  }

  public static int inRange(int[] masterlist, int low, int high){
    int count = 0;
    for (int i = 0; i < masterlist.length; i++){
      if (masterlist[i] > low && masterlist[i] < high) {
        count ++;
      }
    }
  }

  public static int[] histogram(int counter){
    Random random = new Random();
    int[] masterlist = new int[counter];
    for (int i = 0; i < masterlist.length; i++){
      masterlist[i] = random.nextInt(100);
    }
    for (int i = 0; i < masterlist.length; i++){
      masterlist[i] = inRange(, i, i + 1);
    }

  }

}
