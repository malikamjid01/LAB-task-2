import java.util.Scanner;

public class Ultitycode {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter num1 : ");
        int num1 = s.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = s.nextInt();


        System.out.println("Add: " + Add(num1, num2));
        System.out.println("Subtract:" + Sub(num1, num2));
        System.out.println("Multiply" + Mul(num1, num2));
        System.out.println("Divide: " + Div(num1, num2));

        System.out.println("Enter num3");
        int num3 = s.nextInt();
        System.out.println("Maxium num is" + Max(num1, num2, num3));
        System.out.println("num check: "+isPrime(num1));



    }

    // Addition
    public static int Add(int a, int b) {
        return a + b;
    }

    //Subtract
    public static int Sub(int a, int b) {
        return a - b;

    }

    //Multiply
    public static long Mul(int a, int b) {
        return a * b;
    }

    // divide
    public static double Div(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return a / (double) b;
    }
    //Find maxofThree

    public static int Max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static Boolean isPrime(int n) {
        int c = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }




}