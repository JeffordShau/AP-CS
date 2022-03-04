public class MazeGenerator() {
  private char[][] _maze;
  private int h, w; // height, width of maze
  private counter = 0; // counts iterations
  private runTime = 80; // when to end the maze generator

  public MazeGenerator() {
    h = 0;
    w = 0;
    _maze = new char[25][80];
  }

  public MazeGenerator(int x, int y) {
    h = x;
    w = y;
    _maze = new char[x][y]
  }

  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }

  public Generator() {
    int startX= (int)(h*Math.random());
    int startY= (int)(w*Math.random());
    _maze[startX][startY] == "#";

    if ( ) {
	     _solved = true;
       System.out.println( this );
       System.exit(0);
    }






      Generator(x,y-1);
      Generator(x+1,y);
      Generator(x,y+1);
      Generator(x-1,y);
    }

  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
    if((_maze[x][y] == '$') || (_maze[x][y] == '#')) {
      return true;
    } return false;
  }




  public static void main(String[] args) {
    counter = 0;


    // EXIT
    int endX= (int)(h*Math.random());
    int endY= (int)(w*Math.random());
    while(!ms.onPath( startX, startY)) {
      endX = (int)(h*Math.random());
      endY = (int)(w*Math.random());
    }
    ms.Generator( endX, endY );

  }
}
