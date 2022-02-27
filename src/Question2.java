import java.util.Scanner;

public class Question2 {
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int res=power(x,n-1);
        int myres=x*res;
        return myres;

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);

        int x=readme.nextInt();
        int n=readme.nextInt();
       int powerCalculated= power(x,n);
        System.out.println(powerCalculated);

    }
}
