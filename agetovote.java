import java.util.*;
public class agetovote {
    public static void ageCalc(int age)
    {
        if(age >=18)
        {
            System.out.println("you are eligible to vote");
        }
        else
        {
            System.out.println("you are not eligible to vote ");
        }
    }
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        ageCalc(age);
    }
}
