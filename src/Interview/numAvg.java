package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class numAvg {
    public static int solve(List<Integer> list){
        int ans=0;
        HashSet<Integer> set = new HashSet<>(list);
        for(int i=0;i<list.size();i++){
            int avg =0,sum=list.get(i);
            for(int j=i+1;j<list.size();j++){
                sum+= list.get(j);
                avg = sum/2;
                if(set.contains(avg))ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        while(num!=0){
            int x = sc.nextInt();
            list.add(x);
            num--;
        }
        System.out.println(solve(list));
    }
}
