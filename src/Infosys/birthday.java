package Infosys;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class birthday {
    public  static void solve(int prev,int curr,int max,int size,HashSet<List<Integer>> ans,List<Integer> ds){
        if(curr>max||ds.size()>=size){
            if(ds.size()==size)ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=curr;i<=max;i++){
            if(i%prev==0) {
                ds.add(i);
                solve(i,i+1,max,size,ans,ds);
                solve(i,i,max,size,ans,ds);
                ds.remove(ds.size()-1);
            }else{
                solve(prev,i+1,max,size,ans,ds);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 10000;
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashSet<List<Integer>> ans = new HashSet<>();

        solve(1,1,n,k,ans,new ArrayList<>());
        for(List<Integer> ls:ans){
            for(int i:ls) System.out.print(i+" ");
            System.out.println();
        }
        System.out.println(ans.size());
    }
}
