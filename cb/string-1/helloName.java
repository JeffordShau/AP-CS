public class helloName {
  public static String helloName(String name) {
    return "Hello " + name + "!";
  }

  public static void main(String[] args){
    System.out.println(helloName("Bob"));
    System.out.println(helloName("Darren"));
    System.out.println(helloName("Cary"));
  }
}
