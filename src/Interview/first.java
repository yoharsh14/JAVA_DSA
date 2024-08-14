package Interview;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array in single line: ");
        String[] strArr = sc.nextLine().split(" ");
        int arr[] = new int[strArr.length];
        int zero=0;
        int size = arr.length;
        for(int i=0;i<size;i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            if(arr[i]==0)zero++;
        }
        int ans[] = new int[size];
        int counter=zero,last=0;
        for(int i:arr){
            if(i!=0){
                ans[counter++] = i;
            }
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}


