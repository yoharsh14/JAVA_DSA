package CodeVita;

import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        if(weight<0|| weight>7000) System.out.println("INVALID INPUT");
        else{
            if(weight==0) System.out.println("Time Estimated: 0 minutes");
           if(weight<=2000&&weight>0) System.out.println("Time Estimated: 25 minutes");
           else if(weight<=4000) System.out.println("Time Estimated: 35 minutes");
           else System.out.println("Time Estimated: 45 minutes");
        }
    }
}
