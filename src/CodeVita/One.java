package CodeVita;

import java.util.Scanner;

public class One {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String[] strArr = day.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid < hi) {
            if (arr[mid] == 0) {
                swap(arr, mid, lo);
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
        for (int i : arr) System.out.print(i + " ");
    }
}
