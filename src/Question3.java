import java.util.Scanner;
// Suppose you have a string, S, made up of only 'a's and 'b's.
// Write a recursive function that checks if the string was generated using the following rules:
//a. The string begins with an 'a'
//b. Each 'a' is followed by nothing or an 'a' or "bb"
//c. Each "bb" is followed by nothing or an 'a'
//If all the rules are followed by the given string, return true otherwise return false.
//
//Sample Input 1 :
//abb
//Sample Output 1 :
//true
//Sample Input 2 :
//abababa
//Sample Output 2 :
//false
public class Question3 {
    public static boolean checkString(StringBuffer s,int idx)
    {
        if(s.length()==1&&s.charAt(0)=='a')
        {
            return true;
        }
        if(s.length()==1&&s.charAt(0)=='b')
        {
            return false;
        }
        if(s.length()>1&&s.charAt(idx+1)=='a'||s.length()>1&&s.substring(1).equals("bb"))
        {
            return true;
        }
        else if( s.length()==1&&s.charAt(0)=='a'||s.length()==3&&s.substring(1,3).equals("bb")||s.length()>3&&s.charAt(idx+3)=='a')
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {

        Scanner readme=new Scanner(System.in);
        StringBuffer s=new StringBuffer(readme.nextLine());
        boolean b=checkString(s,0);
        System.out.println(b);
    }
}
