//Interface in java is a blueprint of a class.
// It has static constants and abstract methods. 
//The interface in java is a mechanism to achieve abstraction. 
//There can be only abstract methods in the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.
//in abstarct class we could have both method body and abstract method 
//but in interface we can only have abstract method and no method body
//An interface is not a class, it is a collection of abstract methods and constants.
//An interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
//An interface is a completely "abstract class" that is used to group related methods with empty bodies.

interface Vehicle{//interface is a collection of abstract methods and constants
    void start();//abstract method is a method that is declared without an implementation
    void stop();
    void milage();
    //int model=100//interface can have only static and final variables
    static String CarName="BMW";
    final  int model = 100; //interface can have only static and final variables
}
//here we can achieve multiple inheritance in java using interface bcz a class can implement multiple interfaces but a class can extend only one class
//abstarct method can be achive 2 ways to implemnts the method body
//1) by creating a new class that implements the interface and provide the implementation of the abstract methods
//2) by creating an anonymous inner class that implements the interface and provide the implementation of the abstract methods



//interface could support multiple inheritance but class can not support multiple inheritance in java
interface Engine{
    void start1();
    
}
//interface can extend another interface but class can not extend interface class only implements interface interfae

interface  Brake extends Engine{
    void applyBrake();

}

class Car implements Vehicle, Brake{
    
    //class that implements the interface must implement all the abstract methods of the interface

    public void start() {
        System.out.println("Car is started implents method body");
    }
    public void start1() {
        System.out.println("Car engine  1 is started implents method body");
    }
    public void stop() {
        System.out.println("Car is stopped implents method body");
    }
    public void milage(){
        System.out.println("50 kmpl implents method body");
    }
    public void applyBrake(){
        System.out.println("Brake is applied");
    }
}


class InterFaceInJava{
    public static void main(String [] args){
        
        // Vehicle obj = new Vehicle(){//Anonymous inner class is a class that is defined and instantiated in a single statement
        //     public void start() { 
        //     //it also help for interface bcz inition of abstract method can be done at object level using anonymous inner class
        //     //no need to create a new class to implement the abstract method of the interface
        //         System.out.println("Vehicle is started using anonymous inner class");
        //     }   
        //     public void stop(){
        //         System.out.println("Vehicle is stopped using anonymous inner class");
        //     }
        //     public void milage(){
        //         System.out.println("50 kmpl using anonymous inner class");
        //     }
        //     public void start1(){
        //         System.out.println("Vehicle engine 1 is started using anonymous inner class");
        //     }
        // };

       Car obj = new Car();
        obj.start();
        obj.stop();
        obj.milage();
        obj.start1();
        obj.applyBrake();
        //no need to createthe obj for static variable
        System.out.println(Vehicle.CarName);
        System.out.println(Vehicle.model);

    }
}