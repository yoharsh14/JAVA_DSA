package CodeVita;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_el=0;
        String sArr[] = (sc.nextLine().split(" "));
        int[] arr = new int[sArr.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(sArr[i]);
        }
        int max=-1;
        for(int i:arr){
            if(i>max)max_el++;
            max = Math.max(max,i);
        }
        System.out.println(max_el);
    }
}
