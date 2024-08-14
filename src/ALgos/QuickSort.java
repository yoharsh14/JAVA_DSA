package ALgos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {20,5,10,1,4,6,7,9,15};
        sort(a,0,a.length-1);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
   public static  void sort(int[] arr,int start,int end){
        if(start>end)return;
        int lo = start;
        int hi = end;
        int middle = start+(end-start)/2;
        int pivot = arr[middle];
        while(lo<=hi){
            while(lo<=hi&&pivot>arr[lo])lo++;
            while(lo<=hi&&pivot<arr[hi])hi--;
            if(lo<=hi){
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                lo++;
                hi--;
            }
        }
        sort(arr,start,hi);
        sort(arr,lo,end);
   }
}
