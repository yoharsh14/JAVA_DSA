package Infosys;

import java.util.PriorityQueue;
import java.util.Scanner;

class Pair{
    int power;
    int bonus;
    public Pair(int power,int bonus){
        this.power = power;
        this.bonus = bonus;
    }
}

public class RPG_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialPower = sc.nextInt();
        int[] power = new int[n];
        int bonus[] = new int[n];
       for(int i=0;i<n;i++)power[i] = sc.nextInt();
       for (int i=0;i<n;i++)bonus[i] = sc.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->(x.power==y.power?y.bonus-x.power:x.power-y.power));
        for(int i=0;i<n;i++)pq.add(new Pair(power[i],bonus[i]));
       int defeat=0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(initialPower>=curr.power) {
                initialPower += curr.bonus;
                defeat++;
            }
        }
        System.out.println(defeat);
    }
}
// 100
// 101 100 304
// 100 1   524