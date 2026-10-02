class car{
    public void BMWdrive(){
        System.out.println("Car is driving");
        // here we need to change the implementation of the method without creating or extending the class
        // we can use anonymous inner class to change the implementation of the method
        //from car is driving to car is BMWdriving fast
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args){
        // it means when we need to change the implemtation of method without creating or extending the class
        //we directly create the object of the class and override the method of the class using anonymous inner class
        //Anonymous inner class is a class that is defined and instantiated in a single statement
        //Anonymous inner class is a class that is defined without a name
        //Anonymous inner class is a class that is defined inside a method
        //Anonymous inner class is a class that is defined inside a method and it is used to override the method of the parent class
        //Anonymous inner class is a class that is defined inside a method and it is used to implement the interface

        //Creating an object of the interface using anonymous inner class
        car obj = new car(){ 
            public void BMWdrive(){
            System.out.println("Car is BMW driving fast");
        }
        };
        obj.BMWdrive();
    }
}