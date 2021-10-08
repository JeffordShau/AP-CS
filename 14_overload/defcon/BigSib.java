/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob
APCS
HW14 -  Default Constructor
2021-10-07
*/

/*
DISCO: got an error: invalid method declaration; return type required. this made me notice that the variable had to be defined before the default constructor and not inside. 

QCC: 
*/

public class BigSib {
	String helloMsg; 
	public BibSib(){
    		helloMsg = "Nice to meet you";
	}
	public String greet(String name){
		return helloMsg + " " + name;
	}
}
