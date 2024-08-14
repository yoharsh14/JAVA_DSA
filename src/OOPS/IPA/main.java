package OOPS.IPA;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Associate[] arr =new Associate[size];
        for(int i=0;i<size;i++){
            int id = sc.nextInt();
            String name = sc.nextLine();
            double score = sc.nextDouble();
            int exp = sc.nextInt();
            arr[i] = new Associate(id,name,score,exp);
        }
        double score = sc.nextDouble();
        System.out.println();
        Associate user1 = searchAssociateByScore(arr,score);

    }
    public static Associate searchAssociateByScore(Associate[] arr,double score){
        int cnt = 0;
        int ind =0;
        Associate ans = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getScores()==score){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static Associate findAssociateWithMaxExperience(Associate[] arr){
        double max_val = Integer.MAX_VALUE;
        int ind =-1 ;
        for(int i=0;i<arr.length;i++){
            if(max_val<arr[i].getScores()){
                max_val = arr[i].getScores();
                ind = i;
            }
        }
        if(ind==-1)return null;
        else return arr[ind];
    }
}
