package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array in single line: ");
        HashSet<String> set = new HashSet<>();
        String[] arrS = sc.nextLine().split(" ");
//        for(int i=0;i<arrS.length;i++)set.add(arrS[i]);
        int size = arrS.length;
        int[] arr = new int[size];
        for(int i=0;i<arrS.length;i++)arr[i] = Integer.parseInt(arrS[i]);
        int startOfLargestSeq =0,endOfLargestSeq=0;
        int largestSize = 0;
        int ind=0;
        while(ind<size){
            int num = arr[ind];
            int counter = ind+1;
            while(counter<size&&num==arr[counter]-1){
                num = arr[counter];
                counter++;
            }
            if(counter-ind>largestSize) {
                startOfLargestSeq = ind;
                endOfLargestSeq = counter;
                largestSize = counter-ind;
            }
            ind = counter-1;
            ind++;
//            System.out.println(i);
        }
        for(int i=startOfLargestSeq;i<endOfLargestSeq;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
// 2 10 45 46 47 48 20 21 23 50 23 100 101 102