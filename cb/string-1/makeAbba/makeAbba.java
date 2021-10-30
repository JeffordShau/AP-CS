/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Given a string, return a string where for every char in the original, there are two chars.
*/

public class doubleChar {

  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}


  public static void main(String[] args) {
    System.out.println(makeAbba("Hi", "Bye")); // → "HiByeByeHi"
    System.out.println(makeAbba("Yo", "Alice")); // → "YoAliceAliceYo"
    System.out.println(makeAbba("What", "Up")); // → "WhatUpUpWhat"
}
