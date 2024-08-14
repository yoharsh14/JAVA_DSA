package Interview;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int row = sc.nextInt();
        int spaceSize=row;
        int col = 1;
        int number=1,starCount=0;
        for(int j=0;j<spaceSize;j++) System.out.print(" ");
        spaceSize-=2;
        System.out.println(number++);
        for(int i=1;i<row;i++){
            for(int j=0;j<spaceSize;j++) System.out.print(" ");
            spaceSize-=1;
            System.out.print(number);
            number++;
            for(int j=0;j<=starCount/2;j++){
                System.out.print("*");
            }
            System.out.print(number);
            number++;
            for(int j=0;j<=starCount/2;j++){
                System.out.print("*");
            }
            System.out.print(number);
            number++;
            System.out.println();
            starCount+=2;

        }
    }
}
