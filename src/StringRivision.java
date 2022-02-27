import java.util.Arrays;
import java.util.Scanner;
public class  StringRivision {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        String s1=str.replace("he","pre");//CharSequence
        String s2=str.replace('h','p');// char
        int s3=str.hashCode();// it will return integer hashCode...
        String[] s5 = str.split("\\.");
        boolean b= str.matches("hello");
        System.out.println(b);

        System.out.println(Arrays.toString(s5));
        int i=str.indexOf("prashant");// it will return the integer value..
        int j=str.indexOf(1);
        String s[]=  str.split("\\.",10);
        System.out.println(Arrays.toString(s));
        System.out.println(j);
        System.out.println(i);
       int p= str.lastIndexOf("p");
        System.out.println(p);

//        System.out.println(s3);
//        System.out.println(s1);
//        System.out.println(s2);

    }
}
