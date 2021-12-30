import java.util.Scanner;

public class HackerRank {

//    Given an integer, perform the following conditional actions:
//
//    If  is odd, print Weird
//    If  is even and in the inclusive range of  to , print Not Weird
//    If  is even and in the inclusive range of  to , print Weird
//    If  is even and greater than , print Not Weird

    public static void weirdCheck(int num) {
        if (num % 2 == 0 && (num >= 2 && num <= 5)) {
            System.out.println("Not Weird");
        } else if (num % 2 == 0 && (num >= 6 && num <= 20)) {
            System.out.println("Weird");
        } else if (num % 2 == 0 && num > 20) {
            System.out.println("Not Weird");
        } else if (num % 2 != 0) {
            System.out.println("Weird");
        }
    }

    public static void stdinOut() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        String text = scanner.nextLine();

        System.out.println("String: " + text);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
    }

    public static void main(String[] args) {
//        weirdCheck(2);
        stdinOut();
    }
}
