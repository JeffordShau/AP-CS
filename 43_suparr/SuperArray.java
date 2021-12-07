/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW34 -- Array of Steel
2021-12-06
*/

/*
DISCO:
  0.The two declared variables _data and _size made writing the code for all of the methods very easy.
QCC:
  0. Is the get method really necessary?
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 10;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String output = "[";
    for(int idx = 0; idx < _data.length; idx++) {
      output += _data[idx] + ", ";
    }
    output = output.substring(0, output.length() - 2);
    output += "]";
    return output;
  }


  //double capacity of SuperArray
  private void expand()
  {
    _size *= 2;
    int[] expandedArr = new int[_size];
    for(int idx = 0; idx < _data.length; idx++) {
      expandedArr[idx] = _data[idx];
    }
    _data = expandedArr;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = this.get(index); 
    _data[index] = newVal;
    return temp;
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
