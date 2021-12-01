/*
JWJ (Jefford Shau, Jacob Kirmayer, William Vongphanith)
APCS
HW40 -- Demand A Raise
2021-11-29
time spent: 0.5 hr
*/

/*
DISCO:
  0. Successfully incorporated for and foreach loop to print and sum methods.
QCC:
  0. How would you add the brackets surrounding the 2D int array to the print methods? 
  */

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    String StringArray = "";
    for(int rows = 0; rows < a.length; rows++) {
      StringArray += "[";
      for (int idx = 0; idx < a[rows].length; idx++) {
        StringArray += a[rows][idx] + ", ";
      }
      StringArray = StringArray.substring(0, StringArray.length() - 2);
      if (rows == a.length - 1) {
        StringArray += "]";
      } else {
        StringArray += "]\n";
      }
    }
    System.out.println(StringArray);
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] subarray: a){
      String totalArray = "[";
    	for (int elements:subarray){
    		totalArray += elements + ", ";
    	}
      totalArray = totalArray.substring(0, totalArray.length() - 2);
      totalArray += "]";
    	System.out.println(totalArray);
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int totalSum = 0;
    for(int[] rows:a) {
      for(int elements:rows) {
        totalSum += elements;
      }
    }
    return totalSum;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int totalSum = 0;
    for(int rows = 0; rows < m.length; rows++) {
      totalSum += sumRow(rows, m);
    }
    return totalSum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int rSum = 0;
    for(int idx = 0; idx < a[r].length; idx++) {
      rSum += a[r][idx];
    }
    return rSum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for(int idx:m[r]) {
      summer += idx;
    }
    return summer;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray

