import java.util.*;
public class task1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int[]arr=new int[6];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter numbers: ");
            arr[i]=s.nextInt();
        }
        int sum=0;
        int min=arr[0];
        int max=arr[0];
        int ev=0;
        int od=0;


        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }

            if(arr[i]%2==0)
            {
                ev++;
            }else {
                od++;
            }

        }
     double average= (double)sum/arr.length;

        System.out.println("Sum of All numbers : "+sum+"\n"+"Average : "+average+"\n" +
                "\n"+"Min number is : "+min+"\n"+"Max number is : "+max+"\n"+
                "Even numbers : "+ev+"\n"+"odd numbers : "+od);

        for(int i=arr.length-1;i>=0;i--)

        {
            System.out.println("Reverse of Array is "+arr[i]);
        }



    }
}
