// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW19 -- Conditionals
// 2021-10-18

/*
DISCOVERIES
    0. 
UNRESOLVED QUESTIONS
    0. 
*/

public class Teller{ 

  public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcctNum(293014650);
        ba.setBalance(1000);
        ba.deposit(500);
        ba.withdraw(300);
        ba.setName("Ameer");
        ba.setPin((short) 4324);
        ba.setPasswd("AJR4521");
        System.out.println(ba.toString() + "\n");

        System.out.println("test newly added conditionals:");
        ba.setAcctNum(100);
        ba.setPin((short) 100);
        ba.withdraw(2000);
        System.out.println(ba.toString() + "\n");

        System.out.println("test authenticate():");
        System.out.println(ba.authenticate(999999999, "password!"));
        System.out.println(ba.authenticate(999999999, "AJR4521"));
    
    
    
    
    
  
  
  }




}

