package Interview;

import java.util.HashSet;
import java.util.Scanner;

public class RmVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(Character i:set){
            s= s.replace(i,' ');
            Character up = Character.toUpperCase(i);
            s = s.replace(up,' ');
        }
        s=s.trim();
        System.out.println(s);
    }
}
