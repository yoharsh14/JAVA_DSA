package ALgos;

public class fibona {
    public static void main(String[] args) {
       int sum= fibo(4);
        System.out.println(sum);
    }
    static int fibo(int num){
        if(num<2)
            return num;
        return fibo(num-1)+fibo(num-2);
    }
}