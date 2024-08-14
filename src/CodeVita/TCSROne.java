package CodeVita;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TCSROne{
    public static int solve(int ind,List<Integer> arr,int current,int score,HashMap<String,Integer> map){
        String s = Integer.toString(ind)+Integer.toString(current)+Integer.toString(score);
        if(ind>=arr.size()){
            return score;
        }
        if(map.containsKey(s))return map.get(s);
        int pick = arr.get(ind)<=current?solve(ind+1,arr,current-arr.get(ind),score+1,map):solve(ind+1,arr,current+arr.get(ind),score-1,map);
        int notPick = solve(ind+1,arr,current,score,map);
        map.put(s,Math.max(pick,notPick));
        return Math.max(pick,notPick);
    }
    public static int max_bittu_score(List<Integer> chocolates,int bittu){
        HashMap<String,Integer> map = new HashMap<>();
        return solve(0,chocolates,bittu,1,map);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr  = new ArrayList<>();
        String[] str = br.readLine().split(" ");
        int bittu = Integer.parseInt(br.readLine());
        for(String s:str){
            arr.add(Integer.parseInt(s));
        }
        System.out.println(max_bittu_score(arr,bittu));
    }
}