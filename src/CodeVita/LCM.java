package CodeVita;

public class LCM {
    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public static int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public static void main(String[] args) {

    }
}
