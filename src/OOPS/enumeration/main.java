package OOPS.enumeration;


enum main{
    INSTQANCE;
    static class A{

        public String main() {
            System.out.println("hello world");
            return "hfdls";
        }
        public static void main(String[] args){
           for(String i:args)
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.main(new String[]{"asd"});
    }
}
