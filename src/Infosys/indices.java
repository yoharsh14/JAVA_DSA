package Infosys;

import java.util.HashSet;
import java.util.Scanner;

public class indices {
    public static  int solve(String s){
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
          if(Character.isLowerCase(curr)){
              HashSet<Character> set = new HashSet<>();
              set.add(curr);
              int num = 1;
              int j= i;
              while(j<s.length()&&!Character.isUpperCase(s.charAt(j))){
                  if(set.add(s.charAt(j))){
                      num++;
                  }
                  j++;
              }
              ans = Math.max(ans,num);
              i = j-1;
          }
        }
        return ans==1?0:ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = solve(s);
        System.out.println(res);
    }
}
