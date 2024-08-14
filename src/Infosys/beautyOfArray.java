package Infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beautyOfArray {
    public static int findBeauty(List<Integer> ds){
        int sumOfOdd = 0,sumOfEven=0;
        for(int i=0;i<ds.size();i++){
            if(i%2==0){
                sumOfEven+=ds.get(i);
            }else{
                sumOfOdd+=ds.get(i);
            }
        }
        return Math.max(sumOfEven,sumOfOdd);
    }
    public static int solve(int N,List<Integer> A,List<Integer> X){
        int MOD = 1000000007;
        int p = 0;

        for(int i=0;i<N;i++){
            List<Integer> ds = new ArrayList<>(A.subList(0,i));
            for(int j=0;j<X.get(i)+1;j++)ds.add(A.get(i));
            for(int j=i+1;j<N;j++) {
                ds.add(A.get(j));
            }
            p = p + findBeauty(ds)%MOD;
            p = p%MOD;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        for(int i=0;i<n;i++)a.add(sc.nextInt());
        for(int i=0;i<n;i++)x.add(sc.nextInt());
        int res = solve(n,a,x);
        System.out.println(res);
        }
}
