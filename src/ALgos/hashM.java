package ALgos;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class hashM {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("yo","harsh");
        map.put("actor","sarah");
        map.put("time","10:20");
        map.put("actor","ha");//we can have same values in multiple keys but
        // we cannot have keys of same name in
        System.out.println(map);//in HashMap we cannot get thing in a sequence
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //the only difference between the hashmap and hashtable.. hashtable is synchronised
        //hashmap is not synchronised
        Map<String,String> mapT = new Hashtable<>();

    }
}
