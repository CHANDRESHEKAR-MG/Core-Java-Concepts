// 1. What is a Lambda Expression?
// A lambda expression is a shorter way to implement a functional interface in Java.
// In simple words, it allows you to write the implementation of a method without creating a separate class or writing a full method declaration.

interface MyInterface {
    void display();
}
interface Calculator {
    int add(int a, int b);
}

//Runnable
// class MyTask implements Runnable {

//     // public void run() {
//     //     System.out.println("Thread is running");
//     // }
// }
// }
// This works, but we created a separate class just to implement run().
// Remember that Runnable is a functional interface because it has one abstract method: run().


// class MyClass implements MyInterface {

//     public void display() {
//         System.out.println("Hello Java");
//     }
// }
// What's happening?
// We performed three steps:
// Created an interface.
// Created a class that implements the interface.
// Created an object and called the method.
// But notice something: we created an entire class just to print "Hello Java".
public class LambdaExpressionInJava{
    public static void main(String[] args) {
        //MyClass obj = new MyClass();

        //using lambda expression 
        MyInterface obj = () -> {
            System.out.println("Hello Java");
        };
        obj.display();

        Calculator c = (a, b) ->{
            return a+b;
        };
         System.out.println(c.add(10, 20));
         //Runnable
//         MyTask task = new MyTask();
            //Lambda Expression
            Runnable task = () -> {
            System.out.println("Thread is running");
        };

        Thread t1 = new Thread(task);

        t1.start();

        //Try Catch Block
        Runnable task1 = () -> {
    try {
        int result = 10 / 0;
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    }
};

Thread t11 = new Thread(task1);
t11.start();

        
// What does () mean?

// It represents the parameters of the method. Because display() has no parameters, the parentheses are empty.

// What does -> mean?

// It is called the lambda operator. It separates the parameters from the method body.

// What does { } mean?

// It contains the code to execute when the method is called.


        
    }
}