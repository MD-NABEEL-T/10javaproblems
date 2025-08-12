import java.util.*;
public class powercalc {
    public static void powerCalc(int x,int n)
    {
        double powerValue = Math.pow(x,n);
        // cannot use x**n in java so ..
        System.out.println("The x power n value is "+powerValue);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        powerCalc(x,n);
    }
}
