package CodeVita;
import java.util.*;

public class nine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int[] enter = new int[time];
        int[] leave = new int[time];
        for(int i=0;i<time;i++){
            enter[i] = sc.nextInt();
        }
        for(int i=0;i<time;i++){
            leave[i] = sc.nextInt();
        }
        int maxTotalGuest=0;
        int totalGuest=0;
        for(int i=0;i<time;i++){
            totalGuest += enter[i]-leave[i];
            if(maxTotalGuest<totalGuest){
                maxTotalGuest = totalGuest;
            }
        }
        System.out.println(maxTotalGuest);
    }
}
