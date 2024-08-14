package Infosys;

public class Initials {
    public static void main(String[] args) {
        String input1 = "harsh Dambhare";

        String ans = Character.toString(Character.toUpperCase(input1.charAt(0)))+
                "."+
                Character.toString(Character.toUpperCase(input1.charAt(input1.length()-1)));
        System.out.println(ans);
    }
}
