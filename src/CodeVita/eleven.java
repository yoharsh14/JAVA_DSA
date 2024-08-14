package CodeVita;
import java.util.*;
public class eleven {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int num_candies = sc.nextInt();
        int N = 10;
        int K = 5;
        if(N-num_candies<K) System.out.println("INVALID INPUT");
        else {
            if(num_candies>0)
            System.out.println("NUMBER OF CANDIES SOLD:"+num_candies);
            else System.out.println("INVALID INPUT NUMBER OF");
            System.out.println("NUMBER OF CANDIES AVAILABLE:"+(N-num_candies));
        }
    }
}
