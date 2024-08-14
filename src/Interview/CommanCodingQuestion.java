package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class CommanCodingQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortString(s);
    }
    public static void removeAllCharacterOtherThanAlphabets(String s){
      s= s.replaceAll("[0-9]","");
      s = s.replaceAll("[-+.^:,';!@#$%&*()-_=?/><{}]","");
        System.out.println(s);
    }
    public static void reverseAString(String s){
        StringBuilder sc = new StringBuilder(s);
        sc.reverse();
        System.out.println(sc);
        String ans ="";
        for(int i=s.length()-1;i>=0;i--){
            ans = ans+s.charAt(i);
        }
        System.out.println(ans);
    }
    public static void CaptalizeFirstAndLastChar(String s){
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        s=s.replace(first,Character.toUpperCase(first));
        s=s.replace(last,Character.toUpperCase(last));
        System.out.println(s);
    }
    static int[] a;
    public static  void sortString(String s){
        s.toLowerCase();
        String[] arr = s.split("");
       a = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            a[i] = (int) (arr[i].charAt(0));
        }
        mergeSort(0,a.length-1);
        String ans = "";
        for(int i=0;i<a.length;i++){
            char c = (char)(a[i]);
            ans = ans+c;
        }
        System.out.println(ans);
    }
    public static void mergeSort(int lo,int hi){
        if(lo>=hi)return;
        int mid = lo+(hi-lo)/2;
        mergeSort(lo,mid);
        mergeSort(mid+1,hi);

        merge(lo,mid,hi);
    }
    public static void merge(int lo,int mid,int hi){
        int n =mid-lo+1;
        int m = hi-mid;
        int left[] = new int[n];
        int right[] =new int[m];
        int l=0,r=0,ind=lo;
        for(int i=0;i<n;i++){
            left[i]=a[i+lo];
        }
        for(int i=0;i<m;i++){
            right[i] = a[i+mid+1];
        }
        while(l<n&&r<m&&ind<a.length){
            if(left[l]<right[r]){
                a[ind++] = left[l++];
            }
            else a[ind++] = right[r++];
        }
        while(l<n&&ind<a.length){
            a[ind++] = left[l++];
        }
        while(r<m&&ind<a.length){
            a[ind++] = right[r++];
        }
    }
}
