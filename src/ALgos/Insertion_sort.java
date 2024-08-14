package ALgos;

public class Insertion_sort {

    public static void main(String[] args) {
        int[] arr = {9,5,7,9,1,2,36,5,2,1};
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
            arr[j+1] = key;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
