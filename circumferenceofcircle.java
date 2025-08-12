import java.util.*;
public class circumferenceofcircle {
    public static void circumferenceCal(float r){
    float circumference = (float) (2 * Math.PI * r); 
    // more precise use PI 
    // here float is used for typecasting since it might give output in double but we tell java that we are ok with float ok
        System.out.println(circumference);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        float r = sc.nextFloat();
        circumferenceCal(r);
        sc.close();
    }
}
