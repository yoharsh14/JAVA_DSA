package OOPS.Static;

public class Car {
    static class Test{
        static String name;
        public Test(String name) {
            this.name = name;
        }
        public String getName(){return this.name;}
    }
    String s;
    Test tst;
    public Car(String s){
        this.s = s;
        tst = new Test(s);
    }
    public void printA(){
        System.out.println();
    }
    public static void main(String[] args) {

    }

}
class h extends  Car{
    public h(String s){
        super(s);
    }
    public static void main(String[] args) {
        Car c = new h("kikicha");
    c.printA();
    }
    @Override
    public void printA(){
        System.out.println("harsh");
    }
}