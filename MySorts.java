// JW (Jefford Shau, William Vongphanith)
// APCS
// HW54 -- One File to Birng Them All...
// 2022-01-11
// time spent: 0.5 hr

import java.util.ArrayList;

public class MySorts {
    /*
    0. Start at the end of the array.
    1. Iterate through the array from right to left, comparing the values of two adjacent elements each time.
    2. If the rightmost element on each compare is less than the leftmost element, swap the position of the two elements and add 1 to the swapsPerPass counter. If not, continue down the array.
    3. After iterating through the array once, if the swapsPerPass counter equals zero, break out of the loop.
    4. Repeat step 2 and 3 (length of the array - 2) times.
    */
    public static void bubbleSort ( ArrayList<Comparable> data ) {
        int swapsPerPass = 0;
        for (int i = 0; i < data.size() - 1; i++) {
          for (int j = data.size() - 1; j > i; j--) {
            swapsPerPass = 0;
            if (data.get(j).compareTo(data.get(j-1)) < 0) {
              Comparable temp = data.get(j);
              data.set(j, data.get(j-1));
              swapsPerPass += 1;
              data.set(j-1, temp);
            }
          }
          if (swapsPerPass == 0) {
            break;
          }
        }
      }
    }

    /*
    0. Start at the beginning of the array.
    1. Iterate through the array from left to right, comparing the value at the index and the value stored in the maxPos counter.
    2. If the value at the index is greater than the value stored in the maxPos counter, replace maxPos with the index. If not, continue down the array.
    3. After iterating through the array once, swap the position of the maxPos and the least unsorted index (represented by pass variable)
    4. Repeat step 2 and 3 (length of the array - 2) times.
    */
    public static void selectionSort(ArrayList<Comparable> data) {
        for( int pass = data.size() - 1; pass > 0 ; pass-- ) {
        int maxPos = pass;
        for( int i = 0; i < pass; i++ ) {
          if (data.get(i).compareTo(data.get(maxPos)) > 0) {
            maxPos = i;
          }
        }
        Comparable temp = data.get(pass);
        data.set(pass, data.get(maxPos));
        data.set(maxPos, temp);
      }
    }

    /*
    0. Separate the array into two partitions, a sorted left region and an unsorted right region.
    1. Start at the beginning of the array.
    2. Place the leftmost value in the unsorted region into the sorted region.
    3. Iterate through the sorted from right to left, comparing the values of two adjacent elements each time.
    2. Move the new value in the sorted region in place by comparing it with values on its left side and swapping with them adjacently.
    4. Repeat step 2 and 3 (length of the array - 1) times, but each time move the partition divider over 1 element to the right. 
    */
    public static void insertionSort( ArrayList<Comparable> data )
    {
        for( int partition = 1; partition < data.size(); partition++ ) {
          for( int i = partition; i > 0; i-- ) {
            if ( (data.get(i)).compareTo(data.get(i - 1)) < 0 ) {
              Comparable temp = data.get(i);
              data.set( i, data.get(i - 1));
              data.set( i - 1, temp);
            }
            else
              break;
            }
          }
        }
      }
