package CodeVita;
import java.util.*;
public class twelve {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int t1 = 0;
            int t2 = 0;
            int t3 = 0;
            boolean valid = true;
            int arr[] = new int[9];
            for(int i=0;i<9;i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < 9; i+=3) {
                if ( arr[i]> 100 || arr[i+1] > 100 || arr[i+2] > 100) valid = false;
                t1 += arr[i];
                t2 += arr[i+1];
                t3 += arr[i+2];
            }
            if (!valid) System.out.println("INVALID INPUT");
            t1 /= 3;
            t2 /= 3;
            t3 /= 3;
            if (t1 < 70 && t2 < 70 && t3 < 70) System.out.println("All trainees are unfit");
            else {
                if(t1>=t2&&t1>=t3) System.out.println("Trainee Number: 1");
                if(t2>=t1&&t2>=t3)System.out.println("Trainee Number: 2");
                if(t3>=t1&&t3>=t2)System.out.println("Trainee Number: 3");
            }
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
}
