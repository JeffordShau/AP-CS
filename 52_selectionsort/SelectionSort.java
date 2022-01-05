//
// APCS pd0
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent:  hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 *  Search through the array linearly for the greatest value and note its index. Swap the greatest value in its index with the value in the greatest index of the unsorted array. Continue this process until (total elements - 1) passes has occurred. The array should be sorted.
 * DISCO: 
 *  0. The code for moving the minVal and maxVal is very similar.
 * QCC:
 *  0. Does bubble sort and selection sort require the same number of passes?
 * q0: How many passes to sort n elements?
 * a0: At most, n - 1 passes are needed to sort n elements.
 * q1: What do you know after pass p?
 * a1: After pass p, the first or last p elements are sorted.
 * q2: How do you know if sorted?
 * a2: We know the list is sorted after n - 1 passes.
 * q3: What does a pass boil down to?
 * a3: A pass is essentially 1 swap in selection sort.
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)

    for( int pass = data.size() - 1; pass > 0 ; pass-- ) {
      System.out.println( "\nbegin pass " + (data.size() - pass) ); //pass counter
      int maxPos = pass;
      for( int i = 0; i < pass; i++ ) {
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }
      System.out.println( "maxPos: " + maxPos );
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
      System.out.println( data );


      System.out.println( "after swap: " +  data );
    }
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
    /*===============for VOID methods=============

      ============================================*/

    ArrayList glem = new ArrayList<Integer>();
    glem.add(7);
    glem.add(1);
    glem.add(5);
    glem.add(12);
    glem.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glem );
    selectionSortV(glem);
    System.out.println( "ArrayList glen after sorting:\n" + glem );
    ArrayList coconut = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coconut before sorting:\n" + coconut );
    selectionSortV(coconut);
    System.out.println( "ArrayList coconut after sorting:\n" + coconut );

    ArrayList cocobread = populate( 10, 1, 1000 );
    System.out.println( "ArrayList cocobread before sorting:\n" + cocobread );
    ArrayList cocoSorted = selectionSort( cocobread );
    System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
    System.out.println( "ArrayList cocobread before sorting:\n" + cocobread );


  }//end main

}//end class SelectionSort
