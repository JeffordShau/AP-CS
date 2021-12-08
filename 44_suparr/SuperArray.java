/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW44 -- Array of Grade 316
2021-12-07
*/

/*
DISCO:
  0. For the add, add-to-index, remove methods, I used a temporary array to change the main array.
QCC:
  0. Is there a way to avoid using a second array, by only using the main array, to change the size of the array?
*/

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying ("encapsulated") container
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
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
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


  //adds an item after the last item
  public void add( int newVal )
  {
    _size += 1;
    int[] temp = new int[_size];
    for(int idx = 0; idx < _data.length; idx++) {
      temp[idx] = _data[idx];
    }
    temp[_size - 1] = newVal;
    _data = temp;
  }


  //inserts an item at index
  public void add( int index, int newVal )
  {
    _size += 1;
    int[] temp = new int[_size + 1];
    for(int idx = 0; idx < index; idx++) {
      temp[idx] = _data[idx];
    }
    for(int idx = index + 1; idx < _data.length; idx++) {
      temp[idx + 1] = _data[idx];
    }
    temp[index] = newVal;
    _data = temp;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index) {
    _size -= 1;
    int[] temp = new int[_size];
    for(int idx = 0; idx < index; idx++) {
      temp[idx] = _data[idx];
    }
    for(int idx = index; idx < _size; idx++) {
      temp[idx] = _data[idx + 1];
    }
    _data = temp;

  }


  //return number of meaningful items in _data
  public int size()
  {
    int count = 0;
    for(int idx = 0; idx < _data.length; idx++) {
      if (_data[idx] != 0) {
        count += 1;
      }
    }
    return count;
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
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }
      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);
      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);
      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
