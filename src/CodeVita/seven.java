package CodeVita;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Strarr = sc.nextLine().split(" ");
        int n = Strarr.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(Strarr[i]);
        }
        int max = -1;
        int ans = 0;
        for(int i:arr){
            if(max<i)ans++;
           max = Math.max(max,i);
        }
        System.out.println(ans);
    }
}
