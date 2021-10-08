/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob
APCS
HW14 -  Default Constructor
2021-10-07
*/

/*
DISCO: got an error: error: cannot find symbol. this made me notice that the variable had to be defined before the default constructor and not inside. 
QCC: why can you not define variables inside the default constructor if the default constructor is accessible by the other methods anyway? 
*/

public class BigSib {
	String helloMsg; 
 	public BigSib() {
		helloMsg = "Nice to meet you, ";
	}
	
	public BigSib(String msg){
		helloMsg = msg; 
	}
	public String greet(String name){
		return helloMsg + " " + name;
	}
}
