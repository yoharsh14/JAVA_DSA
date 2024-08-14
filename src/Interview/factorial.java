package Interview;

import java.util.Scanner;

public class factorial {
    public static int add(int x,int y){
        int carry = 0;
        while(y>0){
            carry = x&y;
            x = x^y;
            y = carry<<1;
        }

        return x;
    }
    public static int multiply(int x,int y){
        int res = 0;
        while(y>0){
            if((y&1)==1)res = add(res,x);
            x<<=1;
            y>>=1;
        }
        return res;
    }
    public static int factorialOfNumber(int num){
        return num==0||num==1?1:multiply(num,factorialOfNumber(num-1));
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        int ans= factorialOfNumber(num);
        System.out.println(ans);
    }
}
