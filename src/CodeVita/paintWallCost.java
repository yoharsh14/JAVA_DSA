package CodeVita;

import java.util.Scanner;

public class paintWallCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num_in = sc.nextFloat();
        float num_ext = sc.nextFloat();
        float surfaceAreaOfInt = 0;
        float surfaceAreaOfExt = 0;
        for(int i=0;i<num_in;i++)surfaceAreaOfInt+=sc.nextFloat();
        for(int i=0;i<num_ext;i++)surfaceAreaOfExt+=sc.nextFloat();
        double res = surfaceAreaOfExt*12.0+surfaceAreaOfInt*18.0;
        System.out.printf("Total estimated Cost:%.1f INR",res);
    }
}
