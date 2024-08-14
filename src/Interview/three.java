package Interview;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int numZeros = 0;
        int digit[] = new int[4];
        if (Integer.toString(num).length() > 4) System.out.println("Please provide 4 digit number");
        else {

            for (int i = 0; i < 4; i++) {
                int val = num % 10;
                digit[i] = val;
                num /= 10;
                if (val == 0) numZeros++;
            }
            if (numZeros == 3) {
                System.out.println("Highest Number Possible - " + n);
                System.out.println("Lowest Number Possible - " + n);
            } else {

                Arrays.sort(digit);
                String highest = "", lowest = "";
                for (int i = 3; i >= 0; i--) {
                    highest = highest + Integer.toString(digit[i]);
                }
                while (numZeros-- > 0) lowest += "0";
                if (lowest.length() == 0) {
                    for (int i = 0; i < 4; i++) lowest = lowest + Integer.toString(digit[i]);
                } else if (lowest.length() == 1) {
                    lowest = Integer.toString(digit[1]) + lowest;
                    lowest = lowest + Integer.toString(digit[2]);
                    lowest = lowest + Integer.toString(digit[3]);
                } else if (lowest.length() == 2) {
                    lowest = Integer.toString(digit[2]) + lowest;
                    lowest = lowest + Integer.toString(digit[3]);
                } else if (lowest.length() == 3) {
                    lowest = lowest + Integer.toString(digit[3]);
                }
                System.out.println("Highest Number Possible - " + highest);
                System.out.println("Lowest Number Possible - " + lowest);
            }
        }
    }
}
