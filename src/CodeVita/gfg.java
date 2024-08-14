package CodeVita;

import java.util.*;

class Pair{
    int num,freq;
    public Pair(int num,int freq){
        this.num = num;
        this.freq = freq;
    }
}

class gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numTestCases = Integer.parseInt(sc.nextLine());
        List<List<Pair>> ans = new ArrayList<>();
        for(int i=0;i<numTestCases;i++)ans.add(new ArrayList<>());
        while(numTestCases-->0){
            int n = Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().split(" ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++)arr[i] = Integer.parseInt(s[i]);
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:arr)map.put(i,map.getOrDefault(i,0)+1);
            PriorityQueue<Pair> pq= new PriorityQueue<>((x, y)->(x.freq==y.freq?x.num-y.num:x.freq-y.freq));
            for(int i:map.keySet())pq.add(new Pair(i,map.get(i)));
            List<Pair> ds = new ArrayList<>();
            while(!pq.isEmpty()){
                Pair p = pq.poll();
                ds.add(p);
            }
            ans.add(new ArrayList(ds));
        }
        for(List<Pair> ds:ans){
            for(Pair i:ds){
                for(int j=0;j<i.freq;j++) {
                    System.out.print(i.num + " ");
                }
            }
            System.out.println();
        }
    }
}