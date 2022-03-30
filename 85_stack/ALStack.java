/***
 * class Latkes
 * v1
 * Implements a stack of Strings using an encapsulated array
 **/

 import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>
{
  private ArrayList<PANCAKE> _stack;
  private int _stackSize;


  //constructor
  public ALStack(  )
  {
    _stack = new ArrayList();
    _stackSize = 0;
  }


  //means of insertion
  public void push( PANCAKE s )
  {
    _stack.add(s);
    _stackSize++;
  }


  //means of removal
  public PANCAKE pop()
  {
    if ( isEmpty() )  return null;
    return _stack.remove(_stackSize---1);
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
    return _stackSize == 0;
  }

}
