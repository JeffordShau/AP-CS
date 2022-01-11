// JW (Jefford Shau, William Vongphanith)
// APCS
// HW54 -- One File to Birng Them All...
// 2022-01-11
// time spent: 0.5 hr

import java.util.ArrayList;

public class MySorts {
    public static void insertionSort( ArrayList<Comparable> a )
    {
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for( Comparable o : a )
            sorted.add( o );
        for( int i = 1; i < sorted.size(); i++ ) {
            for( int j = i; j > 0; j-- ) {
                if ( sorted.get( j ).compareTo( sorted.get( j-1 ) ) < 0 )
                    sorted.set( j, sorted.set( j-1, sorted.get( j ) ) );
                else
                    break;
            }
        }
    }

    public static void selectionSort(ArrayList<Comparable> a) {
        int minIndex;
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for( Comparable o : a )
            sorted.add( o );
        for (int i = 0; i < sorted.size() - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(j).compareTo(sorted.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = sorted.get(i);
            sorted.set(i, a.get(minIndex));
            sorted.set(minIndex, temp);
        }
    }

    public static void bubbleSort ( ArrayList<Comparable> data ) {
        for( int i = 0; i < data.size(); i++ ) {
            for( int j = 0; j < data.size()-1-i; j++ ) {
                if( data.get(j).compareTo(data.get(j+1)) > 0 ) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                }
            }
        }
    }

}
