import java.util.*;
public class greatestoftwo {
    public static void greatest(int num1,int num2)
    {
        if(num1>num2) {System.out.println(num1 + " is the greatest");}
        else{ System.out.println(num2 + " is the greatest");}
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        greatest(num1,num2);
    }
}
