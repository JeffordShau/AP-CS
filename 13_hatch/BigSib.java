/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob (also got help from Nafix's post on Piazza)
APCS
HW12 -- Instance Variables
2021-10-05
*/

/*
DISCO: a constructor does not have return types nor static.
a constructor must be public and before other methods
QCC: why is there no return type for a constructor, can't the return type be "void"?
*/

public class BigSib {
	private String helloMsg; 
	public bigSibMsg(String msg){
		helloMsg = msg; 
	}
	public String greet(String name){
		return helloMsg + " " + name;
	}
}
