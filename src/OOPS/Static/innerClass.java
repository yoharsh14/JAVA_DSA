package OOPS.Static;


public class innerClass {
    static class test{
        static String name;
        test(String name) {
            this.name = name;
        }
        public String fun(){
            return name;
        }
    }
    public static void main(String[] args) {
        test c = new test("harsh");
        test a = new test("qwer");
        System.out.println(c.name);
//        System.out.println(c.fun());
//        System.out.println(a.fun());
//        test j = new test("harsh");
    }
}