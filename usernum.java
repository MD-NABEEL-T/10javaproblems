import java.util.*;
import java.util.Arrays;
public class usernum {
    public static void numCalc(int arr[],int n)
    {
        int negativeNum=0;
        int positiveNum=0;
        int zeros=0;
        for(int i=0;i<n;i++)
        {
                    if(arr[i]<0)
        {
            negativeNum++;
        }
        else if(arr[i]>0){
            positiveNum++;
        }
        else if(arr[i]==0)
        {
            zeros++;
        }
    }
        System.out.println("There are "+positiveNum+" positive numbers");
        System.out.println("There are "+negativeNum+" negative numbers");
        System.out.println("There are "+zeros+" zeros");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to write ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]+=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // the above is for printing the entire array
        numCalc(arr,n);
    }
}
