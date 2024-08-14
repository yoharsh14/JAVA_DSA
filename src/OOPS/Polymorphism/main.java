package OOPS.Polymorphism;


import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static boolean reactable(String s,String q){
        int[] freq1 = new int[26];
        int[] freq2 = new  int[26];
        for(int i=0;i<s.length();i++)freq1[s.charAt(i)-'a']+=2;
        for(int j=0;j<q.length();j++)freq2[q.charAt(j)-'a']++;
        return Arrays.equals(freq1,freq2);
    }
    public static int solve(int input1,String[] input2){
        int ans = 0;
        for(int i=0;i<input1;i++){
            for(int j=0;j<input1;j++){
                if(reactable(input2[i],input2[j]))ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve(5,new String[]{"hacker","int","intint","hackerhacker","long"}));
    }
}
