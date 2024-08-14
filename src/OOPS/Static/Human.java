package OOPS.Static;

public class Human {
    int age;
    String name;
    boolean married;
    static int population;
    Human(int age,String name,boolean married){
        this.age = age;
        this.name = name;
        this.married = married;
        population+=1;
    }
}
