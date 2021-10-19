// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW19 -- Conditionals
// 2021-10-18

/*
DISCOVERIES
    0. Withdrawal returns a string when it should return a boolean. 
    1. Authenticate uses short PIN as parameter when it should use String password. 
    2. All mutators return the new values when they should return the old values. 
    3. Their conditionals in setAcctNum and setPin do not work because they are missing a return statement. 
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
        System.out.println(ba.authenticate(999999999, (short) 1000));
        System.out.println(ba.authenticate(999999999, (short) 9999));
    
    
      ` BankAccount ba = new BankAccount();
        ba.setAcctNum(293014650);
        ba.setBalance(1000);
        ba.deposit(-100000000);
        ba.withdraw(-1000000000);
        ba.setName("Ameer");
        ba.setPin((short) 4324);
        ba.setPasswd("AJR4521");
        System.out.println(ba.toString() + "\n");

        System.out.println("test newly added conditionals:");
        ba.setAcctNum(1234);
        ba.setPin((short) 100);
        ba.withdraw(2000);
        System.out.println(ba.toString() + "\n");

        System.out.println("test authenticate():");
        System.out.println(ba.authenticate(999999999, (short) 100));
        System.out.println(ba.authenticate(999999999, (short) 9999));
        ba.setPin((short) 100);
        ba.withdraw(2000);
        System.out.println(ba.toString() + "\n");

        System.out.println("test authenticate():");
        System.out.println(ba.authenticate(999999999, (short) 100));
        System.out.println(ba.authenticate(999999999, (short) 9999));
    
    
    
  
  
  }




}

