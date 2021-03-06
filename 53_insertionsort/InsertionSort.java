// JW? (Jefford Shau, William Vongphanith)
// APCS pd0
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent: 0.5 hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 *  Partition the list into sorted and unsorted regions. Move next element from the unsorted region to its position in the sorted region by swapping adjacent values. Increase the size of the sorted partition by 1. Repeat until sorted.
 * DISCO
 *  0. The concept of this sorting algorithm was easier than the selectionSort algorithm. 
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n - 1 passes are necessary to sort n elements.
 * q1: What do you know after pass p?
 * a1: After pass p, the first p +_1 elements are sorted.
 * q2: How will you know when sorted?
 * a2: We will know the list is sorted after n - 1 passes.
 * q3: What constitues a pass?
 * a3: A pass is when an element in the unsorted region is placed in ascending order in the sorted region.
 * q4: What must you track?
 * a4: We must track the number of passes and the element that was swapped for each pass.
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for( int partition = 1; partition < data.size(); partition++ ) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( (data.get(i)).compareTo(data.get(i - 1)) < 0 ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable temp = data.get(i);
          data.set( i, data.get(i - 1));
          data.set( i - 1, temp);
          System.out.println( "after swap" + data);
        }
        else
          break;
      }
    }
  }//end insertionSortV


  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort


  public static void main( String [] args )
  {
      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );


      System.out.println( "*** Testing non-void version... *** " );
      ArrayList glem = new ArrayList<Integer>();
      glem.add(7);
      glem.add(1);
      glem.add(5);
      glem.add(12);
      glem.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glem );
      ArrayList glenSorted = insertionSort( glem );
      System.out.println( "\nsorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "\nArrayList glen after sorting:\n" + glem );

      ArrayList coconut = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coconut );
      ArrayList coconutSorted = insertionSort( coconut );
      System.out.println( "\nsorted version of ArrayList coco:\n"
      + coconutSorted );
      System.out.println( "\nArrayList coco after sorting:\n" + coconut );
      /*==========for AL-returning methods==========

      ============================================*/

  }//end main

}//end class InsertionSort
