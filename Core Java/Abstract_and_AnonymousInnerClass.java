abstract class Car {
    public abstract void drive();// abstract method is a method that is declared without an implementation
    //this implementation can be done at extended class level 
    // and aslso can be done at object class level using anonymous inner class
    //declare object of obstract class and below that object write method with initializtion with block 

    public void stop() {
        System.out.println("Car is stopped");
    }
}
// class BMW extends Car {
//     public void drive() {
//         System.out.println("BMW is driving");
//     }
// }

public class Abstract_and_AnonymousInnerClass{
    public static void main(String[] args) {
        Car obj = new Car(){
            public void drive() { //Anonymous inner class is a class that is defined and instantiated in a single statement
            // it also help for abstarct class bcz inition of abstract method can be done at object level using anonymous inner class
            //no need to create a new class to implement the abstract method of the abstract class
                System.out.println("BMW is driving");
            }   
        };
        obj.drive();
    }
    
}