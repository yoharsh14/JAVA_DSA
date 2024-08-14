package CodeVita;

import java.util.HashMap;
import java.util.Scanner;

public class  AllQue {
    public static  void baseSeventeen(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",11);
        map.put("C",12);
        map.put("D",13);
        map.put("E",14);
        map.put("F",15);
        map.put("G",16);
        int power=  0;
        int ans = 0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c))ans += map.get(Character.toString(c))*(int)(Math.pow(17,power));
            else ans += (int)(c-'0')*(int)(Math.pow(17,power));
            power++;
        }
        System.out.println(ans);
    }
    public static void primePosNum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0||num==1) System.out.println("No");
        else{
            boolean isPrime = true;
            for(int i=2;i*i<num;i++){
                if(num%i==0)isPrime=false;
            }
            if(isPrime) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public static void OddEvenSeries(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            int nMinus = n-2;
            System.out.println(nMinus/2);
        }else System.out.println((n-1));
    }
    public static void diffOfSumOfOddAndEvenDigits(){
        int oddSum=0;
        int evenSum=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            int val = num%10;
            if(val%2==0)evenSum+=val;
            else oddSum+=val;
            num/=10;
        }
        int ans = Math.max(oddSum,evenSum)-Math.min(oddSum,evenSum);
        System.out.println(ans);
    }
    public static void GMSoddEven(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int oddD = 2;
        int evenD = 3;
        if(n%2==0){
            n/=2;
            n--;
            System.out.println((int)Math.pow(evenD,n));
        }
        else{
            n/=2;
            System.out.println((int)Math.pow(oddD,n));
        }
    }
    public static void MonkeyBanana(){
        Scanner sc = new Scanner(System.in);
        int total_monkey = sc.nextInt();
        int banana_limit = sc.nextInt();
        int penut_limit = sc.nextInt();
        int avail_Banana = sc.nextInt();
        int avail_penut = sc.nextInt();
        if(banana_limit<=0||penut_limit<=0){
            System.out.println("Invalid Input");
        }else{

        while((avail_penut-penut_limit)>=0&&total_monkey>0){
            total_monkey--;
            avail_penut-=penut_limit;
        }
        while((avail_Banana-banana_limit)>=0&&total_monkey>0){
            total_monkey--;
            avail_Banana-=banana_limit;
        }
        if((avail_Banana>0||avail_penut>0)&&total_monkey>0)total_monkey--;
        System.out.println(total_monkey);
        }
    }
    public static void comission(){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String[]> map = new HashMap<>();
        while(sc.hasNextLine()){
        String s = sc.nextLine();
        String hasChild = sc.nextLine();
        if(hasChild.equals("N"))break;
        else{
            String first = sc.nextLine();
            String second = "";
            if(sc.hasNextLine())second = sc.nextLine();
            map.put(s,new String[]{first,second});
        }
        }
    }
    public static void main(String[] args) {
//        baseSeventeen();
//        primePosNum();
//        OddEvenSeries();
//        diffOfSumOfOddAndEvenDigits();
//    GMSoddEven();
//        MonkeyBanana();
    comission();
    }
}
