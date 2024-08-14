package CodeVita;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_vehicle = sc.nextInt();
        int num_wheels = sc.nextInt();
        if(num_wheels<2||num_wheels%2!=0||num_wheels<num_vehicle) System.out.println("INVALID INPUT");
        else{
            int num_car = (num_wheels-2*num_vehicle)/2;
            int num_bike = num_vehicle-num_car;
            System.out.println("TW="+num_bike+" FW="+num_car);
        }
    }
}
