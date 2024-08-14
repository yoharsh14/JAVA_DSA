package Interview;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            int ascii = (int)s.charAt(i);
            System.out.println(s.charAt(i)+" ASCII value is: "+ascii );
        }
    }
}
