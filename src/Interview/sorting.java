package Interview;

import java.util.Scanner;

public class sorting {
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex= i,minel = arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[j]<minel){
                    minel = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        while(num>0){
            num--;
            arr[num] = sc.nextInt();
        }
        // insertion Sort
//        insertion(arr);

        //selection sort
        selection(arr);
        for(int i:arr) System.out.print(i+"  ");
    }
}
