/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW45 -- Array of Titanium
2021-12-08
*/

/*
DISCO:
  0. For the add and add-at-index methods, we changed the return type to boolean.
  1. We changed the code for add, add-at-index, and remove methods to avoid using temporary arrays.
QCC:
  0. Can you implement other methods in the SuperArray class outside the abstract methods in the Interface List?
*/


public interface ListInt{
  public boolean add( int newVal ); // return true
  public boolean add( int index, int newVal ); // returns true unless index out of _size
  public int get(int index); // returns index value
  public int set(int index, int x); // return old value at index
  public int size(); // return _size
  public int remove( int index); // returns value removed
}
