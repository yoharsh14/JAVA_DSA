package Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    static class Person{
        String name;
        int age;
        int fair;
        public Person(String name,int age,int fair){
            this.age = age;
            this.name = name;
            this.fair = fair;
        }
    }
    public static int fairForPerson(int age){
        if(age<=2)return 0;
        else if(age>2&&age<18)return 100;
        else if(age>=18&&age<60)return 500;
        else return 300;
    }
    public static ArrayList<Person> ticketPersson(Scanner sc){
        ArrayList<Person> arr = new ArrayList<>();
        int i=0;
        System.out.print("How many guest you want to enter: ");
        int n = sc.nextInt();
        while(i<n){
            System.out.println("enter the details of guest "+(i+1));
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            int fair = fairForPerson(age);
            Person temp = new Person(name,age,fair);
            arr.add(temp);
            i++;
        }
        return arr;
    }
    public static void printTicket(ArrayList<Person> guest){
        int totalfair = 0;
        for (int i=0;i<50;i++) System.out.print("*");
        System.out.println("TICKET OF THE GUEST");
        for(int i=0;i<guest.size();i++){
            System.out.print("Guest"+(i+1)+": ");
            System.out.print(guest.get(i).name+",");
            System.out.print("("+guest.get(i).age+"). ");
            System.out.println("Fair: "+guest.get(i).fair);
            totalfair+=guest.get(i).fair;
        }
        System.out.println("TOTAL FAIR: "+totalfair);
        for (int i=0;i<50;i++) System.out.print("*");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ZOO TICKETING SOFTWARE");
        Scanner sc = new Scanner(System.in);
        // prompt "start" to Start the program
        String command = "add";
        while(command.equals("add")){
                ArrayList<Person> persons = ticketPersson(sc);
                printTicket(persons);
            System.out.print("If you want to another group of guest type \"add\" else type \"close\": ");
            command = sc.next();
        }

        System.out.println("Thankyou for using Ticketing software");
    }
}
