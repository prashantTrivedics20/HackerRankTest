import java.util.Scanner;
import java.util.*;
public class Contest1 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int m=readme.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0)
                {
                    even.add(arr[i][j]);
                }
                if(arr[i][j]%2==1)
                {
                    odd.add(arr[i][j]);
                }
            }
        }
        Integer arr1[]=new Integer[even.size()];
        even.toArray(arr1);
        System.out.println(Arrays.toString(arr1));
        Integer arr2[]=new Integer[odd.size()];
        odd.toArray(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
