package ALgos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class hashing {
    //it is a technique to convert key value pairs to indices
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("1",21);
        ht.put("2",22);
        ht.put("3",33);
        System.out.println(ht.get(21));
        int arr[] = {12,41,412,12,12,442,166};
        createHashMap(arr);

    }
    //function to create a hashmap from an array
    static void createHashMap(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x=0;x<arr.length;x++){
            Integer s = map.get(arr[x]);
            if(map.get(arr[x])==null){
                map.put(arr[x],1);
            }
            else{
                map.put(arr[x],++s);
            }
        }
        System.out.println(map);
    }
}
