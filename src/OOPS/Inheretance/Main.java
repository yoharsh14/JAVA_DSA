package OOPS.Inheretance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.h+" "+box.l+" "+box.w);
        Box box1 = new Box(4);
        System.out.println(box1.h+" "+box1.l+" "+box1.w);
        Box box2 = new Box(1,2,3);
        System.out.println(box2.h+" "+box2.l+" "+box2.w);
        Box box3 = new Box(box2);
        System.out.println(box3.h+" "+box3.l+" "+box3.w);
        BoxWeight box4 = new BoxWeight();
        System.out.println(box4.h+""+box4.weight);
        BoxWeight box5 = new BoxWeight(1,2,3,4);
        System.out.println(box4.l+""+box4.h+""+box4.w+""+box4.weight);


        //something intresting

        Box box6 = new BoxWeight(1,2,4,5);
//      ******System.out.println(box6.weight);*****
        //here the refrence variable is of Box type and the object is of BoxWeight type
        // Box type doesnt know about the weight variable so we cannot access it
        // we will only be able to access those variable that are delacred in super class only
        // type of the ref. variable that determines that what variables can be accessed

//        BoxWeight box7 = new Box(1,2,3);
        //here the ref variable is of type BoxWeight
        //We are refrenceing the parent object from child variable
        //there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        //hence, you should have access to weight variable
//        *****System.out.println(box7.weight);****
        // this also means, that the ones you are trying to access should be initialized
        // but here , when obj. itself is of type parent class, how will you call the constructor of the child class

    }
}
