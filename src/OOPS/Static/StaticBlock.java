package OOPS.Static;

import java.io.PrintStream;

class main {
     public static void main(String[] args) {
         System.out.println("hello world!");
        int sum = key.sum(12,21);
         System.out.println(sum);
     }

    }

enum key{
    INSTANCE;
    public static int sum(int a,int b){return a+b;}
}