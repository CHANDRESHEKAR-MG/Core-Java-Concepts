//@deprecated // this annotation is used to indicate that the marked element is deprecated and should no longer be used. It serves as a warning to developers that the element may be removed in future versions of the code.
class A{
  
    public void showTheDataWhichBelongdToThisClass(){
    System.out.println("A show");

}
}
class B extends A{

    @Override  // to avoid mistakes we can use @Override annotation to avoid this kind of mistakes   
    public void showTheDataWhichBelongdToThisClass(){//sometimes the long method names are not give wrong answers like  it will give answers of parent class methods because of the long method name so to avoid this we can use @Override annotation to avoid this kind of mistakes
        System.out.println("B show");
    }

}


//types of interface in annotations
//1. Marker interface: An interface with no methods or fields, used to mark a class
//2. Functional interface: An interface with a single abstract method, used for lambda expressions
//3. Normal interface: An interface with one or more abstract methods, used to define a contract for implementing classes
//4. Default interface: An interface with default methods, which provide a default implementation for the method
//5. Static interface: An interface with static methods, which can be called without an instance of the interface
//6. Nested interface: An interface defined within another interface or class, used to group related interfaces together

//1. Normal Interface

//An interface can contain abstract methods, default methods, static methods, etc.

interface Vehicle {
    void start();
}

//Implementation:

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}


//2. Functional Interface ⭐

///An interface with exactly one abstract method.

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
@FunctionalInterface
interface n{
    void show1(int i);
}
//@FunctionalInterface //tells the compiler that the interface must have exactly one abstract method.
class Annotations{
    public void show(){
        System.out.println("Annotations show");
    }
    public static void main (String[] args){

    B b = new B();
    b.showTheDataWhichBelongdToThisClass();
    Car c = new Car ();
    c.start();
    Calculator c1 = (a, e) -> a + e;  //is a short way of saying:

    //or

    
//     Calculator c = new Calculator() {
//     @Override
//     public int add(int a, int b) {
//         return a + b;
//     }
// };
//"When add() is called, take a and b and return a + b."
    System.out.println(c1.add(10, 20));

   n obj = i->System.err.println("in show in "+i);
//  n obj = new n() 
//     {
//         public void show1(int i){
//             System.out.println("in B show " + i);
//         }
//     };
    obj.show1(5);
    }
}