import java.util.ArrayList;
import java.util.List;
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

    public static void formatOutput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            // the 03d adds the number 0 as padding in front of the x variable. 3 says how many digits the variables should be formatted to. 0 is what it should be padded with if it's less than 3 digits
            // adding spaces affects the output in the console
        }
        System.out.println("================================");
    }

    public static void printMultiples(int n) {
        for (int i = 1; i <= 10; i++) {

            int math = n*i;
            System.out.printf("%s x %s = %s %n", n, i, math);
        }
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        Integer sum = 0;
        for (Integer integer : ar) {
            sum += integer;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
//        weirdCheck(2);
//        stdinOut();
//        formatOutput();
//        printMultiples(5);
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(13);
        simpleArraySum(arr);
    }
}
