package OOPS.Polymorphism;

public class shapes {
    int l,b,h;
    shapes(int l,int b,int h){
        this.l=l;
        this.h=h;
        this.b=b;
    }
    public int area(){
        return l*b;
    }
    public void area(int a){
        System.out.println("a*b"+a*b);
    }
}
