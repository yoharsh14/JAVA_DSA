package Interview;

import java.util.Scanner;

public class AlternateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        int posPtr = -1,negPtr = -1;
        for(int i=0;i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
            if(posPtr==-1&&arr[i]>0)posPtr=i;
            if(negPtr==-1&&arr[i]<0)negPtr=i;
        }
        int[] ans = new int[arr.length];
        int ind = 0;
        while(posPtr<arr.length||negPtr<arr.length){
            if(posPtr<arr.length&&arr[posPtr]>0)ans[ind++] = arr[posPtr];
            if(negPtr<arr.length&&arr[negPtr]<0)ans[ind++] = arr[negPtr];
            while(++posPtr<arr.length&&arr[posPtr]<0);
            while(++negPtr<arr.length&&arr[negPtr]>0);
        }
        for(int i:ans)
        System.out.println(i);
    }
}
