package buoi1;
import java.util.Scanner;
public class Main2 {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String ten;
            ten=sc.nextLine();

            String m=removeAccent(ten);

            System.out.println(m);

        }
        public static String removeAccent(String s) {
            String str = "";
            str=str+Character.toUpperCase(s.charAt(0));
            for(int i=1;i<s.length();i++) {

                if(s.charAt(i-1)==' ')
                    str=str+Character.toUpperCase(s.charAt(i));
                else
                    str=str+s.charAt(i);
            }


            return str;
        }


}
