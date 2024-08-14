package ALgos;

import java.util.Arrays;

public class MergSort {
    public static void main(String[] args) {
        int[] arr ={200,16,80,4,45,1,2,3,-21,21,200};
         arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)return arr;

        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    public static int[] merge(int[] left,int[] right){
        int[] arr = new int[left.length+right.length];
        int i=0;
        int j=0;
        int ind=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j])arr[ind++] = left[i++];
            else arr[ind++] = right[j++];
        }
        while(i<left.length){
            arr[ind++] = left[i++];
        }
        while(j<right.length){
            arr[ind++] = right[j++];
        }
        return arr;
    }
}
