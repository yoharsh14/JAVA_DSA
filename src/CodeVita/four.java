package CodeVita;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int size = sc.nextInt();
        int max = 0,i=0;
        while(i<str.length()){
            int curr = 0;
            int cond = i+size;
            while(i<str.length()&&i<cond){
               if(str.charAt(i)=='a')curr++;
               i++;
            }
            max = Math.max(max,curr);
        }
        System.out.println(max);
    }
}
