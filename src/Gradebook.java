import java.util.Scanner;

public class Gradebook {
    static final int MAX = 50;   // max 50 students
    static int[] roll = new int[MAX];
    static String[] name = new String[MAX];
    static int[] marks = new int[MAX];
    static int count = 0; // number of students added

    // Add student
    public static void addStudent(int r, String n, int m) {
        roll[count] = r;
        name[count] = n;
        marks[count] = m;
        count++;
        System.out.println("Student added successfully.");
    }

    // Display all students
    public static void displayAll() {
        if (count == 0) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("Roll\tName\tMarks\tGrade");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i] + "\t" + grade(marks[i]));
        }
        System.out.println("Total Students: " + count);
    }

    // Search by roll
    public static void search(int r) {
        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Found:");
                System.out.println("Roll: " + roll[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                System.out.println("Grade: " + grade(marks[i]));
                return; // break early after finding
            }
        }
        System.out.println("No record found.");
    }

    // Search by name (overloaded method)
    public static void search(String n) {
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(n)) {
                System.out.println("Found:");
                System.out.println("Roll: " + roll[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                System.out.println("Grade: " + grade(marks[i]));
                return; // break early after finding
            }
        }
        System.out.println("No record found.");
    }

    // Compute class average
    public static double computeAverage(int[] m, int c) {
        if (c == 0) return 0;
        int sum = 0;
        for (int i = 0; i < c; i++) {
            sum += m[i];
        }
        return (double) sum / c;
    }

    // Find grade
    public static String grade(int m) {
        if (m >= 85) return "A";
        else if (m >= 70) return "B";
        else if (m >= 50) return "C";
        else return "F";
    }

    // Show topper
    public static void showTopper() {
        if (count == 0) {
            System.out.println("No students available.");
            return;
        }
        int topIndex = 0;
        for (int i = 1; i < count; i++) {
            if (marks[i] > marks[topIndex]) {
                topIndex = i;
            }
        }
        System.out.println("Topper:");
        System.out.println("Roll: " + roll[topIndex]);
        System.out.println("Name: " + name[topIndex]);
        System.out.println("Marks: " + marks[topIndex]);
        System.out.println("Grade: " + grade(marks[topIndex]));
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Student Gradebook Manager ====");
            System.out.println("1) Add Student");
            System.out.println("2) Display All");
            System.out.println("3) Search Student (by Roll / by Name)");
            System.out.println("4) Class Average & Topper");
            System.out.println("5) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    if (count >= MAX) {
                        System.out.println("Cannot add more students.");
                        break;
                    }
                    System.out.print("Enter Roll: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();

                    int m;
                    while (true) {
                        System.out.print("Enter Marks (0-100): ");
                        m = sc.nextInt();
                        if (m >= 0 && m <= 100) break;
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                        continue;
                    }
                    addStudent(r, n, m);
                    break;

                case 2:
                    displayAll();
                    break;

                case 3:
                    System.out.println("Search by: 1) Roll 2) Name");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == 1) {
                        System.out.print("Enter Roll to search: ");
                        search(sc.nextInt());
                    } else if (opt == 2) {
                        System.out.print("Enter Name to search: ");
                        search(sc.nextLine());
                    } else {
                        System.out.println("Invalid option!");
                    }
                    break;

                case 4:
                    double avg = computeAverage(marks, count);
                    System.out.printf("Class Average: %.2f%n", avg);
                    showTopper();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
