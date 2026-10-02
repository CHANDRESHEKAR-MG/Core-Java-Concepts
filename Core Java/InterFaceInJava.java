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


// need of interface is to achieve multiple inheritance in java bcz a class can implement multiple interfaces but a class can extend only one class
// class laptop extends Computer{
//     public void code(){
//         System.out.println("coding in laptop");
//     }
// }

// //
// class developer {
//     public void devApp(Computer c){//here l is the obj of laptop class and we are passing the object of laptop class to the method of developer class
//     //no need to create the object of laptop class in main method and pass it to the method of developer class bcz we are passing the object of laptop class to the method of developer class
//     //passing the object of laptop class to the method of developer class
//     //this is called dependency injection
//     //this is called loose coupling bcz the developer class is not dependent on the laptop class
//     //laptop class is passed as a parameter to the method of developer class

//         c.code();
//         System.out.println("developing the application");
//     }
// }
// class tester extends developer{ 
//     public void testApp(developer  dev){
//         //System.out.println("testing the application");
//      //passing the object of laptop class to the method of tester class
//     //this is called dependency injection
//     //this is called loose coupling bcz the tester class is not dependent on the laptop class
//     //laptop class is passed as a parameter to the method of tester class

//         // dev.devApp(new laptop ());
//         // dev.devApp(new Desktop());

//         System.out.println("testing the application");
//     }
// }

// class Desktop extends Computer{
//     // public void desk(developer dev){
//     //     dev.devApp(new laptop());
//     // }

//     public void code(){
//         System.out.println("coding in desktop fatserr ");
//     }

// }

// // we have 2 option for deeloper to work on laptop or desktop but we are giving the laptop to the developer to work on it but now we are giving the desktop to the developer to work on it  he dont know the working of desktop  
// //so we acn create the computer class and extends the both computer class and then we can pass the computer class reference and subclass objects  to the developer class method and then we can use the computer class object to work on it
//     abstract class Computer{
//     // public void code(){
//     //no need any printing bcz this is a parent class and we are not creating the object of this class so no need to print anything in sub class as per the developer need 
//     // so implementation we can make this method and class as abstract class and methods 
//     // }
//     public abstract void code();
//     public void start(){
//         System.out.println("computer is started");
//     }
    
// }





// to overcome from above extends computer and making abstract to calss and methods we can make interface as computer and
// then we can implement the interface in both laptop and desktop class and then we can pass the interface reference and subclass objects to the developer class method and then we can use the interface reference to work on i

class laptop implements Computer{
    public void code(){
        System.out.println("coding in laptop");
    }
}
class developer {
    public void devApp(Computer c){
        c.code();
        System.out.println("developing the application");
    }
}
class tester extends developer{ 
    public void testApp(developer  dev){
   dev.devApp(new laptop());
   dev.devApp(new Desktop());
   System.out.println("Testing the application");

    }
    
}

class Desktop implements Computer
{
    public void code(){
        System.out.println("coding in desktop fatserr ");
    }

}

interface  Computer
{
    public abstract void code();
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



    //      laptop lap = new laptop();
        developer chandu = new developer();
    //      chandu.devApp(lap );
    //     // tester test = new tester();
    //     Desktop desk = new Desktop();
    //   //  chandu.devApp(desk); // here t=we are giving the desktop to the developer to work vurt h was devloping the application using the laptop only but now we are giving the desktop to the developer to work on it  he dont know the working of desktop 
    //     //so he will not be able to work on it so we need to create a new method in developer class that will take the desktop as a parameter and then we can use the desktop to work on it

        Computer comp = new laptop();
        chandu.devApp(comp); // here we are passing the computer class reference and subclass objects
        Computer comp1 = new Desktop();
        chandu.devApp(comp1); // here we are passing the computer class reference and subclass objects
        //so we can use the computer class object to work on it and we can pass
        tester test = new tester();
        test.testApp(chandu); // here we are passing the developer class object to the tester class method and then we can use the developer class object to work on it
        //so we can use the developer class object to work on it and we can pass the developer class object to the
       // comp.start();
       // comp1.start();

    }
}