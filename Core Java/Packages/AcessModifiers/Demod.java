package Packages;
public class Demod{
    public static void main(String[] args) {
        A obj = new A();

        System.out.println("A class"+ obj.marks);
         System.out.println("A class"+ obj.rollno);
        B obj1 = new B();
        obj1.show();
        obj1.show1();
        System.out.println("B class "+obj1.marks);
         System.out.println("B class"+ obj1.rollno);

    }
}