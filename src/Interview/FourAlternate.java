package Interview;

import java.util.Scanner;

public class FourAlternate {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number of Rows:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int curr_num=1;
        int prev = 1;
        int dp[][] = new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j<i+1){
                    dp[i][j] = curr_num;
                    int temp = curr_num;
                    curr_num += prev;
                    prev = temp;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){

            }
        }
    }
}
