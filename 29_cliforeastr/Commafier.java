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

public class Commafier {
    public static void main(String[] args) {

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


        for (String arg : args) {
            System.out.println(commafyF(Integer.parseInt(arg)));
            System.out.println(commafyR(Integer.parseInt(arg)));
        }
    }

    public static String commafyF(int n) {
        String numberString = "" + n;
        String commaedString = "";

        int numberStringLength = numberString.length();
        int leadingDigits = numberStringLength % 3;
        int periods = numberStringLength / 3;

        if (numberStringLength > 3) {
            if (leadingDigits != 0) {
            commaedString = numberString.substring(0, leadingDigits);
            }
            for (int count = 0; count < periods; count++) {
                commaedString = commaedString + "," + numberString.substring(leadingDigits + 3 * count, leadingDigits + 3 * (count + 1));
            }
            return commaedString;
        } else {
          return numberString;
        }
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
