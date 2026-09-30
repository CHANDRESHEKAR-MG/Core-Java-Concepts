// Upcasting vs Downcasting
// 	Upcasting	Downcasting
// Direction	Child → Parent	Parent → Child
// Example	A obj = new B();	B obj1 = (B)obj;
// Explicit cast?	❌ Not required	✅ Required
// Generally	Safe	Can cause ClassCastException


class A {
    public void show(){
        System.out.println("in a show");
    }

}
class B extends A {
    public void show1(){
        System.out.println("in b show");
    }
}


public class DownAndUpCasting {
    public static void main(String[] args){  

        // upcast 

// A obj = new B();
// │       │
// │       └── Actual object = B
// └────────── Reference type = A

        A obj2 = (A) new B(); // useing the Parent class in a child class with parent class reference 
           //or
          // A obj2 = new B();
        obj2.show();

        //DOWN CAST
//  A obj  = new B();
// │       │
// │       └── B object
// └────────── A reference


// obj is an A reference, but the actual object is B.

// Because obj is an A reference, you can directly call only methods visible through

        A obj = new B();

        obj.show();     // ✅
        //obj.show1();       // ❌ bc refernce is A but actual object is class B
        //Downcasting

////To access B's methods:

        B obj3 = (B) obj;
        //B obj3 = (B) obj2; //
        obj3.show1();


        //A obj = new A();

        // A obj1=new B();
        // obj1.show();
        // obj1.show1();
        // obj.show();

        // B obj1=new B();
        // obj1.show();
        // obj1.show1();
        // obj.show();

        double d=4.3;
        //int i =d;//loss of data from up to down possible by only by lost data .value will losss
        int i =(int)d;//data loss possible from d=4.5 to 4
        System.out.println(d);
        System.out.println(i);

    }
}



