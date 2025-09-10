import java.util.Scanner;

    class Pizza {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Ask for pizza size
            System.out.print("Enter pizza size (small/medium/large): ");
            String size = sc.nextLine().toLowerCase(); // convert to lowercase to avoid case issues

            int bill = 0;

            // Assign base price using switch
            switch (size) {
                case "small":
                    bill = 100;
                    break;
                case "medium":
                    bill = 200;
                    break;
                case "large":
                    bill = 300;
                    break;
                default:
                    System.out.println("Invalid size! Please enter small, medium, or large.");
                    return; // exit program if invalid size
            }

            // Ask if user wants pepperoni
            System.out.print("Do you want pepperoni? (yes/no): ");
            String pepperoni = sc.nextLine().toLowerCase();

            if (pepperoni.equals("yes")) {
                if (size.equals("small")) {
                    bill += 30; // small pizza extra
                } else {
                    bill += 50; // medium/large extra
                }
            }

            // Ask if user wants extra cheese
            System.out.print("Do you want extra cheese? (yes/no): ");
            String cheese = sc.nextLine().toLowerCase();

            if (cheese.equals("yes")) {
                bill += 20;
            }

            // Final bill
            System.out.println("Your final bill is: " + bill + " rupees");

            sc.close();
        }
    }


