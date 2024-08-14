package CodeVita;

public class Conversion {
    public static void BinaryToDecimal(String binary){
        int ans = 0;
        int power = 0;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='1')ans += (int)(Math.pow(2,power));
            power++;
        }
        System.out.println(ans);
    }
    public static void BinaryToOCtal(String binary){
        int ans = 0;
        if(binary.length()%3==1) {
            binary = "00" + binary;
        }else if(binary.length()%3==2) {
            binary = "0" + binary;
        }
        String octal = "";
        int i = binary.length()-1;
        while(i>0){
            int val =0;
            val += (int)((binary.charAt(i)-'0')*1);
            val += (int)(binary.charAt(i-1)-'0')*2;
            val += (int)(binary.charAt(i-2)-'0')*4;
            octal = Integer.toString(val)+octal;
            i-=3;
        }
        System.out.println(octal);
    }
    public static void DecimalToBinary(int num){
        int[] binary = new int[32];
        int i=0;
//        while(num>0){
//        binary[i++] = num%2;
//        num/=2;
//        }
        String ans = "";
        while(num>0){
              ans = Integer.toString(1&num)+ans;
              num = num>>1;
        }
//        for(i=0;i<32;i++)ans = ans+Integer.toString(binary[i]);
        System.out.println(ans);

    }

    public static void main(String[] args) {
//        BinaryToDecimal("1010");
//        BinaryToOCtal("1100110");
        DecimalToBinary(10);
    }
}
// 1 + 4+16
//
// 31
// 0 0 1 1 1