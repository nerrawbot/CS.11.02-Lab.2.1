/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME:
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        morningGreeting("th");
        System.out.println(add(6,8));
        System.out.println(add(6,8, 91,32));
        roundPositiveValueToNearestInteger(6.9);
        roundNegativeValueToNearestInteger(-6.1);
        triple("Bruh");
        half(9);


    }

    // 1. add
    public static int add(int a, int b) {
        return (a + b);
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return (add(a, add(b, add(c, d))));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        System.out.println("早上好, " + name + "!");
        return name;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        System.out.println("下午好, " + name + "!");
        return name;
    }
    // 5. triple
    public static String triple(String words) {
        String triple = (words + words + words);
        System.out.println(triple);
        return triple;
    }
    // 6. half
    public static double half(double a) {
        System.out.println(a / 2);
        return a / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a) {
        System.out.println((int)(a + 0.5));
        return a + 0.5;
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a) {
        System.out.println((int)(a - 0.5));
        return a - 0.5;
    }
}
