import java.util.Scanner;

public class ATM {
    static int balance = 0;
    static final int PIN = 1234;

    public static void deposit(int amount) {
        if (amount > 0) {

            balance += amount;

            System.out.println("Deposit successful.");
        } else {

            System.out.println("Invalid amount! Try again.");
        }
    }
/// ////////////////////
    public static void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Try again.");

        } else if (amount > balance) {
            System.out.println("Insufficient balance!");

        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");

        }
    }
/// //////////////////////
    public static void checkBalance()
    {

        System.out.println("Your balance is: " + balance);
    }
/// ////////////////////
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        // PIN check
        for (int attempts = 3; attempts > 0; attempts--) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == PIN) {
                System.out.println("Login successful!");
                loggedIn = true;
                break;
            } else {
                System.out.println("Wrong PIN! Attempts left: " + (attempts - 1));
            }
        }

        if (!loggedIn) {
            System.out.println("Account locked. Too many wrong attempts.");
            return;
        }

        // ATM menu
        while (true) {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    deposit(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw(sc.nextInt());
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option Try again.");
            }
        }
    }
}

