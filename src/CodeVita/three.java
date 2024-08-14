package CodeVita;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;
        while(num>0){
            int val = num%10;
            ans *=val;
            num/=10;
        }
        System.out.println(ans);
    }
}
