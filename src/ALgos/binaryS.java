package ALgos;

public class binaryS {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,9,10};
        int tar = 9;
      int a = bi(arr,0,arr.length-1,tar);
        System.out.println(a);
    }
    static int bi(int[] num,int low,int high,int target){
      if(high<=low)
          return -1;
      int mid = low +(high-low)/2;
      if(num[mid]==target)
          return mid;
      if(num[mid]<target)
          return bi(num,mid+1,high,target);
      return bi(num,low,mid-1,target);
    }
}
