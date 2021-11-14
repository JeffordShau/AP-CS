/*
(Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW34 -- A Pirate's Life for Me
2021-11-12
time spent: 0.5 hr
*/

/*
DISCO:
  0. We implemented our own slice method to return an array with 1 less element.
QCC:
  0. How can you implement a counter to a recursive method without adding it to the arguments?
  1. How can you track the index of the target(s) without a counter for recursive methods? 
*/

import java.util.Arrays;

public class Loopier {

  public static int[] init(int[] array) {
    for(int i = 0; i < array.length; i ++) {
      array[i] = (int)(Math.random() * 64920);
    }
    return array;
  }

  public static String toString(int[] array) {
    String arrayString = "[";
    for(int i = 0; i < array.length; i++) {
      arrayString += array[i];
      if (i != array.length - 1) {
        arrayString += ", ";
      }
    }
    return arrayString + "]";
  }

  public static int linSearch(int[] a, int target) {
    for(int i = 0; i < a.length; i ++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int linSearchR(int[] a, int target, int counter) {
    if (a[0] == target) {
      return counter;
    }
    else if (a.length == 1) {
      return -1;
    }
    else {
      counter += 1;
      a = Sliceby1(a);
      return linSearchR(a, target, counter);
    }
  }

  public static int[] Sliceby1(int[] a) {
    int[] sliced = new int[a.length - 1];
    for(int i = 1; i < a.length; i++) {
      sliced[i - 1] = a[i];
    }
    return sliced;
  }

  // public static

  public static int freq(int[] a, int target) {
    int counter = 0;
    for(int i = 0; i < a.length; i ++) {
      if (a[i] == target) {
        counter += 1;
      }
    }
    return counter;
  }

  public static int freqRec(int[] a, int target, int counter) {
    if (a[0] == target) {
      counter += 1;
    }
    if (a.length != 1) {
      a = Sliceby1(a);
      return freqRec(a, target, counter);
    }
    return counter;
  }



  public static void main(String[] args) {
    //test init and toString method
    int[] init1 = new int[3];
    System.out.println("init1 = " + toString(init(init1)));
    int[] init2 = new int[4];
    System.out.println("init1 = " + toString(init(init2)));
    int[] init3 = new int[5];
    System.out.println("init1 = " + toString(init(init3)));

    //test linSearch methods
    int[] linSearch1 = {1, 3, 5, 7, 9};
    System.out.println("Linear Search Iteration");
    System.out.println(linSearch(linSearch1, 7));
    System.out.println("Linear Search Recursion");
    System.out.println(linSearchR(linSearch1, 7, 0));

    //test freq methods
    int[] freq1 = {1, 1, 5, 6, 8, 9, 9, 1, 9, 6, 6, 6, 1, 1, 10};
    System.out.println("Frequency Iteration");
    System.out.println(freq(freq1, 6));
    System.out.println(freq(freq1, 5));
    System.out.println("Frequency Recursion");
    System.out.println(freqRec(freq1, 6, 0));
    System.out.println(freqRec(freq1, 5, 0));
  }
}
