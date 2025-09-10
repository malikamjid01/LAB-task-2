import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);

        // Input Quiz Marks
        System.out.println("Enter Quiz marks out of 15");
        int q= S.nextInt();
        if(q>15)
        {
            System.out.println("Please Enter valid marks");
        } else if (q<0) {
            System.out.println("Please Enter valid marks");
        }
        else {
            System.out.println("Number Enter Successfully");
        }
        // // //
        // Input Assignment Marks
        System.out.println("Enter Assignment marks out of 10");
        int a= S.nextInt();
        if(a>10)
        {
            System.out.println("Please Enter valid marks");
        } else if (a<0) {
            System.out.println("Please Enter valid marks");
        }
        else {
            System.out.println("Number Enter Successfully");
        }
//Input Mid-Term Marks

        System.out.println("Enter Mid-term marks out of 25");
        int m= S.nextInt();
        if(m>25)
        {
            System.out.println("Please Enter valid marks");
        } else if (m<0) {
            System.out.println("Please Enter valid marks");
        }
        else {
            System.out.println("Number Enter Successfully");
        }
       // Input Final-Term Marks
        System.out.println("Enter Final marks out of 50");
        int f= S.nextInt();
        if(f>50)
        {
            System.out.println("Please Enter valid marks");
        } else if (f<0) {
            System.out.println("Please Enter valid marks");
        }
        else {
            System.out.println("Number Enter Successfully");
       }
   // Calculate Total Marks
        int sum=q+a+m+f;
        System.out.println("Sum is "+sum);
        double average = (double) sum; // which is same as sum

        System.out.println("Average : "+average);

        if (average >= 85) {
            System.out.println("Grade = A");
        } else if (average >= 70) {
            System.out.println("Grade = B");
        } else if (average >= 50) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = Fail");
        }






    }
}