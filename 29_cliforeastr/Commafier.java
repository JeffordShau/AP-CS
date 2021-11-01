// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW29 -- Which Way Do You Roll?
// 2021-11-01
// time spent: 0.5 hrs

/*
DISCOVERIES
    0.

UNRESOLVED QUESTIONS
    0.
*/

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(commafyF(1));
        System.out.println(commafyF(10));
        System.out.println(commafyF(101));
        System.out.println(commafyF(1000));
        System.out.println(commafyF(12345));
        System.out.println(commafyR(1));
        System.out.println(commafyR(10));
        System.out.println(commafyR(101));
        System.out.println(commafyR(1000));
        System.out.println(commafyR(12345));
        */

        for (String arg : args) {
            System.out.println(commafyF(Integer.parseInt(arg)));
            System.out.println(commafyR(Integer.parseInt(arg)));
        }
    }

    public static String commafyF(int n) {
        String numberString = "" + n;
        String commaedString = "";

        int lolz = numberString.length();

        while (lolz > 3) {
            commaedString = "," + numberString.substring(lolz - 3, lolz) + commaedString;
            lolz -= 3;
        }

        commaedString = numberString.substring(0, lolz) + commaedString;

        return commaedString;
    }

    public static String commafyR(int n) {
        if (n < 1000) {
            return "" + n;
        }

        String nString = "" + n;
        int newN = Integer.parseInt(nString.substring(0, nString.length() - 3));

        return commafyR(newN) + "," + nString.substring(nString.length() - 3);
    }
}
