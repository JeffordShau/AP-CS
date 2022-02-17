/*
Pumpkin (Jefford Shau, Jonathan Song, Anthony Sun)
APCS
HW65 -- nqueens
2022-02-16
time spent: 1 hr
*/

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve()
  {
    if ( solveH(0) ) {
      printSolution();
      return true;
    } else {
      _board = new int[_board.length][_board.length];
      printSolution();
      return false;
    }
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col ) // col range = [0,7]
  {
    // if placing queens in all columsn on the board are successful, return true
    if (col >= _board.length) {return true;}

  for (int row = 0; row < _board.length; row++) {
    // iterates through the column col to place a Queen
    if (addQueen( row, col )) {
      // if placing Queen successful, try placing another Queen on col + 1. If successful, return true. Keeps recursive call until the column col exceeds the board length.
      if (solveH( col + 1 )) {return true;}
      // if unable to place a Queen in column col + 1, backtrack by removing the Queen in the previous column and continue interating through the rest of the column.
      else {removeQueen( row, col );}
    }
  }
  return false;

  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */

    String s ="\n";

    for (int yCor = 0; yCor < _board.length; yCor++) {
      s+= "|";
      for (int xCor = 0; xCor < _board[yCor].length; xCor++) {
        if (_board[yCor][xCor] <=0) {s+="_|";}
        else {s+="Q|";}
      }
      s+="\n";
    }
    System.out.println(s);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * Places a Queen as an empty pattern on the board.
     Places markers (marked by -1) that declares certain
     positions off limits. Places markets only right of
     the Queen, the left side is ignored. Used to place
     Queens column by column from left to right.
   * precondition:  _board exists; the coordinate of the
                    position given is a valid position on
                    the board.
   * postcondition: A queen is placed on the coordinates
                    provided; the horizontal and
                    diagonal lines to the right of the
                    Queen are marked as off limits for
                    future Queen placements.
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * Lifts the Queen (marked by 1) from the board. Removes
     the markers (marked by -1) that declare certain
     positions off limits. Removes markers only to the
     right of the Queen, and the left side is ignored.
   * precondition:  _board exists; a Queen has been placed
                    on the board already; the coordinates
                    provided designate a valid position
                    on the board.
   * postcondition: A Queen is removed from the board; all
                    markers the Queen leaves from addQueen()
                    are removed.
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * prints board in a readable format
   * precondition: _board exists
   * postcondition: prints string representation of _board
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(8);
    b.printSolution();
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    b.printSolution();
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    b.printSolution();
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */
    b.removeQueen(0, 1);
    b.solve();

    QueenBoard c = new QueenBoard(3);
    c.solve();

    QueenBoard d = new QueenBoard(4);
    d.solve();

    QueenBoard e = new QueenBoard(5);
    e.solve();

    QueenBoard f = new QueenBoard(6);
    f.solve();

    QueenBoard g = new QueenBoard(7);
    g.solve();

    QueenBoard h = new QueenBoard(9);
    h.solve();

    QueenBoard i = new QueenBoard(10);
    i.solve();

    QueenBoard j = new QueenBoard(20);
    j.solve();
  }

}//end class
