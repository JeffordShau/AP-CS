// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW26 -- GCD Three Ways
// 2021-10-27
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. The brute-force method required more work and code than the recursive and the while loop methods. 
    1. This method of GCD does not work with zero or negative numbers, so we set the pre-condition of a and b to accept positive integers only. 
UNRESOLVED QUESTIONS
    0. 
ALGO
    0. 
*/

import java.lang.Math;

public class Stats {
    
    public class Stats {
    public static int mean(int a, int b) {
        return (a + b) / 2;
    }

    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /*
    public static int geoMean(int a, int b) {
        if (a >= 0 && b >= 0) {
            int x = Math.pow(a * b, 1/2);
            return x;
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1;
        }
    }
    */

    public static double geoMean(double a, double b) {
        if (a >= 0 && b >= 0) {
            return Math.pow(a * b, 1.0 / 2);
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1.0;
        }
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static double max(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    /*
    public static int geoMean(int a, int b, int c) {
        if (a >= 0 && b >= 0) {
            int x = Math.pow(a * b * c, 1/3);
            return x;
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1;
        }
    }
    */

    public static double geoMean(double a, double b, double c) {
        if (a >= 0 && b >= 0) {
            return Math.pow(a * b * c, 1.0 / 3);
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1;
        }
    }
    
    public static int gcd (int a, int b){
        int counter = 0;
        int gcd = 0;
        int lower = 0; 
        if (a > b) {
            lower = b;
        } else {
            lower = a;
        }
        while (counter < lower) {
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
    }
}
