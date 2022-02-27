import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class permutationofArray {
    public static void Solution(Integer [] arr1)
    {
        // write code here
        int n=arr1.length;
        int f=factorial(n);
        for (int i = 0; i <f; i++) {
            int temp=i;
            ArrayList<Integer>al=new ArrayList<>(Arrays.asList(arr1));
            for (int j =n;j>=1;j--) {
                int q=temp/j;
                int r=temp%j;
                System.out.print(al.get(r)+" ");
                al.remove(r);
                temp=q;
            }
            System.out.println();

        }
    }
    public static int factorial(int n)
    {
        int f=1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        Integer arr[]=new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        //String str=readme.nextLine();
        Solution(arr);
    }
}
