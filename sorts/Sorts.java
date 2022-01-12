import java.util.ArrayList;

public class Sorts {

    public static void insertionSortV( ArrayList<Comparable> data )
    {
        int partition = 0;
        int insertionSwap = 0;
        for( int i = 1; i < data.size(); i++ ) {
            partition = i;
            for( int j = i; j > 0; j-- ) {
                if ( data.get( j ).compareTo( data.get( j-1 ) ) < 0 )
                    {
                    data.set( j, data.set( j-1, data.get( j ) ) );
                    insertionSwap += 1;
                  }
                else
                    break;
            }
        }
        System.out.println("Total Swaps: " + insertionSwap);
    }

    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input )
    {
        ArrayList<Comparable> data = new ArrayList<Comparable>();
        for( Comparable o : input )
            data.add( o );
        insertionSortV( data );
        return data;
    }

    public static void selectionSortV(ArrayList<Comparable> a) {
        int minIndex;
        int selectionSwap = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).compareTo(a.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = a.get(i);
            a.set(i, a.get(minIndex));
            a.set(minIndex, temp);
            selectionSwap += 1;
        }
        System.out.println("Total Swaps: " + selectionSwap);
    }

    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
    {
        ArrayList<Comparable> data = new ArrayList<Comparable>();
        for( Comparable o : input )
            data.add( o );
        selectionSortV( data );
        return data;
    }

    public static ArrayList<Comparable> bubbleSort ( ArrayList<Comparable> data ) {
        int bubbleSwap = 0;
        for( int i = 0; i < data.size(); i++ ) {
            for( int j = 0; j < data.size()-1-i; j++ ) {
                if( data.get(j).compareTo(data.get(j+1)) > 0 ) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                    bubbleSwap += 1;
                }
            }
        }
        System.out.println("Total Swaps: " + bubbleSwap);
        return data;
    }
}
