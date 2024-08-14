package ALgos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Handler;

class  HEAP{
    static int[] arr;
    public static void max_heapify(int[] arr,int i){
        int L = i*2+1;
        int R = i*2+2;
        int temp = 0;
        int largest = i;
        if(L<arr.length&&arr[i]<arr[L])
            largest = L;
        else if(R<arr.length&&arr[R]>arr[largest])
            largest = R;
        if(largest!=i){
            temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
        }
        max_heapify(arr,largest);
    }
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("enter number of elements you want to entere: ");
        int num = Integer.parseInt(br.readLine());
        arr= new int[num];
        for(int i=0;i<num;i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        max_heapify(arr,0);
        System.out.println("After max_heapify: ");
        for(int i:arr)
        System.out.println(i);
    }

}

