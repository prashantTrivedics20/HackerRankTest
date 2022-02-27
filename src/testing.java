public class testing {
    public static void main(String[] args) {
//        String s="-00012309";
//        int n=Integer.parseInt(s);
//        System.out.println(n);
        String s="ABCD";
        for (int i = 0; i < s.length(); i++) {
            //int Ascii=s.charAt(i)-'A';
            //System.out.println(Ascii);
           int Ascii=Character.getNumericValue(s.charAt(i));
//            System.out.println(Character.getType(s.charAt(i)));
            char ch=s.charAt(i);
            //int acii=(int)ch;
            //System.out.println(acii);

            System.out.print(Ascii+" ");
            //System.out.println(unicode+" ");
        }


    }
}
