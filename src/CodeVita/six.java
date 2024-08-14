package CodeVita;
import java.util.*;
public class six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int star_cnt=0;
        int hash_cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*')star_cnt++;
            else hash_cnt++;
        }
        int res = star_cnt-hash_cnt;
        System.out.println(res);
    }
}
