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
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

public interface List
{
  //add node to list, containing input String as its data
  public boolean add( String x );

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

}//end interface
