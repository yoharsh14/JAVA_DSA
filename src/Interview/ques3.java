package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ques3 {
    public static void main(String[] args) {
        int arr[] ={1,2,22,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> frequencies = new ArrayList<>(map.values());
        HashSet<Integer> set = new HashSet<Integer>();
        for(int value: frequencies){
            if(!set.contains(value)){
                set.add(value);
            }else{
                while(value > 0 && set.contains(value)){
                    value--;
                    count++;
                }
                set.add(value);
            }
        }
        System.out.println(count);
    }
}
