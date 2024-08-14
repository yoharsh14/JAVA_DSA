package Interview;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number of Rows:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int curr_num=1;
        int prev = 1;
        int sizeOfNum = 1;
        int space = 2;
        if(row>=4){
            int temp = space*row;
            temp+=row-1;
            space = temp;
            sizeOfNum=3;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<space;j++) System.out.print(" ");
            space-=(sizeOfNum);
            for(int j=0;j<i+1;j++){
                System.out.print(curr_num+" ");
                int temp = curr_num;
                curr_num += prev;
                prev = temp;
            }
            System.out.println("");
        }
    }
}

//Select name from Products as p
// join Product_Category as pc
// on p.P_ID = pc.P_ID
// join Category as c
// on c.CAT_ID = pc.CAT_ID
// where c.CAT_NAME = 'Mobile'

//Select name from Products as p
// join Product_Category as pc
// on p.P_ID = pc.P_ID
// join Category as c
// on c.CAT_ID = pc.CAT_ID
// where count(*) >=2
// group by c.CAT_ID
