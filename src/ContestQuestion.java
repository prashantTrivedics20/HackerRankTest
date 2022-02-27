import java.util.Scanner;
import java.util.*;
public class ContestQuestion {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n1=readme.nextInt();
        int arr[]=new int[n1];
        int n2=readme.nextInt();
        int arr1[]=new int[n2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=readme.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=readme.nextInt();
        }
        int arr2[]=new int[arr1.length+arr.length];
        for (int i = 0; i <arr.length; i++) {
            arr2[i]=arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i+n1]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        if(arr2.length%2==0) {
            for (int i = 0; i < arr2.length; i++) {
                int k=arr2.length/2-1;
                System.out.println((double)(arr2[k]+arr2[k+1])/2);
                break;
            }
        }
        else
        {
            for (int i = 0; i < arr2.length; i++) {
                int k=arr2.length/2;
                System.out.println((double)(arr2[k]));
                break;
            }
        }




    }
}
