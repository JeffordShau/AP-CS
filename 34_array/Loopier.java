/*
(Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW34 -- A Pirate's Life for Me
2021-11-12
*/

/*
DISCO:
  0.
QCC:
  0.
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

  public static int linSearchR(int[] a, int target) {
    int idx = a.length;
    if (a[0] == target) {
      return idx;
    }
    else if (a.length == 1) {
      return -1;
    }
    else {
      idx -= 1;
      a = Arrays.copyOf(a, a.length - 1);
      return linSearchR(a, target);
    }
  }

  public static int freq(int[] a, int target) {
    int counter = 0;
    for(int i = 0; i < a.length; i ++) {
      if (a[i] == target) {
        counter += 1;
      }
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
    System.out.println(linSearch(linSearch1, 7));
    // System.out.println(linSearchR(linSearch1, 7));

    //test freq methods
    int[] freq1 = {1, 1, 5, 6, 8, 9, 9, 1, 9, 6, 1, 1, 10};
    System.out.println(freq(freq1, 9));
    System.out.println(freq(freq1, 1));

  }


}



/*

Two public, static implementations of a linear search function that will return the index of the first occurrence of a target in an existing array, or -1 if not found. (First version iterates, second recurses.)

 int linSearch( int[] a, int target )
 int linSearchR( int[] a, int target )
Two public, static implementations of a frequency function that will return the number of occurrences of a target in an existing array. (First version iterates, second recurses.)

 int freq( int[] a, int target )
 int freqRec( int[] a, int target )
 */
