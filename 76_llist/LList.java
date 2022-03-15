//(P)BNJ -- Brian Li, Jefford Shau, Nakib Abedin
//APCS pd07
//HW76 - We Got a Little Ol' Convoy
//2022-03-14w
//time spent: 0.5 hr + class time
//KtS consumed: 2 sheets

/*
DISCO
- We can have an LLNode whose cargo and nextNode are null, but the LLNode will not be null itself.
QCC
- Is there a better way of doing size() so that it isn't O(n)?
*/

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new LLNode(null, null);
    _size = size();
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode temp = _head;
    // if empty node, place newVal in Cargo
    if (temp.getCargo() == null)
    {
      temp.setCargo(newVal);
    }
    // add newVal to end of list of nodes
    else {
      for (int i = 1; i < size(); i++)
      {
        temp = temp.getNext();
      }
      temp.setNext(new LLNode(newVal, null));
    }
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;
    for (int i = 0; i < index; i++)
    {
      temp = temp.getNext();
    }
    return temp.getCargo();
  }


  public String set( int index, String newVal )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;
    for (int i = 0; i < index; i++)
    {
      temp = temp.getNext();
    }
    return temp.setCargo(newVal);
  }



  //return number of nodes in list
  public int size()
  {
    LLNode temp = _head;
    int counter = 0;
    while (_head.getCargo() != null)
    {
      counter += 1;
      if (temp.getNext() != null)
      {
        temp = temp.getNext();
      }
      else
      {
        break;
      }
    }
    return counter;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String output = "";
    LLNode toString = _head;
    if (toString == null) {
      return "null";
    }
    for (int i = 0; i < size() && _head != null; i++){ // an empty node doesnt count
      output += toString.getCargo() + ", ";
      toString = toString.getNext();
    }
    output += "null";
    return output;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println( "2nd item is: " + james.get(1) );
    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
