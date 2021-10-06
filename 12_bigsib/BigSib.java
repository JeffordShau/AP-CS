/*
Jefford Shau
APCS
HW12 -- Instance Variable
2021-10-05
*/

/*
DISCO: 
QCC: 
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

 /*
$ javac Greet.java
Word up freshman
Salutations Dr. Spaceman
Hey ya Kong Fooey
Sup mom
*/
