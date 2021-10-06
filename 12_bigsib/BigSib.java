/*
Jefford Shau
APCS
HW12 -- Instance Variables
2021-10-05
*/

/*
DISCO: The helloMsg instance variable must be defined outside of both methods and inside of the class BigSib to be used by the greet method and the setHelloMsg method. 
Defining the "richard" variable as the BigSib function worked smoothly. 
QCC: Why use "richard" variable instead of BigSib. ?
*/

public class BigSib {
	String helloMsg; 
	public String greet(String name){
		return helloMsg + " " + name;
	}
  
  	public void setHelloMsg(String MsgPhrase){
    helloMsg = MsgPhrase;
	}
}
