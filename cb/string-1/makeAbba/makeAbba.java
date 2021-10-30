/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

public class makeAbba {

  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}


  public static void main(String[] args) {
    System.out.println(makeAbba("Hi", "Bye")); // → "HiByeByeHi"
    System.out.println(makeAbba("Yo", "Alice")); // → "YoAliceAliceYo"
    System.out.println(makeAbba("What", "Up")); // → "WhatUpUpWhat"
}
