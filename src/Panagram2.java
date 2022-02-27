import java.util.*;
public class Panagram2 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        String str1=str.toLowerCase();
        int f=1;
        for (int i = 'a'; i <='z'; i++) {
            //String s=String.valueOf(str.charAt(i));
            String s=Character.toString(i);
            if(str1.contains(s)==false)// contains(CharSequence s) return the boolean value if(charater is matches otherwise
                // it return the false value..)
            {
                f=0;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}
