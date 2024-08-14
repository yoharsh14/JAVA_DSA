package CodeVita;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sr = sc.nextLine().split(" ");
        int[] ar = new int[sr.length];
        for(int i=0;i<sr.length;i++)ar[i] = Integer.parseInt(sr[i]);
//        int[] ans = mergeSort(ar);
//            quickSort(ar,0,ar.length-1);
        selectionSort(ar);
        for (int i:ar) System.out.print(i+" ");

    }
    public static void quickSort(int[] arr,int low,int hi){
        if(low>hi)return;
        int s = low,e=hi;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(pivot>arr[s])s++;
            while(pivot<arr[e])e--;
            if(s<=e) {
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,hi);
    }

    public static  void selectionSort(int[] array){
    int i=1;
    while (i<array.length){
       int key = array[i];
       int j = i-1;
       while(j>=0&&array[j]>key){
           array[j+1] = array[j];
           j--;
       }
       array[j+1] = key;
        i++;
    }
    }
    public static void insertionSort(int[] array){

        for(int i=0;i<array.length;i++){
            int j = i;
            int minIndex = j;
            while(j<array.length){
                if(array[minIndex]>array[j]){
                    minIndex = j;
                }
                j++;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static int[] mergeSort(int[] array){
        if(array.length==1)return array;
            int mid = array.length / 2;
            int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
            int[] right = mergeSort(Arrays.copyOfRange(array,mid,array.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int ind=0, i=0,j=0;
        int[] ans = new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                ans[ind] = left[i++];
            }else{
                ans[ind] = right[j++];
            }
            ind++;
        }
        while(i<left.length){
            ans[ind++] =  left[i++];
        }
        while (j<right.length)ans[ind++] = right[j++];
        return ans;
    }
}
