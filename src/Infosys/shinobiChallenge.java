package Infosys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class shinobiChallenge {
    public static int solve(int n,String s,int A,int B,int C,int Y){
        HashMap<Character,Integer> map = new HashMap<>();
        int MOD = 1000000007;
        int[] dp = new int[n+1];
        dp[0] = 0;
        map.put('a',A);
        map.put('b',B);
        map.put('c',C);
        map.put('Y',Y);
        for(int i=1;i<=n;i++){
            int single = (map.get(s.charAt(i-1))+dp[i-1])%MOD;
            int three = i-3<0?Integer.MAX_VALUE:(map.get('Y')+dp[i-3])%MOD;
            dp[i] = Math.min(single,three);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int costOfA = sc.nextInt();
        int costOfB = sc.nextInt();
        int costOfC = sc.nextInt();
        int costOfY = sc.nextInt();
        String s = sc.next();
       int ans= solve(n,s,costOfA,costOfB,costOfC,costOfY);
        System.out.println(ans);
    }
}
