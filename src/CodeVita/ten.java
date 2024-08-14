package CodeVita;
import java.util.*;
public class ten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:str){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String odd = "";
        for(String s:str){
            if(map.get(s)%2!=0){
                odd = s;
                break;
            }
        }
        if(odd.equals("")) System.out.println("All are even");
        else System.out.println(odd);
    }
}
