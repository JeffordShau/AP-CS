// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW26 -- GCD Three Ways
// 2021-10-27
// time spent: 0.5 hrs

/*
DISCOVERIES
UNRESOLVED QUESTIONS
ALGO
*/

import java.lang.Math;

public class Stats {
    public static int gcd (int a, int b){
        int counter = 0;
        int gcd = 0;
        while (counter < (a + b)) {
            counter++;
            if (a % counter == 0 && b % counter == 0) {
                gcd = counter;
            }
        }
        return gcd;
    }

    public static int gcdER(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a < b) {
            return gcd(a, b - a);
        } else {
            return gcd(a - b, b);
        }
    }

    public static int gcdEW(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("testing brute force algo:");
        System.out.println("the gcd of 15 and 38 is: " + gcd(15, 38));
        System.out.println("the gcd of 15 and 30 is: " + gcd(15, 30));
        System.out.println("the gcd of 15 and 15 is: " + gcd(15, 15));

        System.out.println("\ntesting recursive algo:");
        System.out.println("the gcd of 15 and 38 is: " + gcdER(15, 38));
        System.out.println("the gcd of 15 and 30 is: " + gcdER(15, 30));
        System.out.println("the gcd of 15 and 15 is: " + gcdER(15, 15));

        System.out.println("\ntesting while algo:");
        System.out.println("the gcd of 15 and 38 is: " + gcdEW(15, 38));
        System.out.println("the gcd of 15 and 30 is: " + gcdEW(15, 30));
        System.out.println("the gcd of 15 and 15 is: " + gcdEW(15, 15));
