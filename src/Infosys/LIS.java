package Infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIS {
    static int max = 0;
    public static  void solve(int i,int[] arr,int n,List<List<Integer>> ans,List<Integer> ds){
        if(i>=n){
            max = Math.max(ds.size(),max);
            ans.add(new ArrayList<>(ds));
            return;
        }
            for(int ind=i;ind<n;ind++) {
                if (ds.size() == 0) {
                    ds.add(arr[ind]);
                    solve(ind + 1, arr, n, ans, ds);
                    ds.remove(ds.size() - 1);
                } else if (
                        ((ds.get(ds.size() - 1) & arr[ind]) * 2 < (ds.get(ds.size() - 1) | arr[ind]))
                                && (ds.get(ds.size() - 1) < arr[ind])
                ) {
                    ds.add(arr[ind]);
                    solve(ind + 1, arr, n, ans, ds);
                    ds.remove(ds.size() - 1);
                } else {
                    solve(ind + 1, arr, n, ans, ds);
                }
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i] = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,arr,n,ans,new ArrayList<>());

        System.out.println(max);
    }
}
