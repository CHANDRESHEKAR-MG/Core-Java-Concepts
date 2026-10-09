// What is a Thread in Java?
// A thread is a lightweight unit of execution within a program.
// In simple words, a thread allows a program to execute a task independently of other tasks.


// Imagine you are using YouTube on your laptop.
// At the same time:
// 🎥 One task plays the video.
// 🎵 Another task plays the audio.
// 📥 Another task downloads the video data.

// These tasks can make progress concurrently using different threads.
// Without multiple threads: A program may need to perform tasks one after another.
// With multiple threads: A program can manage multiple tasks concurrently.
// Note: Multithreading doesn't always mean tasks execute at precisely the same time. 
//They may run in parallel on multiple CPU cores or take turns on a single core.

// 2. What is Multithreading?

// Multithreading is the process of executing multiple threads within a single program.
// For example, suppose you want to perform two tasks:

// Print numbers from 1 to 5
// Print letters from A to E.

// Using one thread, you could complete the number-printing task first and then print the letters.
// Using multiple threads, both tasks can make progress concurrently.
// Why do we use multithreading?
// To perform multiple tasks concurrently.
// To improve application responsiveness.
// To use multiple CPU cores when possible.
// To handle background tasks without blocking the main task.
// Examples include web servers, games, downloading files, and background processing.


// 4. Creating a thread in Java
// Java provides two common ways to create a thread:
// Extending the Thread class.
// Implementing the Runnable interface.

// class MyThread{
//     public void show(){
//         System.out.println("in a show ");
//     }
// }

class MyThread extends Thread {//We create a class named MyThread that inherits from Java's Thread class.

    public void run() {//The run() method contains the task that the thread will perform.
       //Can you change run() to another name?
        //System.out.println("Thread is running in run method ");

        //or call the different method name iinside the run method name
        //like 
        display();//op is display method 

    }
    public void display() {
        System.out.println("Thread is running in display method not run");
    }
    

//  Output:Nothing is printed!
// Why?
// When you call:
// t1.start();
// Java starts a new thread, which executes the run() method.
// But you defined display() instead of overriding run(). Therefore, your display() method is not automatically executed.

}
public class ThreadsInJava{
    public static void main (String[] args){
        System.out.println("Hello");
        System.out.println("Java");
        System.out.println("World");
        //op
        // Hello
        // Java
        // World
//  When a Java program starts, the JVM creates the main thread, which executes the main() method.
// The statements in this example execute sequentially on that thread.
// Now, let's create another thread.

MyThread t1 = new MyThread();//We create an object of MyThread.
//At this point, we have created a thread object, but we haven't started a new thread.
        t1.start();//it can start new thread and auto matically executes the run method 
        //Calling start() asks the JVM to start a new thread. That thread then executes the run() method.

        t1.display();

//   obj.start()
//      |
//      v
// A new thread starts
//      |
//      v
// The new thread executes run()
//      |
//      v
// Code inside run() executes
// One important point ⚠️

// You don't need to call run() yourself when you use start().

// obj.start();  // Starts a new thread
// obj.run();    // Direct method call; does not start a new thread
    }
}


// Important difference: start() vs run()
// start()	                                                  run()
// Starts a new thread.	                     Executes the method like a normal method call if called directly.
// The JVM schedules the new thread.     	A direct call does not start a new thread.
// The new thread executes run().	         The current thread executes the method.

// Remember: To start a new thread, call start(), not run() directly.