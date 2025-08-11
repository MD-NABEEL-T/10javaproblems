import java.util.*;
public class averageof3
{
    public static int avg(int num1,int num2,int num3)
    {
        int averageValue = (num1+num2+num3)/3;
        return averageValue;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3");
        int num3 = sc.nextInt();

        int average = avg(num1,num2,num3);
        System.out.println("the average is "+average);
    }
}