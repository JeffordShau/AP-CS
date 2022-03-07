public class Mysterion {
  static int[] arr = new int[5];

  public static void swap(int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void main(String[] args) {
    int a, b, c;
    a=0;
    b=4;
    c=2;
    for(int i = 0; i < 5; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    int v = arr[c];
    swap(c,b);
    int s=a;
    for(int i = a; i < b; i++) {
      if(arr[i]<v) {
        swap(s,i);
        s+=1;
      }
    }
    swap(b,s);
  }
}
