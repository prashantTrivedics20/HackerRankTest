import java.util.Scanner;

public class permutationOfString {
    public static void Solution(String str)
    {
        // write code here
        int n=str.length();
        int f=factorial(n);
        for (int i = 0; i <f; i++) {
            int temp=i;
            StringBuilder sb=new StringBuilder(str);
            for (int j =n;j>=1;j--) {
                int q=temp/j;
                int r=temp%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
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
        String str=readme.nextLine();
        Solution(str);
    }
}
