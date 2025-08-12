import java.util.*;
public class infiniteloop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int r = sc.nextInt();
        while (r>10)
        {
            System.out.println(r);
            r++;
        }
        sc.close();
    }
}
// better not to run 
