/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LLStack<PANCAKE> implements Stack<PANCAKE> //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LLStack( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public void push( PANCAKE newVal )
  {
    LLNode<PANCAKE> tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
  }

  public PANCAKE pop(  )
  {
    if (isEmpty()) return null;
    PANCAKE retVal;
    retVal = _head.getCargo();
    _head = _head.getNext();
    return retVal;
  }

  //look at top of stack
  public PANCAKE peekTop()
  {
    if ( isEmpty() )  return null;
    return _stack.get(_stackSize-1);
  }


  //chk for emptiness
  public boolean isEmpty()
  {
    return _size == 0;
  }


  private class LLNode<PANCAKE>
{
  //instance vars
  private String _cargo;
  private LLNode<PANCAKE> _nextNode;

  // constructor
  public LLNode( PANCAKE value, LLNode next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public PANCAKE getCargo()
  {
    return _cargo;
  }

  public LLNode getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public PANCAKE setCargo( PANCAKE newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo;
  }
}

}
