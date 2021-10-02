/*
Jefford Shau
APCS
HW08 -- Helper Funtions
2021-09-30
*/

/*
Discoveries: The invocation of the functionhas the same syntax as Python
Unresolved Questions: null
*/

public  class Greet {
	public static void main (String[] args){
		greet("John");
		greet("James");
		greet("Amy"); 
	}
	public static void greet(String name){
		System.out.println("Hello there, " + name + "! Is all well?");
	}
}
